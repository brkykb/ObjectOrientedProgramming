public class HourlyEmployee extends Employee{
    private int wage;
    private int hours;

    public HourlyEmployee(String firstName,String lastName,int socialSecurityNumber,int wage,int hours){
        super(firstName,lastName,socialSecurityNumber);
        this.wage=wage;
        this.hours=hours;
    }


    @Override
    double earning() {
        if (hours<=40)
            return wage*hours;

        if (hours>40)
            return 40*wage+(hours-40)*wage*1.5;

        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\nWage:"+this.wage+"\nHours:"+this.hours;
    }
}
