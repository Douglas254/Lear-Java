// this keyword in Java
// ~this is a keyword that refers to the current object of class.
// ~ it can be used to replace local variable with class level variable.
// ~it is also used to call current class method/function.
// ~it is also used to call current class overloaded constructor.

// 1. this keyword as a variable hiding
// By using this keyword we can replace local variable with instance variable.
// For better understanding see the example below.

class Rectangle{
        // declaring instance variable
    int width = 20, height = 10;
    public void area(){
        // declaring local variable
    int width = 6, height = 5, result;
    // using local variable
    result = width * height;
    System.out.println("Area 1=" +result);

    // using class level (instance) variable
    result = this.width * this.height;
    System.out.println("Area 2=" +result);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Rectangle obj = new Rectangle();

        // calling class function
        obj.area();
    }
}

// ### Output ###
// Area 1=30
// Area 2=200


// 2. this keyword with function
// By using this keyword we can also call a function of class without creating
// instance(object) of that class.For better understanding see the below example.


class Geometry{

    public void rectangle_area(int width, int height){
       int result = width * height;
    System.out.println("Area of rectangle=" +result);
    }
    public void square_area(int side){
        int result = side * side;
        System.out.println("Area of square=" +result);
        // calling function using this keyword
        this.rectangle_area(12,13);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Geometry obj = new Geometry();

        // calling class function
        obj.square_area(12);
    }
}

// ### Output ###
// Area of square=144
// Area of rectangle=156


// 3. this keyword constructor
// By using this keyword we can also call a function of class without creating
// instance(object) of that class.

// Example

class Rectangle{
    // parameterised constructor
    Rectangle(int width, int height){
       int result = width * height;
    System.out.println("Area of rectangle=" +result);
    }
    // default constructor
    public Rectangle(){
        // calling parameterised constructor
        this(12,13);
        System.out.println("I am inside the default constructor");
    }
}

class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Rectangle obj = new Rectangle();
    }
}

// ### Output ###
// Area of rectangle=156
// I am inside the default constructor