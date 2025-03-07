import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double bal = 1234567.0;
        int i;
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            i = s.nextInt();

            switch (i) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    int d = s.nextInt();
                    System.out.println("Your deposit amount is " + d);
                    bal += d;
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    int w = s.nextInt();

                    if (w <= bal) {
                        System.out.println("Your withdrawal amount is " + w);
                        bal -= w;
                    } else {
                        System.out.println("Insufficient funds!");
                    }
                    break;

                case 3:
                    System.out.println("Your total balance is: " + bal);
                    break;

                case 4:
                    System.out.println("Exiting ATM...");
                    break;

                default:
                    System.out.println("Invalid option! Please choose between 1-4.");
            }

            if (i == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            }
        }
    }
}
