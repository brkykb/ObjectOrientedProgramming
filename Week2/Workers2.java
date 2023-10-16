import java.util.Scanner;

public class Workers2{

    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours ;

    public void displayInfo(){
        System.out.printf("Name: %s\n",name);
        System.out.printf("Social Security Number: %d\n",socialSecurityNumber);
    }

    public void displaySalary(){
        System.out.printf("Salary:%f\n",wage*workingHours);
    }

    public static void main(String[] args){

        Workers2 worker=new Workers2();

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        worker.name = scanner.nextLine();

        System.out.println("Enter your social number:");
        worker.socialSecurityNumber=scanner.nextInt();

        System.out.println("Enter your wage: ");
        worker.wage=scanner.nextFloat();

        System.out.println("Enter your working hours: ");
        worker.workingHours=scanner.nextInt();
        

        worker.displayInfo();
        worker.displaySalary();
    }
}