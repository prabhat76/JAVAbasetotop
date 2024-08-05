package methodoverlaoding;
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to be overridden
    double calculateInterest() {
        return balance * 0.01; // Default interest rate of 1%
    }
}

// Subclass for savings accounts
class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    // Overriding to provide specific interest calculation for savings accounts
    @Override
    double calculateInterest() {
        return balance * 0.02; // Savings accounts have a 2% interest rate
    }
}

// Subclass for checking accounts
class CheckingAccount extends BankAccount {
    CheckingAccount(double balance) {
        super(balance);
    }

    // Overriding to provide specific interest calculation for checking accounts
    @Override
    double calculateInterest() {
        return balance * 0.005; // Checking accounts have a 0.5% interest rate
    }
}
public class methodoverriding {
    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount(1000);
        BankAccount checking = new CheckingAccount(1000);

        // Calculate interest using overridden methods
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Checking Account Interest: " + checking.calculateInterest());
    }
}
