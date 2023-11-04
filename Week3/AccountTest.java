import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
            Account account = new Account("Berkay", 4000, 1111);

        System.out.println("Amount: " + account.getBalance());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the money: ");
        int amount = scanner.nextInt();
        account.add(amount);

        System.out.println("Amount: " + account.getBalance());

        System.out.print("Write the amount to withdraw: ");
        amount = scanner.nextInt();
        account.withdraw(amount);

        System.out.println("Amount: " + account.getBalance());
    }
}
