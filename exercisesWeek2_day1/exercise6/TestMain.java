package exercisesWeek2_day1.exercise6;

public class TestMain {

    public static void main(String []args){

        Invoice invoice=new Invoice(0,new Customer(1,"Ali",10),500);
        System.out.println(invoice);
        System.out.println("Amount after discount= "+ invoice.getAmountAfterDiscount());
    }
}
