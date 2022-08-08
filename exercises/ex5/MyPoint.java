package day2.exercises.ex5;

public class MyPoint {
    private int x;
    private int y;

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

    public double distance(MyPoint myPoint1) {
        int xDiff = this.x - myPoint1.getX();
        int yDiff = this.y - myPoint1.getY();
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
