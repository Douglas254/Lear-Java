// enum in Java
// ~It is a collection of named constant.
// ~It is declared with enum keyword.
// ~Each enumeration constant is `public`, `static` and `final` by default.
// ~ constant value can't be changed once it's defined.
// ~ It is also called user defined data type.
// ~ value of enum should be in uppercase letters but not compulsory.
// ~ new keyword is not used to create variable of enum.
// ~ We can access the value of enum by using dot(.) operator.

// syntax of enum 
enum enum_name{
    value 1, value 2 , value 3,.....,value n
}

// Example
enum Language{
    C,JAVA,PHP,ANDROID,PYTHON
}
class Program{
    public static void main(String[] args){
        // creating variable of enum
        Language myVar = Language.PYTHON;
        System.out.println(myVar);
    }
}

// ### Output ###
// PYTHON


// Example: Enum within class 
class Program{
    enum Language{
    C,JAVA,PHP,ANDROID,PYTHON
}
 public static void main(String[] args){
        // creating variable of enum
        Language myVar = Language.PYTHON;
        System.out.println(myVar);
    }
}

// ### Output ###
// PYTHON


// Example: Enum with switch
enum Language{
    C,JAVA,PHP,ANDROID,PYTHON
}

class Program{
    public static void main(String[] args){
        // creating variable of enum
        Language myVar = Language.ANDROID;
        switch (myVar){
            case C:
                System.out.println("Fees: "+3500);
                break;
            case JAVA:
                System.out.println("Fees "+6000);
                break;
            case PHP:
                System.out.println("Fees "+8000);
                break;
            case PYTHON:
                System.out.println("Fees "+10000);
                break;
            case ANDROID:
                System.out.println("Fees "+15000);
                break;
        }
    }
}

// ### Output ###
// Fees 15000


// Example: Enum with constructor
// enum have also a constructor like class but enum constructor is called
// separately for each constant value of enum.

enum Language{
    // enum constants value
    C,JAVA,PHP,ANDROID,PYTHON;
    // enum constructor
    // Note: enum constructor is called separately for each constant
    private Language(){
        System.out.println("called for: "+this.toString());
    }
}

class Program{
    public static void main(String[] args){
        // creating variable of enum
        Language myVar = Language.JAVA;
        System.out.println(myVar);
    }
}

// ### Output ###
// called for: C
// called for: JAVA
// called for: PHP
// called for: ANDROID
// called for: PYTHON
// JAVA


// Example: Enum with function
// we can also define function inside enum like a normal function and we can call 
// it by using enum variable and dot(.) operator.

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
        // creating variable of enum
        Language myVar = Language.JAVA;
        // calling function
        myVar.fun();
    }
}

// ### Output ###
// called for: JAVA