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


// 3. Multilevel inheritance.
// When first class is inherited by second class, second class is inherited by third class and so on it's
// called multilevel inheritance.
// In this type of inheritance each derived class is the base class for the next class.
// In this type of inheritance atleast three class are compulsory.

// Example

// Base class
class Addition {
    public void add(){
        int x,y=30,z=10;
        x=y+z;
        System.out.println("Add = " +x);
    }
}

// extending Addition
class Subtraction extends Addition{
    void sub(){
        int x,y=30,z=10;
        x=y-z;
        System.out.println("Sub = " +x);
    }
}

// extending Subtraction
class Multiplication extends Subtraction{
    void multi(){
        int x, y=30,z=10;
        x=y*z;
        System.out.println("Multiplication = " +x);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object)
        Multiplication obj = new Multiplication();

        // calling methods
        obj.add();
        obj.sub();
        obj.multi();
    }
}

// ### Output ###
// Add = 40
// Sub = 20
// Multiplication = 300


// 4. Hierarchical inheritance.
// When a single class is inherited by two or more than two classes simultaneously it's called Hierarchical
// inheritance.
// In other word we can say that in this type of inheritance derived class may be two or more than two but 
// Base class should be one.
// In this type of inheritance atleast three classes are compulsory.

// Example

// Base class
class Addition {
    public void add(){
        int x,y=30,z=10;
        x=y+z;
        System.out.println("Add = " +x);
    }
}

// extending Addition
class Subtraction extends Addition{
    void sub(){
        int x,y=30,z=10;
        x=y-z;
        System.out.println("Sub = " +x);
    }
}

// extending same class Addition
class Multiplication extends Addition{
    void multi(){
        int x, y=30,z=10;
        x=y*z;
        System.out.println("Multiply = " +x);
    }
}

class Easy{
    public static void main(String[] args){
        // creating instance(object)
        Multiplication obj = new Multiplication();

        // calling base class function
        obj.add();
        // calling derive class function
        obj.multi();
    }
}

// ### Output ###
// Add = 40
// Multiplication = 300

// N/B:
// In the above example you can see that there are three classes(Addition, Subtraction and Multiplication)
// are used in which Addition is inherited by Subtraction and Multiplication therefore using object of 
// Multiplication we can call function only add() and multi() because there is no relation between Subtraction
// and Multiplication therefore function sub() cannot be called by object of Multiplication.Similarly by using
// object of class Subtraction we can call only function add() and sub().


// 5. Hybrid inheritance.
// The combination of two or more than two inheritance is called Hybrid inheritance.
// It can be combination of any two or more than two inheritance(single,multiple,multilevel,Hierarchical).
// In this type of inheritance atleast three class are compulsory.

// example

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

class Division extends Multiplication{
    void div(){
        int x, y=30, z=10;
        x=y/z;
        System.out.println("Division = " +x);
    }
}
class Easy{
    public static void main(String[] args){
        // creating instance(object)
        Division obj = new Division();

        // calling methods
        obj.add();
        obj.sub();
        obj.multiply();
        obj.div();
    }
}

// ### Output ###
// Add = 40
// Sub = 20
// Multiply = 300
// Division = 3

// N/B:
// In the above example you can see that there are four classes(Addition,Subtraction,Multiplication and Division)
// in which Addition and Subtraction are inherited by Multiplication class so in class Addition, Subtraction and 
// Multiplication there is multiple inheritance but class Multiplication is inherited by Division, so in class
// Multiplication and Division there is single inheritance.Therefore, the above program is a combination of Multiple
// and Single Inheritance so it's called Hybrid Inheritance.  

// Advantage of Inheritance
    1. Code Reusability: it means function inside base class is shared by all the derived class.
    2. Time Saving: because there is no need to define existing property(same code) of a class in another class.
    3. Less Cost: because existing code is reused, it leads to less development and maintenance costs.
    4. It helps to reduce code redundancy.