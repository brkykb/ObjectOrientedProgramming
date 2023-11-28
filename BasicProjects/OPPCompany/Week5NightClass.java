public class Week5NightClass {
        public static void main(String[] args){
                Employee e1=new Employee(13,"Ahmet");
                Employee e2=new Employee(15,"Mehmet");
                Employee[] emp={e1,e2};

                Company comp=new Company(emp,CompanyName.GOOGLE);

                for(Employee e:  comp.getEmployee()){
                        System.out.println("Name:"+e.getName()+"  Company:"+comp.getCompanyName());
                }


        }
}
