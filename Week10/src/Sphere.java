public class Sphere extends Shape3D {
   public Sphere(int depth, double radius) {
      super((double)depth, radius);
   }

   public double getVolume() {
      return 4.1866666666666665D * this.radius * this.radius * this.radius;
   }

   public double getArea() {
      return 12.56D * this.radius * this.radius;
   }
}
