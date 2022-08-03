package exercises_day4;

public class main_exercises_day4 {
    public static void main(String[] args) {//start main


        //exercise#1
            int array1[] = new int[7];
            try {
                System.out.print(array1[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }

        System.out.println("---------------------------------");

        //exercise#2
            try{
                checkNumber(10);
            }
            catch (ArithmeticException e){
                System.out.println("isn't divided by 5");
            }
        System.out.println("---------------------------------");

        // exercise#3
        Author author1= new Author("sarah","sarah@gmai.com");
        System.out.println(author1);

        System.out.println("---------------------------------");

        //exercise#4
        Ball ball1=new Ball(8,9,48,-1,-1);
        System.out.println(ball1);
        ball1.move();
        ball1.ReflectHorizontal();
        ball1.ReflectVertical();
        System.out.println(ball1);

        System.out.println("---------------------------------");

        //exercise#5
        Employee employee1=new Employee(1,"sarah","Ali",5000);
        System.out.println("Employee full name: "+employee1.getName());
        System.out.println("Employee Annual Salary: "+employee1.getAnnualSalary());
        System.out.println(employee1.getSalary());
        employee1.raiseSalary(50);
        System.out.println(employee1.getSalary());
        System.out.println(employee1);

        System.out.println("---------------------------------");

        //exercise6
        InvoiceItem invoiceItem1=new InvoiceItem("1","headphone",4,400);
        System.out.println(invoiceItem1);
        System.out.println("the total price for the item= "+invoiceItem1.getTotal());

        System.out.println("---------------------------------");

        //exercise7
        MyPoint myPoint1=new MyPoint(3,3);
        System.out.println(myPoint1);
        System.out.println("distance from point (3,3) to (4,4) is:"+(int)myPoint1.distance(4,4));

    }//end main



    public static void checkNumber(int number)throws ArithmeticException{//start exercise#2
        if(number%5==0){
            System.out.println(number+" is divided by 5");
        }
        else
            throw new ArithmeticException();
    }//end exercise#2

}
