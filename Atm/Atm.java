import java.util.Scanner;
public class Atm   {
    public static void main(String[] args) {
        // ATM functionality would be implemented here
        int balance = 1000; // Example balance
        int option;
        int withdrawAmount;

        do{
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Your balance is: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdrawAmount = scanner.nextInt();
                    if(withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have withdrawn: $" + withdrawAmount);
                        System.out.println("New balance is: $" + balance);
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    System.out.println("You have deposited: $" + depositAmount);
                    System.out.println("New balance is: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }




        }while(option != 4);

    }
}
