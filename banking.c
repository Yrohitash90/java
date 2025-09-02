#include <stdio.h>
#include <string.h>

#define MAX_OPS 100
#define MAX_COMMITS 100

typedef struct {
    char type[10]; // "credit" / "debit"
    int amount;
    int committed; // 0 = not committed, 1 = committed (or aborted)
} Transaction;

int main() {
    int initial_balance, N;
    scanf("%d", &initial_balance);
    scanf("%d", &N);

    int balance = initial_balance;
    Transaction transactions[MAX_OPS];
    int trans_count = 0;

    int commits[MAX_COMMITS];
    int commit_count = 0;

    for (int i = 0; i < N; i++) {
        char op[20];
        scanf("%s", op);

        if (strcmp(op, "read") == 0) {
            printf("%d\n", balance);
        }
        else if (strcmp(op, "credit") == 0) {
            int amt;
            scanf("%d", &amt);
            balance += amt;
            strcpy(transactions[trans_count].type, "credit");
            transactions[trans_count].amount = amt;
            transactions[trans_count].committed = 0;
            trans_count++;
        }
        else if (strcmp(op, "debit") == 0) {
            int amt;
            scanf("%d", &amt);
            balance -= amt;
            strcpy(transactions[trans_count].type, "debit");
            transactions[trans_count].amount = amt;
            transactions[trans_count].committed = 0;
            trans_count++;
        }
        else if (strcmp(op, "abort") == 0) {
            int tnum;
            scanf("%d", &tnum);
            tnum--; // 0-based index
            if (tnum >= 0 && tnum < trans_count) {
                if (transactions[tnum].committed == 0) { // only undo if not committed
                    if (strcmp(transactions[tnum].type, "credit") == 0) {
                        balance -= transactions[tnum].amount;
                    } else {
                        balance += transactions[tnum].amount;
                    }
                    transactions[tnum].committed = 1; // mark as cancelled
                }
            }
        }
        else if (strcmp(op, "rollback") == 0) {
            int cnum;
            scanf("%d", &cnum);
            cnum--; // 0-based
            if (cnum >= 0 && cnum < commit_count) {
                balance = commits[cnum];
            }
        }
        else if (strcmp(op, "commit") == 0) {
            // mark all uncommitted as committed
            for (int j = 0; j < trans_count; j++) {
                transactions[j].committed = 1;
            }
            commits[commit_count++] = balance;
        }
    }

    return 0;
}
