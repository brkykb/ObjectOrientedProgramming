public class Cylinder extends Shape3D {
   public Cylinder(double height, double radius) {
      super(height, radius);
   }

   public double getArea() {
      return this.radius * this.radius * 3.14D * 2.0D + 6.28D * this.radius * this.height;
   }

   public double getVolume() {
      return this.radius * this.radius * 3.14D * this.height;
   }
}
