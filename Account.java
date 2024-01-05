import java.util.Scanner;
public class Account {
    private int cardNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;
    Scanner keyboard = new Scanner(System.in);
    public Account(){
        checkingBalance = 0;
        savingBalance = 0;
    }
    public void setCardNumber(int cardNumber){
        this.cardNumber = cardNumber;
    }
    public int getCardNumber(){
        return cardNumber;
    }
    public void setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public double AmountCheckingWithdraw(double amount){
        checkingBalance -= amount;
        return checkingBalance;
    }
    public double AmountSavingWithdraw(double amount){
        savingBalance -= amount;
        return savingBalance;
    }
    public double AmountCheckingDeposit(double amount){
        checkingBalance += amount;
        return checkingBalance;
    }
    public double AmountSavingDeposit(double amount){
        savingBalance += amount;
        return savingBalance;
    }
    public void checkingWithdrawInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Enter the amount you would like to withdraw from you Checking Account: ");
        double amount = keyboard.nextDouble();

        if ((checkingBalance-amount) >= 0){
            AmountCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + checkingBalance);
        }
        else{
            System.out.println("Checking Account Balance cannot be negative. ");
        }
    }

    public void savingWithdrawInput(){
        System.out.println("Saving Account Balance: $ " + savingBalance);
        System.out.println("Enter the amount you would like to withdraw from you Saving Account: ");
        double amount = keyboard.nextDouble();

        if ((savingBalance-amount) >= 0){
            AmountSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: $ " + savingBalance);
        }
        else{
            System.out.println("Saving Account Balance cannot be negative. ");
        }
    }
    public void checkingDepositInput(){
        System.out.println("Checking Account Balance: $ " + checkingBalance);
        System.out.println("Enter the amount you would like to deposit into your Checking Account: ");
        double amount = keyboard.nextDouble();

        if ((checkingBalance+amount) >= 0){
            AmountCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: $ " + checkingBalance);
        }
        else{
            System.out.println("Checking Account Balance cannot be negative. ");
        }
    }

    public void savingDepositInput(){
        System.out.println("Saving Account Balance: $ " + savingBalance);
        System.out.println("Enter the amount you would like to deposit into your Saving Account: ");
        double amount = keyboard.nextDouble();

        if ((savingBalance+amount) >= 0){
            AmountSavingDeposit(amount);
            System.out.println("New Saving Account Balance: $ " + savingBalance);
        }
        else{
            System.out.println("Saving Account Balance cannot be negative. ");
        }
    }



}
