package day2.exercises.ex3;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {}

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float px, float py) {
        setX(px);
        setY(py);
    }

    public float[] getXY(){
        float xy[]={x,y};
        return xy;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
