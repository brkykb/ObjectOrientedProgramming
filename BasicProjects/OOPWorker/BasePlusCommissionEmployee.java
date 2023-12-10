public class BasePlusCommissionEmployee extends CommissionEmployee{
    private int baseSalary;

    public BasePlusCommissionEmployee(String firstName,String lastName,int SocialSecurityNumber,int grossSales,int commissionRate,int baseSalary){
        super(firstName,lastName,SocialSecurityNumber,grossSales,commissionRate);
        this.baseSalary=baseSalary;
    }

    @Override
    double earning() {

        return super.earning()+this.baseSalary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nBase Salary:"+baseSalary;
    }


}
