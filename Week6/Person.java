public class Person {

    private static int idd=0;
    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public Person(int id,String firstName,String lastName,int age){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String firstName,String lastName){
        this.id=idd++;
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=0;

    }

    public Person(int id){
        this.id=id;
        this.firstName="DefaultName";
        this.lastName="DefaultSurname";
        this.age=0;
    }

    public Person(){
        this.id=idd++;
        this.firstName="DefaultName";
        this.lastName="DefaultSurname";
        this.age=0;
    }


}
