package day2.exercises.ex4;

import java.time.LocalTime;
import java.util.Date;

public class TestMain {
    public static void main(String []args){
        Customer customer1=new Customer("Alaa");
        customer1.setMember(true);
        customer1.setMemberType("Gold");
        Date date = new Date();
        Visit visit1=new Visit(customer1.getName(),date);
        visit1.setProductExpense(20);
        visit1.setServiceExpense(10);
        System.out.println(visit1);
        System.out.println(customer1);
        double expense=visit1.getProductExpense()-(visit1.getProductExpense()*Discount.getServiceDiscountRate(customer1.getMemberType()));
        System.out.println("The service discount for "+customer1.getMemberType()+" type is:"+expense);
    }
}
