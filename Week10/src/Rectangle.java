public class Rectangle extends Shape2D {
   public Rectangle(double height, double width) {
      super(height, width);
   }

   public double getArea() {
      return this.height * this.width / 2.0D;
   }
}
