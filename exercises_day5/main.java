package exercises_day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {

    public static void main(String[] args) {//start main

        //exercise#1
        Scanner in=new Scanner(System.in);
        int number1=0,number2=0,result=0;
        System.out.println("This is a mini calculator");
        try {
            System.out.println("Enter your first number");
             number1=in.nextInt();
            System.out.println("Enter your second number");
            number2=in.nextInt();
        }
        catch (Exception e){
            System.out.println("please enter a number only");

        }
        System.out.println("Choose your operation");
        String operation=in.next();

        switch (operation){
            case"+":
                result=number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "*":
                result=number1*number2;
                break;
            case "/":
                result=number1/number2;
                break;
            default:
                System.out.println("please enter a valid operation");
        }
        System.out.println(number1+operation+number2+"="+result);


        //exercise#2
        System.out.println("let's play Rock,Paper and Scissors\n" +
                "please enter 0 as rock,1 as paper or 2 as scissors");
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        int userNumber=in.nextInt();
        if(userNumber==0||userNumber==1||userNumber==2) {
            if (randomNum == 0) {//rock
                if (userNumber == 0)
                    System.out.println("It's a tie,the program chose rock");
                if (userNumber == 1)
                    System.out.println("You won!!, the program chose rock");
                if (userNumber == 2)
                    System.out.println("You lost!, the program chose rock");
            } else if (randomNum == 1) {//paper
                if (userNumber == 0)
                    System.out.println("You lost!, the program chose paper");
                if (userNumber == 1)
                    System.out.println("It's a tie,the program chose paper");
                if (userNumber == 2)
                    System.out.println("You won!!, the program chose paper");
            } else if (randomNum == 2) {//scissors
                if (userNumber == 0)
                    System.out.println("You won!!, the program chose scissors");
                if (userNumber == 1)
                    System.out.println("You lost!!, the program chose scissors");
                if (userNumber == 2)
                    System.out.println("It's a tie,the program chose scissors");
            }
        }
        else
            System.out.println("please enter only 0,1,or 2 to play");




        //exercise#3
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);





    }//end main

}
