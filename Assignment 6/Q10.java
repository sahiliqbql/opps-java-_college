// 10.Create an abstract class Accounts with the following details:
//    Data Members: Balance (b) accountNumber (c) accountHoldersName (d) address
//    Methods: withdrawl()abstract , (b) deposit()abstract , (c) display() 
//    to show the balance of the account number
//    Create a subclass of this class SavingsAccount and add the following details:
//    Data Members: (a) rateOfInterest
//    Methods: (a) calculateAount()


abstract class Accounts {
    double balance;
    int accountNumber;
    String accountHolderName;
    String address;

    Accounts(double balance, int accountNumber, String accountHolderName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    abstract void withdrawal(double amount);

    abstract void deposit(double amount);

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double rateOfInterest;

    SavingsAccount(double balance, int accountNumber, String accountHolderName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHolderName, address);
        this.rateOfInterest = rateOfInterest;
    }

    void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);
    }

    void calculateAmount() {
        double interest = (balance * rateOfInterest) / 100;
        System.out.println("Interest Amount: " + interest);
    }
}

public class Q10 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(10000, 123456, "John Doe", "123 Street, NY", 5);
        acc.display();
        acc.deposit(2000);
        acc.withdrawal(1500);
        acc.calculateAmount();
    }
}


// Account Number: 123456
// Account Holder: John Doe
// Balance: 10000.0
// Deposit successful. New Balance: 12000.0
// Withdrawal successful. New Balance: 10500.0
// Interest Amount: 525.0
