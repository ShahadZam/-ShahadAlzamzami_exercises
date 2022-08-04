package exercises_day5;


//exercise#3
public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance=balance+amount;
        return balance;
    }

    public int debit(int amount){
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("amount exceeds balance");
        return balance;
    }

    public int transferTo(Account another,int amount){
        if(amount<=balance) {
            balance = balance - amount;
            another.balance=another.getBalance()+amount;
        }

        else
            System.out.println("amount exceeds balance");
        return balance;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}