
// Object
// Object is having states and behaviors in which state means what does it has whereas
// behavior means what does it do e.g a pen has 
// States: ink, nib, needle, cap etc.
// Behaviors: Writing

// Class
// They are blueprints
// It's a collection of data members and member functions.
// Data members are the variables used inside class.
// Member functions are the function used inside class.
// It's also called Userdefined datatype.

// Syntax of class

class classname {
Access Specifier Data Member 1;
            Data Member 2;
            ______________

            Data Member n;

            Member function 1;
            Member function 2;
            _______________

            Member function n;


}

// Explained Syntax above
// class --> keyword
// classname --> Userdefined class Name
// Access Specifier --> It's used to provide accessibility of data member and member function,it
// may be public, private or protected.
// Data Member 1, 2...n -->  means we can take variables as per user requirement.
// Member function 1, 2...n --> means we can take many functions as per user requirement.


// Example
// Important Point to remember while making class program 
// --> Declare variable with appropriate data type as per your requirement
// for instance to find the area of a rectangle three variables are sufficient i.e(height, width and area)
// --> Declare function as per your requirement
// for instance to find the area of a rectangle single function findArea() is sufficient
// --> Create instance(Object) of class to access the data member and member function of a class.
// classname objectname;
Example:- Rectangle rec1;
// Here Rectangle is the name of the class and rec1 is the name of the object.
// --> Accessing data member and member function 
// Data Member and member function of a class can be accessed using the Dot(.) operator
// --> Accessing data member 
rec1.height;
// --> Accessing member function
rec1.findArea();


// Example 1
class Rectangle{
    // Data Member
    int width;
    int height;
    int area;

    void findArea(){
        area = width * height;
        System.out.println("Area of a rectangle = " +area);
    }

    public static void main( String[] args){
        // creating object
        Rectangle obj = new Rectangle();

        // accessing data member 
        obj.width = 5;
        obj.height = 3;

        // accessing member function
        obj.findArea();
        
    }
}

// ### Output ### 
// Area of a rectangle = 15


// Example 2
class Rectangle{
    // Data Member
    int width;
    int height;
    int area;

    // Member function
    void findArea(){
        area = width * height;
        System.out.println("Area of a rectangle = " +area);
    }

    // Member function
    void getParameter(){
        width = 5;
        height = 3;
    }

    public static void main( String[] args){
        // creating instance(object)
        Rectangle obj = new Rectangle();

        // accessing member function
        obj.getParameter();
        obj.findArea();
        
    }
}

// ### Output ### 
// Area of a rectangle = 15