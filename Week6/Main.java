public class Main {
    public static void Main(String[] args){

        Person person1=new Person(1,"Berkay","Karabulut",20);
        System.out.println(person1.toString());

        Person person2=new Person("Ahmet","Kartal");
        System.out.println(person2.toString());

        Person person3=new Person(3);
        System.out.println(person3.toString());

        Person person4=new Person();
        System.out.println(person4.toString());


    }
}
