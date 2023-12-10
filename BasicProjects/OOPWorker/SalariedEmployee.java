public class SalariedEmployee extends Employee{
    private int socialSecurityNumber;
    private int weeklySalary;

    public SalariedEmployee(String firstName,String lastName,int socialSecurityNumber,int weeklySalary){
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }

    @Override
    double earning() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString()+this.socialSecurityNumber+"\nWeekly Salary:"+weeklySalary;
    }
}
