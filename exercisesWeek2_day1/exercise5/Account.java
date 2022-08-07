package exercisesWeek2_day1.exercise5;


import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance=0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer=customer;
        this.balance = balance;
    }

    public Account(int id,Customer customer) {
        this.id = id;
        this.customer=customer;

    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString()+" balance=$"+balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        balance+=amount;
        return this;

    }

    public Account withdrew(double amount){
        if (this.balance>=amount)
            this.balance-=amount;
        else
            System.out.println("amount withdrew exceeds the current balance!");
            return this;
    }

}
