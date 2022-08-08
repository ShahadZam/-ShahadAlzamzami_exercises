package day2.exercises.ex3;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float px, float py,float pz) {
        setX(px);
        setY(py);
        setZ(pz);
    }

    public float[] getXYZ(){
        float xyz[]={super.getX(),super.getY(),z};
        return xyz;
    }

    @Override
    public String toString() {
        return "Point3D{" +"x=" + super.getX() +"y=" + super.getY() +
                " z=" + z +
                '}';
    }
}
