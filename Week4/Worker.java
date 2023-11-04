import java.util.Scanner;

public class Worker {

    private static int counter = 0;
    private String name;
    private int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int salary;

        try {
            System.out.println("İsim giriniz:");
            name = scanner.nextLine();
            System.out.println("Kazanc giriniz:");
            salary = scanner.nextInt();

            scanner.nextLine();

            if (salary < 0) {
                throw new Exception("Salary can't be less than zero");
            } else {
                Worker worker1 = new Worker(name, salary);
                worker1.setName(name);
                worker1.setSalary(salary);
            }


            System.out.println("İsim giriniz:");
            name = scanner.nextLine();
            System.out.println("Kazanc giriniz:");
            salary = scanner.nextInt();
            scanner.nextLine();

            if (salary < 0) {
                throw new Exception("Salary can't be less than zero");
            } else {
                Worker worker2 = new Worker(name, salary);
                worker2.setName(name);
                worker2.setSalary(salary);
            }


            System.out.println("İsim giriniz:");
            name = scanner.nextLine();
            System.out.println("Kazanc giriniz:");
            salary = scanner.nextInt();
            scanner.nextLine();

            if (salary < 0) {
                throw new Exception("Salary can't be less than zero");
            } else {
                Worker worker3 = new Worker(name, salary);
                worker3.setName(name);
                worker3.setSalary(salary);
            }

        } catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("Toplam worker sayısı: " + counter);
    }
}
