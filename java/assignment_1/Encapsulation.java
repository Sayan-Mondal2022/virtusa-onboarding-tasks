class BankAccount{
    private String accNo;
    private String name;
    private double balance;

    public BankAccount(String accNo, String name, double balance){
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    // Getter
    public double getBalance(){
        return balance;
    }

    // Deposit (controlled modification)
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful");
        }else{
            System.out.println("Invalid amount");
        }
    }

    // Withdraw
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful");
        }else{
            System.out.println("Invalid withdrawal");
        }
    }

    public void display(){
        System.out.println("\nAccount No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Encapsulation{
    public static void main(String[] args){
        BankAccount acc = new BankAccount("12345", "Sayan", 1000);

        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("Balance: " + acc.getBalance());

        acc.display();
    }
}