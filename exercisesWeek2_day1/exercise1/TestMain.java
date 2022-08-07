package exercisesWeek2_day1.exercise1;

public class TestMain {

    public static void main(String[]args){

        Circle circle1=new Circle(5,"red");
        System.out.println(circle1);
        System.out.println("area="+circle1.getArea());

        Cylinder cylinder1=new Cylinder(5,2,"green");
        System.out.println(cylinder1);
        System.out.println("Area="+cylinder1.getArea());
        System.out.println("volume="+cylinder1.getVolume());
    }
}
