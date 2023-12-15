public class TestMain {
   public static void main(String[] args) {
      Shape2D obj1 = new Circle(2.0D);
      Shape2D obj2 = new Square(3.0D);
      Shape2D obj3 = new Rectangle(4.0D, 5.0D);
      Shape3D obj4 = new Cylinder(3.0D, 6.0D);
      Shape3D obj5 = new Sphere(5, 5.0D);
      Shape3D obj6 = new Pyramid(2, 5, 3);
      Shape3D obj7 = new Cone(4.0D, 5.0D);
      Shape2D[] a = new Shape2D[]{obj1, obj2, obj3};
      Shape3D[] b = new Shape3D[]{obj4, obj5, obj6, obj7};
      Shape2D[] var10 = a;
      int var11 = a.length;

      int var12;
      String className;
      for(var12 = 0; var12 < var11; ++var12) {
         Shape2D c = var10[var12];
         className = c.getClass().getName();
         System.out.println(className + " " + c.toString());
      }

      Shape3D[] var15 = b;
      var11 = b.length;

      for(var12 = 0; var12 < var11; ++var12) {
         Shape3D d = var15[var12];
         className = d.getClass().getName();
         System.out.println(className + " " + d.toString());
      }

   }
}
