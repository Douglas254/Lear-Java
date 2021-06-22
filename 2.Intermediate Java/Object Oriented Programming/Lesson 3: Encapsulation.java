// Encapsulation
// The process of combining many elements into a single entity or 
// In the field of programming language the process of combining data member and member function into a single entity.
// It's an important features of object oriented programming.
// It's used to prevent the direct accessibility of data member and member function and this is done by using
// access specifier i.e public, private and protected.


// Access Specifier 
// It's a keyword which is used to provide accessibility of data member(variable) and member function(function)
// of a class.It's also called access modifier

// Types of Access Specifier
// There are three types of access specifier
    1. public
    2. private
    3. protected

// public
// It allows the accessibility of data member and member function to the other classes.
// public element of a class can be accessed anywhere in the program. 

// private
// It's used to hide data member and member function from the other classes
// private element of a class can be accessed only inside in its own class.
// private element of a class can't be accessed out of that class.

// protected
// It is approximately same as private but it allows the accessibility of data member and 
// member function to the child class.
// protected is used in the case of inheritance.

// Example 1
// calculating simple interest (principal*rate*time)/100

import java.util.Scanner; // for creating Scanner object

public class SimpleInterest {
    Scanner in = new Scanner(System.in); // object
    // Data Member
    float p; // principle
    float r; // rate
    float t; // time
    float si; // simple interest

    void getParameter(){
        System.out.print("Enter principle Amount "); // showing on screen what to input
        p = in.nextFloat(); // taking input
        System.out.print("Enter rate of interest ");
        r = in.nextFloat(); // taking input
        System.out.print("Enter time duration ");
        t = in.nextFloat(); // taking input

    }

    void findInterest(){
        si = (p*r*t)/100; // calculate simple interest
    }

    void show(){
        System.out.println("The simple interest = "+si); // show calculated interest on the screen
    }

    public static void main(String[] args){

        // creating instance(Object) of class
        SimpleInterest obj = new SimpleInterest();

        // calling function
        obj.getParameter();
        obj.findInterest();
        obj.show();

    }
}

//             ### Output ###
//        Enter principle Amount 1500 
//        Enter rate of interest 5.5
//        Enter time duration 8
//        The simple interest = 660.0


// Example 2

public class Student {

    // Data Members
    private String name;
    private int age;
    private String school;

    // member function
    // using setters
    public void setName(String newName){
        name = newName;
    }

    // member function
    // using getters
    public String getName() {
        return name;
    }

    // member function
    // using setters
    public void setAge(int newAge){
        age = newAge;
    }

    // member function
    // using getters
    public int getAge(){
        return age;
    }

    // member function
    // using setters
    public void setSchool(String newSchool){
        school = newSchool;
    }

    // member function
    // using getters
    public String getSchool(){
        return  school;
    }

    public static void main(String[] args){
        // creating instance(object) of class
        Student obj = new Student();

        // calling setters function and initializing data member
        obj.setName("Douglas Obara");
        obj.setAge(25);
        obj.setSchool("Kabarak University");

        // calling getters function and print them out
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSchool());

    }
}

//        ### Output ###
//        Douglas Obara
//        25
//        Kabarak University