package exercisesWeek2_day1.exercise5;

public class TestMain {

    public static void main(String[]args){
        Account account1=new Account(100,new Customer(1,"ALi",'m'),1000 );
        System.out.println(account1);
        account1.withdrew(500);
        System.out.println(account1);
        account1.deposit(100);
        System.out.println(account1);
    }
}
