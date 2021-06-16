import java.util.Date;
// Welcome to Java Programming

public class Introduction{
    public static void main (String[] args){
       // LESSON ONE

        //printing hello world in java 
        System.out.println("Welcome to Java Programming");
        System.out.println("Here We are let's code Java");   
    
        //TYPES IN JAVA

        //Variables
        // follows the camelCase naming convention
        
        // myAge is also refered as identifier 
        // has '=' assignment operator
        int myAge = 50;
        System.out.println(myAge); 

        myAge = 70;  // reinitializing values to another integer
        System.out.println(myAge);

        // multiline declaration
        int age = 20, score = 4;
        System.out.println( score + age);

        // Variable reasignment
        int myScore = 8;
        int teamC = myScore;
        System.out.println(teamC);



        // LESSON 2:
        // PRIMITIVE TYPES.
        
        // Full int:
         //   byte, short, int, long
        //Floating point
          //  float and Double
        //Characters
           // char
        //Booleans
          //  True / False

        byte price = 40;
        Long totalCount = 5_400_560_800L;
        boolean hasCoffee = false;
        char firstName = 'A';
        double discount = 99.99;

        System.out.println("Price: " + price + "\n count:" + totalCount + "\n Coffee: " + hasCoffee + "\n discount: " + discount + "\n First Name char : " + firstName);
        

        // REFERENCE TYPE:
        // Require memory allocation with "new" keyword
        // Must import the java.util.Date above for date function to work correctly
        Date todaysDate = new Date();
        System.out.println(todaysDate); //returns current date and time

        
        //REFERENCE and PRIMITIVE TYPES:
        // memory management
        byte x = 3;
        byte y = x;
        x = 10;
        System.out.println(y); // y remains same irrespective of the update because they are independable
        System.out.println(x);

        //referance variable alone:
        //changes both values
        Point point1 = new Point(x=2, y=6);
        Point point2 = point1;
        System.out.println(point2);

        Point point1 = new Point(2,6);
        Point point2 = point1;
        System.out.println(point2);
        System.out.println(point1);
        // now change the values and observe the change pointing variable
        point1.y = 10;
        point2.x = 20;
        System.out.println(point1); // all the values change because they point to the same memory

        // N/B: Reference type are copied by their reference
        // Primitive types are copied by their values BUT completly defferent from
        // each other

    }
}
