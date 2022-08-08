package day2.exercises;

import java.util.Scanner;

public class ex1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

            System.out.println("Enter the two numbers to perform operations ");
            System.out.print("Enter the first number : ");
            int x = s.nextInt();
            System.out.print("Enter the second number : ");
            int y = s.nextInt();
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose + for ADDITION");
            System.out.println("Choose - for SUBTRACTION");
            System.out.println("Choose * for MULTIPLICATION");
            System.out.println("Choose / for DIVISION");
            char n = s.next().charAt(0);
            switch (n) {
                case '+':
                    int add;
                    add = x + y;
                    System.out.println("Result : " + add);
                    break;

                case '-':
                    int sub;
                    sub = x - y;
                    System.out.println("Result : " + sub);
                    break;

                case '*':
                    int mul;
                    mul = x * y;
                    System.out.println("Result : " + mul);
                    break;

                case '/':
                    float div;
                    div = (float) x / y;
                    System.out.print("Result : " + div);
                    break;
            }

    }
}
