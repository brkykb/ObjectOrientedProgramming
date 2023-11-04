import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    private int number;

    public void nums(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Exception num = new Exception();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter number: ");
            int inputNumber = scanner.nextInt();
            num.nums(inputNumber);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}
