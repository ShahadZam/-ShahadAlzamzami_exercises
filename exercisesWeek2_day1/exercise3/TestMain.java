package exercisesWeek2_day1.exercise3;

public class TestMain {
    public static void main(String[]args){

        GeometricObject g1 = new Circle(10.0);
        System.out.println(g1);
        System.out.println("Perimeter = "+g1.getPerimeter());
        System.out.println("Area = "+g1.getArea());

        Resizeable g2 = new ResizeableCircle(5.0);
        System.out.println(g2);
        g2.resize(50);
        System.out.println(g2);
    }
}
