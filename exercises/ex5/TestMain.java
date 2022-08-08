package day2.exercises.ex5;

public class TestMain {

    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(1,1,  3,5,  6,2);
        System.out.println( t1 +"\n It is "+ t1.printType() +" and the perimeter= "+t1.getPerimeter());
        }
}
