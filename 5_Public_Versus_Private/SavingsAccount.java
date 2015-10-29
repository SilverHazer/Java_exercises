public class SavingsAccount {
    
    private int balance;
    
    public SavingsAccount() {
        balance = 0;
    }
    
    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }
    
    public void greet() {
        System.out.println("Welcome! take a seat and shut up.");
    }
    
    public void showBalance() {
        System.out.println("Your balance is: " + balance);
    }
    
    public void deposit(int howMuch) {      
        if (howMuch < 0) {
            System.out.println("Amount given is negative..");
        }
        else {
            balance = balance + howMuch;
        }
    }
    
    public void withdraw(int howMuch) {   
        if (howMuch < 0) {
            System.out.println("Amount given is negative..");
        }
        else {
            balance = balance - howMuch;
        }
    }
}
