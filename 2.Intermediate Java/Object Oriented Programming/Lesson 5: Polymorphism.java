// Polymorphism

// It means one name many forms so we can say that in this type of programming same function is used to perform
// different kind of operation.
// It is an important part of object oriented programming language.

// Example
// let's take a simple example in which as you can see that class name is poly and there are four function with the
// same a() with different parameter so execution of function is based on the value passing at the time of calling.

public class Poly {
    void a(){
        System.out.println("No para");
    }

    void a(int i){
        System.out.println("Integer para");
    }

    void a(char ch){
        System.out.println("Character para");
    }

    void a(float f){
        System.out.println("Float para");
    }

    void a(double d){
        System.out.println("Double para");
    }

    void a(String s){
        System.out.println("String para");
    }

    public static void main(String[] args){
        // creating instance(object) of class
        Poly obj = new Poly();

        // calling methods
        obj.a(12);
        obj.a('e');
        obj.a("easy");
    }
}

// ### Output ###
// Integer para
// Character para
// String para

// N/B:
// Here function is called three times first time with integer value and the second time with Character
// value and the third time with the String value so the output is Integer para Character para String para


// Types of Polymorphism
    // 1. Compile time polymorphism ~ Function overloading and Operator overloading are the examples of
    // compile time polymorphism.
    // 2. Runtime polymorphism ~ function overriding is the example of Runtime Polymorphism.


    // Function overloading
// 1. The function with the same name and different parameter is called function overloading.

// Example

public class Geometry {
    // finding area of a rectangle
    void area(int width, int height){
        int ar = width * height;
        System.out.println("Area of a Rectangle = " +ar);
    }

    // finding area of a square
    void area(int side){
        int ar = side * side;
        System.out.println("Area of a Square = " +ar);
    }

    // finding area of a circle
    void area(float r){
        float ar = 3.14f * r * r;
        System.out.println("Area of a Circle = " +ar);
    }

    // finding area of a triangle
    void area(float base, float height){
        float ar = 0.5f * base * height;
        System.out.println("Area of a Triangle = " +ar);
    }

    public static void main(String[] args){
        // creating instance(object) of class
        Geometry obj = new Geometry();

        // calling methods
        // single para for square
        obj.area(12);
        // double int para for rectange
        obj.area(5,6);
        // single float for circle
        obj.area(2.2f);
        // double float for triangle
        obj.area(2.5f,6.3f);
    }
}

// ### Output ###
// Area of a Square = 144
// Area of a Rectangle = 30
// Area of a Circle = 15.197601
// Area of a Triangle = 7.875


// N/B:
// Here Geometry is class name contains two function with same name area() with different parameter,
// first with two parameter width and height and second with single parameter side. Therefore when two
// integer parameter is passed at the time of calling Rectangle area will be calculated, when single 
// integer parameter is passed Square area will be calculated.



    // Function overriding
// function with same name and same parameter is called function overriding.
// it is not possible to make two function with same name and same parameter in a single class therefore
// to implement function overriding derived class is used.

// Example

public class Geometry1 {
    void area(int width, int height) {
        int ar = width * height;
        System.out.println("Area of a Rectangle = " + ar);
    }

}
class Geometry2 extends Geometry1{
    void area(int width, int height) {
        int ar = width * height;
        System.out.println("Area of a Rectangle2 = " + ar);
    }
}

class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Geometry2 obj = new Geometry2();

        // calling methods
        // single para for square
        obj.area(12,13);
    }
}

// ### Output ###
// Area of a Rectangle2 = 156

// N/B:
// In the above example there are two classes Geometry1 and Geometry2 containing same function area 
// with same parameter.We are extending Geometry1 into Geometry2 therefore both function exists in the
// class Geometry2 but on priority bases when we call the function area() from the object of class 
// Geometry2 then the function inside Geometry2 will execute. 