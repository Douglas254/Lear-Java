// Data Abstraction
// Abstraction means data hiding, in other word we can say that in this type of programming essential
// data is shown to the user or outside class and unessential data is hidden.
// Members defined with a public access specifier are accessible throughout the program.
// Members defined with a private access specifier are not accessible throughout the program means private
// element of a class can be accessed only inside in its own class.

// Example
// let's take a real life example assume that you are going to buy a car in showroom then you can know about
// company name, model name, color, cost and oil type but you don't know about piston and it's functionality,
// the person who made that model of the car.For better understanding see the implementation below

class Showroom{
    public void company(){
        System.out.println("Renault");
    }

    public void model(){
        System.out.println("RangeRover Sport House");
    }

    public void color(){
        System.out.println("White/Gray/Silver/Black/Brown");
    }

    public void oilType(){
        System.out.println("Petrol");
    }

    public void price(){
        System.out.println("800,000 to 1,400,000");
    }

    // private member
    private void piston(){
        System.out.println("4 piston");
    }

    // private member
    private void person_who_made(){
        System.out.println("Douglas Obara");
    }

    public static void main(String[] args){
        // creating instance(object) of class
        Showroom obj = new Showroom();

        // calling function
        obj.company();
        obj.model();
        obj.color();
        obj.oilType();
        obj.price();
    }
}
