package exercises_day4;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x, y};
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distance(int x,int y){
        return Math.sqrt((y - this.y) * (y - this.y) + (x - this.x) * (x - this.x));
    }

    public double distance(MyPoint another){
        return Math.sqrt((another.y - this.y) * (another.y - this.y) +
                (another.x - this.x) * (another.x - this.x));
    }


    public double distance(){
        return Math.sqrt((-y) * (-y) + (-x) * (-x));
    }

    @Override
    public String toString() {
        return
                "(" + x +
                "," + y +
                ')';
    }
}
