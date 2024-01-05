import java.util.Scanner;

public class Main {
    private Account userAccount;
    private Scanner keyboard;

    public Main() {
        userAccount = new Account();
        keyboard = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.displayWelcomeMessage();
    }
    public void displayWelcomeMessage() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to Pamela's ATM machine project!  ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Enter your card number: ");
        int cardNumber = keyboard.nextInt();
        userAccount.setCardNumber(cardNumber);
        System.out.println("Enter your PIN number: ");
        int pinNumber = keyboard.nextInt();
        userAccount.setPinNumber(pinNumber);
        HashMap<Integer, Integer> data = new HashMap<>();
        displayAccountOptions();
    }


    public void displayAccountOptions() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Select the account you want to access. ");
        System.out.println("Type 1 - Checking Account ");
        System.out.println("Type 2 - Saving Account ");
        System.out.println("Type 3 - Exit ");
        System.out.println("Choice: ");
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                displayChecking();
                break;
            case 2:
                displaySaving();
                break;
            case 3:
                System.out.println("Thank you for using Pamela's ATM machine project. Goodbye!");
                break;
            default:
                System.out.println("ERROR. You've entered a invalid choice. ");
                displayAccountOptions();
        }
    }
    public void displayChecking(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Checking Account Balance: $ " + userAccount.getCheckingBalance());
                displayAccountOptions();
                break;
            case 2:
                userAccount.checkingWithdrawInput();
                displayAccountOptions();
                break;
            case 3:
                userAccount.checkingDepositInput();
                displayAccountOptions();
                break;
            case 4:
                System.out.println("Thank you for using Pamela's ATM machine project. Goodbye!");
                break;
            default:
                System.out.println("ERROR. You've entered a invalid choice. ");
                displayChecking();
        }
    }
    public void displaySaving(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Saving Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");
        int choice = keyboard.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Saving Account Balance: $ " + userAccount.getSavingBalance());
                displayAccountOptions();
                break;
            case 2:
                userAccount.savingWithdrawInput();
                displayAccountOptions();
                break;
            case 3:
                userAccount.savingDepositInput();
                displayAccountOptions();
                break;
            case 4:
                System.out.println("Thank you for using Pamela's ATM machine project. Goodbye!");
                break;
            default:
                System.out.println("ERROR. You've entered a invalid choice. ");
                displaySaving();
        }
    }
}
