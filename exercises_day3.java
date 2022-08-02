import java.util.Arrays;

public class exercises_day3 {
    public static void main(String[] args) {


        //#1
        {//start #1
            System.out.println("----------------------#1------------------------------");

            //Make an array size  3  with these values : { "Saleh","Khalid","Majed" } and print it

            String names[]={"Saleh","Khalid","Majed"};
            System.out.println(Arrays.toString(names));

        }//end /#1

        System.out.println("----------------------#2------------------------------");


        //#2 Print the numbers from 1-33 , don't print the numbers that multiple of 5
        {//start #2
            for (int i = 1; i <= 33; i++) {
                if (i%5==0)
                    continue;
                System.out.println(i);

            }
        }//end #2






        System.out.println("-----------------------#3-----------------------------");


        //3Make an array size  5  with random string values and print it in reverse order

        {//start 3

            String alphabet[]= {"A","B","C","D","F"};


            for (int i = alphabet.length-1; i >= 0; i--) {
                System.out.println(alphabet[i]);
            }

        }//end #3

        System.out.println("----------------------#4------------------------------");


        //4 Make an array size  10  with random string values
        // , and don’t print the values that start with letter 'A'

        {//start 4

            String alphabet[]= {"Ab","aB","AC","D","E","F","G","H","I","J"};
            char first='-';

            for (int i = 0; i < alphabet.length; i++) {
                first=(alphabet[i].charAt(0));
                if(first=='A'||first=='a')
                    continue;
                System.out.println(alphabet[i]);
            }


        }//end #4


        System.out.println("----------------------#5------------------------------");

        //5 Create a method that print an array.

        {//start 5
            print(new String[] {"A", "B", "C"});
        }//end #5


        System.out.println("----------------#6----------------");

        //6 Create a method that takes 3 numbers create an array from these numbers and return it .

        {//start 6
            System.out.println(Arrays.toString(returnArray(1,2,3)));        }//end #6

        System.out.println("----------------#7----------------");


        //7 Create a method that takes your first name
        // and last name and return hello message with your full name .

        {//start 7
            System.out.println(hello("Shahad","Alzamzami"));
        }//end #7

        System.out.println("----------------#8----------------");
        //8 Create a method that takes 4 numbers and return the average of these numbers
        {//start8

            System.out.println("the average is:"+ave(4,4,4,4));

        }//end 8


        System.out.println("----------------#9----------------");
        //8 Create a methid that takes array of numbers and return the biggest number
        {//start9

            System.out.println("the max is:"+max(new int[]{1,2,3,4}));

        }//end 9




    }//end main

    public static void print (String a[]){ //#5
        for (int i = 0; i <a.length ; i++)
            System.out.println(a[i]);

    }//end print

    public static int[] returnArray(int a, int b, int c){//#6
        int[] arr = {a,b,c};
        return arr;
    }//end #6

    public static String hello(String first, String last){//#7
        return "Hello "+first+" "+last;
    }//end #7

    public static double ave(int a, int b,int c,int d){//#8
        return (a+b+c+d)/4;
    }//end #8

    public static int max(int[]a){//#9

        int max=a[0];

        for (int i = 0; i <a.length ; i++) {
            if(a[i]>max)
                max=a[i];
        }
        return max;


    }//end #9






}//end class