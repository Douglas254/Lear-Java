// Interface in Java 

// interface is an important element in java which is called reference type.
// It is blueprint of class.
// It is a collection of abstract method /function.
// It is declared with interface keyword.
// We can not create instance(object) of an interface.
// We can not define function inside interface only can be declared,so it is the responsibility of
// derived class to implement the method/function of interface.
// A class is extended by a class but an interface is implemented by a class.

// Example
interface Geometry{
    void rectangle_area(int width,int height);
    void square_area(int side);
    void circle_area(float radius);
}
// implementing interface
class Easy implements Geometry{
    // implementing method of interface
    public void rectangle_area(int width, int height){
        int ar = width * height;
        System.out.println("Area of rectangle = " +ar);
    }

    // implementing method of interface
    public void square_area(int side){
        int ar = side * side;
        System.out.println("Area of Square = " +ar);
    }

    // implementing method of interface
    public void circle_area(float radius){
        float ar = 3.14f * radius * radius;
        System.out.println("Area of circle = " +ar);
    }

    public static void main(String[] args){
        // creating instance of derived class
        Easy obj = new Easy();

        // calling methods
        obj.rectangle_area(12,13);
        obj.square_area(12);
        obj.circle_area(2.2f);
    }
}

// ### Output ###
// Area of rectangle = 156
// Area of Square = 144
// Area of circle = 15.197601