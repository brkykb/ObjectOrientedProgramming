public class CommissionEmployee extends Employee {
    private int grossSales;
    private int commissionRate;


    public CommissionEmployee(String firstName,String lastName,int socialSecurityNumber,int grossSales,int commissionRate){
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    @Override
    double earning() {
        return commissionRate * grossSales;
    }
    @Override
    public String toString() {
        return super.toString()+"\nCommission Rate: "+this.commissionRate+"\nGross Sales:"+this.grossSales;
    }
}
