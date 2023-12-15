public abstract class Shape3D extends Shape2D {
   double depth;

   public Shape3D(double depth, double height, double width) {
      super(height, width);
      this.depth = depth;
   }

   public Shape3D(double height, double radius) {
      super(radius);
      this.height = height;
   }

   public abstract double getVolume();

   public String toString() {
      double var10000 = this.getVolume();
      return "Volume:" + var10000 + "  Area:" + this.getArea();
   }
}
