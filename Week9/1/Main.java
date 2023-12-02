public class Main {
    public static void main(String[] args){

        Circle[] circle=new Circle[3];

        circle[0]=new Circle();
        circle[1]=new Circle(2);
        circle[2]=new Circle(3,"blue");

        Cylinder[] cylinder=new Cylinder[4];

        cylinder[0]=new Cylinder();
        cylinder[1]=new Cylinder(10);
        cylinder[2]=new Cylinder(20,6);
        cylinder[3]=new Cylinder(30,5,"blue");

        for(Circle a: circle){
            System.out.println(a.toString());
        }

        for(Cylinder b: cylinder){
            System.out.println(b.toString());
        }
    }
}
