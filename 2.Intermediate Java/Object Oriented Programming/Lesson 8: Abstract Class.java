// Abstract class 
// ~ it is an important element in Java which is declared with `abstract` keyword.
// ~ it is a collection of abstract method/function or non-abstract method.
// ~ we can not create instance(object) of an abstract class.
// ~ we can not define abstract function inside abstract class only can be declared
// ,so it's the responsibility of the derived class to implement the function/method  of abstract class.
// ~An abstract class is also `extended` by a class.


// Example 1: Abstract class without abstract method
abstract class Geometry{
    // declaring non-abstract method
    public void rectangle_area(int width, int height){
        int ar = width * height;
        System.out.println("Area of rectangle = " +ar);
    }

    // declaring non-abstract method
    public void square_area(int side){
        int ar = side * side;
        System.out.println("Area of Square = " +ar);
    }

    // declaring non-abstract method
    public void circle_area(float radius){
        float ar = 3.14f * radius * radius;
        System.out.println("Area of circle = " +ar);
    }
}
// extending abstract class
class Easy extends Geometry{
    public static void main(String[] args){
        // creating instance of derived class
        Easy obj = new Easy();

        // calling method of abstract class
        obj.rectangle_area(12,13);
        obj.square_area(12);
        obj.circle_area(2.2f);
    }
}

// ### Output ###
// Area of rectangle = 156
// Area of Square = 144
// Area of circle = 15.197601

// N/B 
// Abstract method/function in Java
// ~ abstract function is declared with abstract keyword.
// ~ it can be declared only inside abstract class.
// ~ it can not be defined inside abstract class, only can be declared so it's 
// the responsibility of derived class to implement abstract calss.


// Example 1: Abstract class with abstract method
abstract class Geometry{
    // declaring abstract method
    abstract void rectangle_area(int width, int height);
    abstract void square_area(int side);
    abstract void circle_area(float radius);
}
// extending abstract class
class Easy extends Geometry{
    // implementing abstract method of abstract class
    public void rectangle_area(int width, int height){
        int ar = width * height;
        System.out.println("Area of rectangle = " +ar);
    }

    // implementing abstract method of abstract class
    public void square_area(int side){
        int ar = side * side;
        System.out.println("Area of Square = " +ar);
    }

    // implementing abstract method of abstract class
    public void circle_area(float radius){
        float ar = 3.14f * radius * radius;
        System.out.println("Area of circle = " +ar);
    }
    public static void main(String[] args){
        // creating instance of derived class
        Easy obj = new Easy();

        // calling abstract method
        obj.rectangle_area(12,13);
        obj.square_area(12);
        obj.circle_area(2.2f);
    }
}

// ### Output ###
// Area of rectangle = 156
// Area of Square = 144
// Area of circle = 15.197601


// Example 2: Abstract class with abstract and non-abstract method 
abstract class Geometry{
    // declaring abstract method
    abstract void rectangle_area(int width, int height);

    // declaring non-abstract or normal method
    public void square_area(int side){
        int ar = side * side;
        System.out.println("Area of Square = " +ar);
    }

    // declaring non-abstract or normal method
    public void circle_area(float radius){
        float ar = 3.14f * radius * radius;
        System.out.println("Area of circle = " +ar);
    }
}
// extending abstract class
class Easy extends Geometry{
    // implementing abstract method of abstract class
    public void rectangle_area(int width, int height){
        int ar = width * height;
        System.out.println("Area of rectangle = " +ar);
    }
    public static void main(String[] args){
        // creating instance of derived class
        Easy obj = new Easy();

        // calling abstract method
        obj.rectangle_area(12,13);

        // calling non-abstract or normal method
        obj.square_area(12);
        obj.circle_area(2.2f);
    }
}

// ### Output ###
// Area of rectangle = 156
// Area of Square = 144
// Area of circle = 15.197601