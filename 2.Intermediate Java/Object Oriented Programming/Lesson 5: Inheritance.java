// Inheritance
// The process of getting property of one class into another class 
// In other word we can say that the process of deriving a new class from an old class is called Inheritance
// in which the new class is called derived or child or sub class and old class is called Base or Parent or 
// Super class.
// When a class inherits the property of a class it means it can access all the data member and member function
// of that class except private element.
// In this type of programming mainly two types of classes are used.
        1. Parent/Super/Base class
        2. Child/Sub/Derived class

// 1. Parent/Super/Base class
// The class which is inherited by another class is called Parent or Super or Base class

// 2. Child/Sub/Derived class
// The class which inherits the property of another class is called Child or Sub or Derived class.

// How to inherit one class into another
// Derived class extends Base class 
// Example
// class Subtraction extends Addition
// Here Subtraction is a Derived class and Addition is a Base class and extends is a keyword which is used 
// to inherit one class into another.

// Example

// Base class
class Addition{
    void add(){
        int x, y=30, z=10;
        x = y + z;
        System.out.println("Add = " +x);
    }
}

// Derived class extending base class
class Subtraction extends Addition{
    void sub(){
        int x, y=30,z=10;
        x= y-z;
        System.out.println("Sub = "+x);
    }
}

class Easy {
    public static void main(String[] args){
        // creating instance(object)
        Subtraction obj = new Subtraction();

        // calling base class method
        obj.add();
        // calling Derived class method
        obj.sub();
    }
}

// ### Output ###
// Add = 40
// Sub = 20

// N/B:
// Here class Addition is a base class and Subtraction is a derived class because Addition is inherited 
// into Subtraction therefore we can call all the function using object of Subtraction.

// Types of Inheritance 
// There are five types of inheritance 
                1. Single inheritance.
                2. Multiple inheritance.
                3. Multilevel inheritance.
                4. Hierarchical inheritance.
                5. Hybrid inheritance.

//  1. Single inheritance.
// In this types of inheritance only two classes are used in which one is inherited by another.

// Example

// Base class
class Addition{
    void add(){
        int x, y=30, z=10;
        x = y + z;
        System.out.println("Add = " +x);
    }
}

// Derived class extending base class
class Subtraction extends Addition{
    void sub(){
        int x, y=30,z=10;
        x= y-z;
        System.out.println("Sub = "+x);
    }
}

class Easy {
    public static void main(String[] args){
        // creating instance(object)
        Subtraction obj = new Subtraction();

        // calling base class method
        obj.add();
        // calling Derived class method
        obj.sub();
    }
}

// ### Output ###
// Add = 40
// Sub = 20

// N/B:
// In the above example you can see that there is only two classes are used in which Addition is inherited
// is inherited by Subtraction therefore using object of Subtraction we can call add() and sub().


//  2. Multiple inheritance.
// This when two or more than two classes are inherited by a single class simultaneously
// In other word we can say that in this type of inheritance Base class may be two or or more than two but
// Derived class should be one.
// In this type of inheritance atleast three class are compulsory
// Java does not support Multiple inheritance therefore interface are used to implement multiple inheritance.
// interface is declared with interface keyword and it is implemented by a class while class is extended by a class.
// We can not define function inside an interface, only can be declared,
// It's the responsibility of derive class to implement/define the method of interface.

// Example

// interface
interface Addition {
    // declaring method
    // because we can not define function inside interface
    void add();
}

// Base class
class Subtraction{
    void sub(){
        int x,y=30,z=10;
        x=y-z;
        System.out.println("Sub = " +x);
    }
}
//Derived class extending base class and implementing interface
class Multiplication extends Subtraction implements Addition{
    // implementing method of interface
    public void add(){
        int x, y=30,z=10;
        x=y+z;
        System.out.println("Add = " +x);
    }
    void multiply(){
        int x, y=30,z=10;
        x=y*z;
        System.out.println("Multiply = " +x);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object)
        Multiplication obj = new Multiplication();

        // calling methods
        obj.add();
        obj.sub();
        obj.multiply();
    }
}

// ### Output ###
// Add = 40
// Sub = 20
// Multiply = 300

// N/B: 
// In the above example you can see that there are two classes (Subtraction and Multiplication) and one 
// interface (Addition) are used in which Subtraction is extended and Addition is implemented by Multiplication
// therefore using object of Multiplication we can call function add(), sub() and multiply().


