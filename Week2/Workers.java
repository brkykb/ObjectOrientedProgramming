public class Workers{

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

        Workers worker=new Workers();


        
        worker.name="Ahmet";
        worker.socialSecurityNumber=1234;
        worker.wage=40000;
        worker.workingHours=25;




        worker.displayInfo();
        worker.displaySalary();
    }
}