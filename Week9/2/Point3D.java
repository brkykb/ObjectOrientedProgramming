public class Point3D extends Point2D {
    private int z=0;
    public Point3D(){
        this(5,6,7);
    }

    public Point3D(int x,int y,int z){
        super(x,y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(x,y,z)=("+getX()+","+getY()+","+getZ()+")";
    }
}
