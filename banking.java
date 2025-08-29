<<<<<<< HEAD
import java.util.Scanner;

class Account {
    private String name;
    private int accountNo;
    private String type;
    private double balance;

    // Constructor to initialize account
    Account(Scanner sc) {
        System.out.print("Enter Account Holder's Name: ");
        name = sc.next();
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        System.out.print("Enter Account type (SAVING/CURRENT): ");
        type = sc.next();
        System.out.print("Enter BALANCE (INR): ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " INR Deposited Successfully.");
    }

    void withdraw(Scanner sc) {
        System.out.println("Current Balance = " + balance);
        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();
        if (amt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amt;
            System.out.println(amt + " INR Withdrawn Successfully.");
        }
    }

    void detail() {
        System.out.println("NAME = " + name);
        System.out.println("ACCOUNT Number = " + accountNo);
        System.out.println("ACCOUNT Type = " + type);
        System.out.println("BALANCE = " + balance);
    }
}

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        Account acc = new Account(sc);

        int choice;
        do {
            System.out.println("\n---- Banking Menu ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;
                case 2:
                    acc.withdraw(sc);
                    break;
                case 3:
                    acc.detail();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
=======
import java.util.Scanner;

class Account {
    private String name;
    private int accountNo;
    private String type;
    private double balance;

    // Constructor to initialize account
    Account(Scanner sc) {
        System.out.print("Enter Account Holder's Name: ");
        name = sc.next();
        System.out.print("Enter Account Number: ");
        accountNo = sc.nextInt();
        System.out.print("Enter Account type (SAVING/CURRENT): ");
        type = sc.next();
        System.out.print("Enter BALANCE (INR): ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " INR Deposited Successfully.");
    }

    void withdraw(Scanner sc) {
        System.out.println("Current Balance = " + balance);
        System.out.print("Enter Withdraw Amount: ");
        double amt = sc.nextDouble();
        if (amt > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amt;
            System.out.println(amt + " INR Withdrawn Successfully.");
        }
    }

    void detail() {
        System.out.println("NAME = " + name);
        System.out.println("ACCOUNT Number = " + accountNo);
        System.out.println("ACCOUNT Type = " + type);
        System.out.println("BALANCE = " + balance);
    }
}

public class banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account
        Account acc = new Account(sc);

        int choice;
        do {
            System.out.println("\n---- Banking Menu ----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Account Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;
                case 2:
                    acc.withdraw(sc);
                    break;
                case 3:
                    acc.detail();
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
>>>>>>> 8932b02 (updated)
