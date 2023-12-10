import java.util.Scanner;


public class Hospital {

    public static void main(String args[]){
        int counter;
        int i;
        String name;
        Patient[] p=new Patient[4];

        Scanner scanner= new Scanner(System.in);
        for(i=0;i<4;i++){
            System.out.println("Enter name: ");
            name=scanner.nextLine();
            p[i]=new Patient(name,(i+1));
        }

        for(i=0;i<4;i++){
            System.out.println(p[i].toString());
        }
    }



}
