
import java.util.Scanner;

public class BankManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Deposit Successful!");
                        System.out.println("Updated Balance: Rs. " + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid withdrawal amount!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: Rs. " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

Sample Output
------------------
This is the Example: Deposit ₹500, withdraw ₹200, then check balance.
------------------------------------------------------------------------
===== BANK MANAGEMENT SYSTEM =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 2

Enter deposit amount: Rs. 500
Deposit Successful!
Updated Balance: Rs. 1500.0

===== BANK MANAGEMENT SYSTEM =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 3

Enter withdrawal amount: Rs. 200
Withdrawal Successful!
Remaining Balance: Rs. 1300.0

===== BANK MANAGEMENT SYSTEM =====
1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit
Enter your choice: 1

Current Balance: Rs. 1300.0
