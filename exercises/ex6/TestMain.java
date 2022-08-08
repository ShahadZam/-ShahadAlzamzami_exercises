package day2.exercises.ex6;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(new Author("Ali", "Ali@m.com", 'm'));
        authors.add( new Author("Ahmad", "Ahmad@a.com", 'm'));

        Book Book1 = new Book("programming", 200,authors , 1000);

        System.out.println("\nThe book: " + Book1);
        System.out.println("The authors are:"+Book1.getAuthorNames());


    }
}
