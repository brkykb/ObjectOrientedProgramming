import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private int pin;
    public Account(String ownerName, double balance, int pin){
        this.ownerName = ownerName;
        if(balance > 0.0)
            this.balance=balance;
        if(pin>999&&pin<10000)
            this.pin=pin;

    }
    public void add(double amount){
        if(amount>0.0){
            balance+=amount;
            System.out.println(amount + "added .");
        }
    }
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("Not enough money.");
        }

        if (!checkPin()) {
            System.out.println("Your account has blocked.");
            return;
        }
        else {
            balance -= amount;
            System.out.println("Withdrawed " + amount + "$ from your account.");
        }
    }

    public boolean checkPin(){
        int tries = 3;
        System.out.print("Enter your password: ");
        Scanner scanner = new Scanner(System.in);
        while (tries > 0) {
            int pw = scanner.nextInt();
            if (pw == pin)
                return true;
            else {
                tries--;
                System.out.print("Wrong password! " + tries + " tries left.\n");
            }
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
