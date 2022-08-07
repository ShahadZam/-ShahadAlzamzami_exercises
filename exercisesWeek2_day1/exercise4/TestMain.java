package exercisesWeek2_day1.exercise4;

public class TestMain {

    public static void main(String[] args) {
        MovablePoint movable1 = new MovablePoint(5, 6, 10, 10);
        System.out.println(movable1);
        movable1.moveLeft();
        System.out.println(movable1);

        MovableCircle movable2 =  new MovableCircle(2,1,2,2,10);
        System.out.println(movable2);
        movable2.moveRight();
        System.out.println(movable2);
    }
}
