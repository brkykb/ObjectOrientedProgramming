public class Circle {
        private double radius =1.0;
        private String color ="red";

        public Circle(){
                this(0.1,"red");
        }

        public Circle(double radius){
                this.radius=radius;
        }
        public Circle(double radius,String color){
                this.radius=radius;
                this.color=color;
        }

        public double getRadius() {

                return radius;
        }

        public void setRadius(double radius) {
                this.radius = radius;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public double getArea(){
                return radius*radius*3.14;
        }
        public String toString() {
                return "Color: "+getColor()+"Radius: "+getRadius()+"Circle Area: "+getArea();
        }
}

