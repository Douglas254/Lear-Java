// Super keyword in Java
// ~ super is a keyword that refers to the object of current base class.
// ~ it can be used to replace derived class variable with base class level variable.
// ~ it is also used to call parent/base class method/function.
// ~ it is also used to call parent/base class overloaded constructor.

// 1. super keyword with variable
// By using super keyword we can replace derived class variable with base class variable.
// For better understanding see the below example.

// Base class
class Parameter {
    int width = 20, height = 10;
}
// derived class
class Rectangle extends Parameter{
    int width = 6, height = 5;
    public void area(){
        int result;
        result = width * height;
        System.out.println("Area without super=" +result);

        //here derived class variable is replaced with base class variable
        result = super.width * super.height;
        System.out.println("Area with super=" +result);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Rectangle obj = new Rectangle();
        obj.area();
    }
}

// ### Output ###
// Area without super=30
// Area with super=200


// 2. super keyword with function
// By using super keyword we can also call base class function from derived class.
//  Example

// Base class
class Square {
    void area(int side){
        int result = side * side;
        System.out.println("Area of a square=" +result);
    }
}
// derived class
class Rectangle extends Square{
    int width = 6, height = 5;
    public void area(){
        int result;
        result = width * height;
        System.out.println("Area of rectangle=" +result);

        // calling base class function
        super.area(10);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Rectangle obj = new Rectangle();
        obj.area();
    }
}

// ### Output ###
// Area of rectangle=30
// Area of a square=100


// 3. super keyword with constructor
// By using super keyword we can also call constructor of base class function
// from derived class.
// Example

// Base class
class Square {
    // parameterised constructor of the base class
    Square(int side){
        int result = side * side;
        System.out.println("Area of a square=" +result);
    }
}
// derived class
class Rectangle extends Square{
    int width = 6, height = 5;
    // default constructor of derived class
    Rectangle(){
        // calling base class constructor
        super(12);
        int result;
        result = width * height;
        System.out.println("Area of Rectangle=" +result);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object) of class
        Rectangle obj = new Rectangle();
    }
}

// ### Output ###
// Area of a square=144
// Area of Rectangle=30