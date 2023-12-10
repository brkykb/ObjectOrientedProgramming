public class Main {

        public static void main(String[] args){
            Employee e1=new SalariedEmployee("Berkay","Karabulut",2110206009,30000);
            Employee e2=new HourlyEmployee("adsfasf","asdfasdf",1231,1112,12);
            Employee e3=new CommissionEmployee("fsadasd","adasda",1222,312,30);
            Employee e4=new BasePlusCommissionEmployee("asad","fdsdf",456,343,667,654);

            Employee[] employees=new Employee[]{e1,e2,e3,e4};

            for(Employee a: employees){
                System.out.println(a+"\nSalary:"+a.earning());
            }
        }
}
