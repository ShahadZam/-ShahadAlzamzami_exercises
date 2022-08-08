package day2.exercises.ex2;

public class TestTime {
    public static void main(String []args){
        MyTime t1 = new MyTime(16, 59, 59);
        System.out.println("Time: "+ t1);
        System.out.println("Next second: " + t1.nextSecond());


    }
}
