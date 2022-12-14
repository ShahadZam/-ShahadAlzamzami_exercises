package exercisesWeek2_day1.exercise6;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return this.customer.getID();
    }

    public String getCustomerName(){
        return this.customer.getName();
    }

    public int getCustomerDiscount(){
        return  this.customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount-=amount*getCustomerDiscount()/100;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer=" + customer.toString() +
                ", amount=" + amount +
                '}';
    }
}
