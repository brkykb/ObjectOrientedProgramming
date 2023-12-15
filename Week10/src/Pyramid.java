public class Pyramid extends Shape3D {
   public Pyramid(int depth, int height, int width) {
      super((double)depth, (double)height, (double)width);
   }

   public double getVolume() {
      return this.depth * this.height * this.width * 0.33D;
   }

   public double getArea() {
      return this.depth * this.width + this.depth * Math.sqrt(this.width / 2.0D * (this.width / 2.0D) + this.height * this.height) + this.width * Math.sqrt(this.depth / 2.0D * (this.depth / 2.0D) + this.height * this.height);
   }
}
