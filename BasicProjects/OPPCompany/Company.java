enum CompanyName{
    APPLE,MICROSOFT,GOOGLE,IBM,AKINSOFT;
}

public class Company {
    private Employee[] employee;
    private CompanyName companyName;


    public Company(Employee[] e,CompanyName c){
        this.employee=e;
        this.companyName=c;
    }

    public Employee[] getEmployee(){
            return employee;
    }

    public CompanyName getCompanyName(){
            return companyName;
    }
}


