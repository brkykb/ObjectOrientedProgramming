public class Circle {

    private static final double pi=3.141519;
    private double radius;

    public Circle(double radius){

        this.radius=radius;
    }

    public static double computeArea(double radius){
        double last;

        last=pi*radius*radius;
        return last;
    }

    public static void main(String args[]){

        double a[]= new double[3];
        int i;

        Circle radius1 = new Circle(5);
        a[0]=computeArea(radius1.radius);
        Circle radius2 = new Circle(10);
        a[1]=computeArea(radius2.radius);
        Circle radius3 = new Circle(15);
        a[2]=computeArea(radius3.radius);

        for(i=0;i<3;i++){
            System.out.println((i+1)+" Circle:"+a[i]+"\n");
        }
    }
}
