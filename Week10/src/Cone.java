public class Cone extends Shape3D {
   public Cone(double height, double radius) {
      super(height, radius);
   }

   public double getVolume() {
      return 3.14D * this.radius * this.radius * this.height * 0.33D;
   }

   public double getArea() {
      return 3.14D * this.radius * this.radius + 6.28D * this.radius * this.height;
   }
}
