<<<<<<< HEAD
def sai_mini_project(initial_balance, operations):
    balance = initial_balance
    transactions = []  # store (type, amount, committed)
    commits = []       # store balance after each commit
    output = []

    for op in operations:
        parts = op.split()

        if parts[0] == "read":
            output.append(balance)

        elif parts[0] == "credit":
            amount = int(parts[1])
            balance += amount
            transactions.append(("credit", amount, False))

        elif parts[0] == "debit":
            amount = int(parts[1])
            balance -= amount
            transactions.append(("debit", amount, False))

        elif parts[0] == "abort":
            tnum = int(parts[1]) - 1
            if 0 <= tnum < len(transactions):
                op_type, amount, committed = transactions[tnum]
                if not committed:  # only undo if not committed
                    if op_type == "credit":
                        balance -= amount
                    else:  # debit
                        balance += amount
                    transactions[tnum] = (op_type, amount, True)  # mark as cancelled

        elif parts[0] == "rollback":
            cnum = int(parts[1]) - 1
            if 0 <= cnum < len(commits):
                balance = commits[cnum]

        elif parts[0] == "commit":
            # mark all as committed
            for i in range(len(transactions)):
                ttype, amt, committed = transactions[i]
                if not committed:
                    transactions[i] = (ttype, amt, True)
            commits.append(balance)

    return output


# Example 1
initial = 90
ops = [
    "read",
    "credit 10",
    "debit 12",
    "debit 8",
    "credit 7",
    "abort 1",
    "commit",
    "read"
]
print(sai_mini_project(initial, ops))  # [90, 77]

# Example 2
initial = 43
ops = [
    "credit 12",
    "debit 10",
    "commit",
    "abort 1",
    "read",
    "credit 30",
    "debit 4",
    "rollback 1",
    "commit",
    "read"
]
print(sai_mini_project(initial, ops))  # [45, 45]
=======
def sai_mini_project(initial_balance, operations):
    balance = initial_balance
    transactions = []  # store (type, amount, committed)
    commits = []       # store balance after each commit
    output = []

    for op in operations:
        parts = op.split()

        if parts[0] == "read":
            output.append(balance)

        elif parts[0] == "credit":
            amount = int(parts[1])
            balance += amount
            transactions.append(("credit", amount, False))

        elif parts[0] == "debit":
            amount = int(parts[1])
            balance -= amount
            transactions.append(("debit", amount, False))

        elif parts[0] == "abort":
            tnum = int(parts[1]) - 1
            if 0 <= tnum < len(transactions):
                op_type, amount, committed = transactions[tnum]
                if not committed:  # only undo if not committed
                    if op_type == "credit":
                        balance -= amount
                    else:  # debit
                        balance += amount
                    transactions[tnum] = (op_type, amount, True)  # mark as cancelled

        elif parts[0] == "rollback":
            cnum = int(parts[1]) - 1
            if 0 <= cnum < len(commits):
                balance = commits[cnum]

        elif parts[0] == "commit":
            # mark all as committed
            for i in range(len(transactions)):
                ttype, amt, committed = transactions[i]
                if not committed:
                    transactions[i] = (ttype, amt, True)
            commits.append(balance)

    return output


# Example 1
initial = 90
ops = [
    "read",
    "credit 10",
    "debit 12",
    "debit 8",
    "credit 7",
    "abort 1",
    "commit",
    "read"
]
print(sai_mini_project(initial, ops))  # [90, 77]

# Example 2
initial = 43
ops = [
    "credit 12",
    "debit 10",
    "commit",
    "abort 1",
    "read",
    "credit 30",
    "debit 4",
    "rollback 1",
    "commit",
    "read"
]
print(sai_mini_project(initial, ops))  # [45, 45]
>>>>>>> de28dc5 (new update)
