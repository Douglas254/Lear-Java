// Constructor 
// It's a special member function of class that executes when we create the instance(Object) 
// of that class,in other word we can say that there is no need to call a constructor.
// --> its name is same as class name.
// --> it has no return type.
// --> it may be parameterized or non-parameterized.
// --> it is used to initialize class level variable.


// Example
class Rectangle{
    // Data Member
    int width;
    int height;
    int area;

    // Constructor
    // notice here there is no return type and name is same as class name 
    Rectangle(){
        width = 5;
        height = 3;
        area = width * height;
        System.out.println("Area of a rectangle = " +area);
    }
    public static void main(String[] args){
        // Creating instance(Object)
        // notice here no need to call a constructor
        Rectangle obj = new Rectangle();
    }
}

// ### Output ### 
// Area of a rectangle = 15


// Types of Constructor
    1. Default Constructor
    2. Parameterized Constructor
    3. Copy Constructor

// Default Constructor ~ constructor with no parameter.
// Example
class Rectangle{
    // Data Member
    int width;
    int height;
    int area;

    // Constructor
    // notice here there is no return type and name is same as class name 
    Rectangle(){
        width = 5;
        height = 3;
        area = width * height;
        System.out.println("Area of a rectangle = " +area);
    }
    public static void main(String[] args){
        // Creating instance(Object)
        // notice here no need to call a constructor
        Rectangle obj = new Rectangle();
    }
}

// ### Output ### 
// Area of a rectangle = 15


// Parameterized Constructor ~ constructor with parameter.
// Example

class Rectangle{
    // Data Member
    int area;

    // Constructor
    // notice here there is no return type and name is same as class name 
    Rectangle(int width, int height){
        area = width * height;
        System.out.println("Area of a rectangle = " +area);
    }

    public static void main(String[] args){
        // Creating instance(Object) of class
        // notice here there are two values which are passed because there are two parameter in 
        // constructor, 5 will assign to width and 3 will assign to height.
        Rectangle obj = new Rectangle(5, 3);
    }
}

// ### Output ### 
// Area of a rectangle = 15


// Copy Constructor ~ in this type of constructor one object with parameter is copied into another object.
// Example

class Rectangle{
    // Data Member
    int area;

    // Constructor
    // notice here there is no return type and name is same as class name 
    Rectangle(int width, int height){
        area = width * height;
    }

    void show(){
        System.out.println("Area of a rectangle = " +area);
    }

    public static void main(String[] args){
        // Creating instance(Object) of class
        // notice here there are two values which are passed because there are two parameter in 
        // constructor, 5 will assign to width and 3 will assign to height.
        Rectangle obj1 = new Rectangle(5, 3);
        obj1.show();

        // passing obj1 in obj2
        Rectangle obj2 = obj1;
        obj2.show();
    }
}

// ### Output ### 
// Area of a rectangle = 15
// Area of a rectangle = 15


// NOTE:- Destructor ~ there is no destructor in JAVA.