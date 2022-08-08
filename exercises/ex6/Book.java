package day2.exercises.ex6;

import java.util.ArrayList;

public class Book {
    private String   name;
    private double   price;
    private ArrayList<Author> authors = new ArrayList<Author>();
    private int      qty = 0;

    public Book(String name, double price, ArrayList<Author> authors, int qty) {
        this.name = name;
        this.price = price;
        this.authors = authors;
        this.qty = qty;
    }

    public Book(String name, double price, ArrayList<Author> authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", authors=" + getAuthorNames() +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        String names="";
        for (int i = 0; i < authors.size(); i++) {
            names+=authors.get(i).getName()+",";
        }
        return names;

    }
}
