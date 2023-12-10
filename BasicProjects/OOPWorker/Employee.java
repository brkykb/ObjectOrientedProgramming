public abstract class Employee {

    private String firstName;
    private String lastName;
    private int socialSecurityNumber;

    public Employee(String firstName,String lastName,int socialSecurityNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;


    }

    @Override
    public String toString() {
        return "\n\nName:"+firstName+"\nSurname:"+lastName+"\nSSN:"+socialSecurityNumber;
    }

    abstract double earning();
}
