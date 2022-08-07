package exercisesWeek2_day1.exercise6;

public class Customer {

    private int id;
    private String name;
    private int discount;

    public Customer(int ID, String name, int discount) {
        this.id = ID;
        this.name = name;
        this.discount = discount;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return  name + "(" +id+") ("+
                + discount +
                "%)";
    }
}
