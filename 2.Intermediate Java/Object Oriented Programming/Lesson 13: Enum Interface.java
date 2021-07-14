// enumeration interface in Java 
// it is a predefined interface.
// it is used to access/retrieve the data from any collection like vector,
// stack etc.
// There are two main methods of enumeration interface
    1. hasMoreElements()
        // ~ It returns boolean value(true/false).
        // ~ It returns true if the enumeration contains atleast one or more than
        // one element otherwise returns false.
    2. nextElement()
        // it returns the next element of enumeration.

// Example:
import java.util.Enumeration;
import java.util.Vector;

enum Language{
    // enum constants value
    C,JAVA,PHP,ANDROID,PYTHON;
    // defining function inside enum
    public void fun(){
        System.out.println("called for: "+this.toString());
    }
}
class Program{
    public static void main(String[] args){
        // creating variable of enumeration
        Enumeration courses;
        // creating object of vector
        Vector courseName = new Vector();
        // adding data into vector
        courseName.add("C");
        courseName.add("C++");
        courseName.add("PHP");
        courseName.add("ANDROID");
        courseName.add("C#");
        courseName.add("PYTHON");
        courseName.add("JAVASCRIPT");
        // passing vector data into enumeration
        courses = courseName.elements();
        // Accessing data of enumeration
        while(courses.hasMoreElements()){
            // printing data of enumeration
            System.out.println(courses.nextElement());
        }

    }
}

// ### Output ###
// C
// C++
// PHP
// ANDROID
// C#
// PYTHON
// JAVASCRIPT