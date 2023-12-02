public class Cylinder extends Circle {

        private double height=1.0;

        public Cylinder(){
            this(0.1,1,"red");
        }
        public Cylinder(double height){
            this.height=height;
        }
        public Cylinder(double height,double radius){
            super(radius);
            this.height=height;
        }

        public Cylinder(double height,double radius,String color){
            super(radius,color);
            this.height=height;
        }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
            return getArea()*height;
    }

    public String toString() {
        return "Color: "+getColor()+"Radius: "+getRadius()+"Height: "+getHeight()+"Cylinder Volume: "+getVolume();
    }
}
