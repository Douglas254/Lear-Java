// static keyword in Java
// ~ static keyword is an important element in Java which is mainly used for 
// memory management.
// ~ static keyword can be used with `variable`, `function` and `block`.
// ~ static members belong to class rather than object of class so they can be 
// called by class name directly

// 1. Static variable
// ~ the variable which is declared with `static` keyword is called static variable.
// ~ it is also called class level variable because it is common to all instances(object).
// ~ static variable can be accessed anywhere in the program using class name.

// Example

class Rectangle{
    // declaring static variable
    static int width, height, result;
    void area(){
        result = width * height;
        System.out.println("Area of Rectangle=" +result);
    }
}
class Easy{
    public static void main(String[] args){
        // accessing static variable and assigning value to it
        // note that we are accessing using the class name and not using object.
        Rectangle.width = 30;
        Rectangle.height = 20;
        // creating instance(object) of class
        Rectangle obj = new Rectangle();
        obj.area(); // calling function
    }
}

// ### Output ###
// Area of Rectangle=600


// 2. static function
// ~ the function which is declared with static keyword is called static function or method.
// ~ static function is also called by class name directly because it belongs to class rather
// than object.

// Example
class Rectangle{
    // declaring static variable
    static int width, height, result;
    // declaring static function
    static void area(){
        result = width * height;
        System.out.println("Area of Rectangle=" +result);
    }
}
class Easy{
    public static void main(String[] args){
        // accessing
        Rectangle.width = 30;
        Rectangle.height = 20;
        // calling static function using class name not using object
        Rectangle.area();
    }
}

// ### Output ###
// Area of Rectangle=600

// 2. static block
// it is such type of block that executes before the main function.

// Example
class Easy{
    // declaring static block
    static {
        System.out.println("I am inside static block");
    }
    public static void main(String[] args){
        System.out.println("I am inside main function");
    }
}

// ### Output ###
// I am inside static block
// I am inside main function