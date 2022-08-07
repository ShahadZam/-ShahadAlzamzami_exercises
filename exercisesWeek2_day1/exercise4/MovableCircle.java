package exercisesWeek2_day1.exercise4;

public class MovableCircle {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed,  int radius) {
        center= new MovablePoint(x, y, xSpeed, ySpeed);

        this.radius=radius;
    }

    public void moveUp() {
        center.y -= center.ySpeed;
    }

    public void moveDown() {
        center.y += center.ySpeed;
    }

    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    public void moveRight() {
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return  "("+center.x +
                "," + center.y +")"+
                ", Speed=( " + center.xSpeed +
                "," + center.ySpeed +
                ") ,radius="+radius;
    }
}
