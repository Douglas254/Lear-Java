

    // MATHS OPERATION IN JAVA
    // Performing maths operations in java

    // Rounding float numbers to integers
    int roundFloat = Math.round(5.50F);  // returns 6:

    // Ceiling:
    // return the closest integer close to the Floating point equal to or greater than it:
    int ceilRound = (int)Math.ceil(5.3F); //6
    int ceil2Round = (int)Math.ceil(60.567);

    // floor
    // returns the smallest or value equal to the one passed.
    int floorInt = (int)Math.floor(50.34);

    // Max, min
    // return maximum and minimum of the values passed
    int maxValue = Math.max(20, 30); // 30
    int minValue = Math.min(20, 30); //20

    // Random
    // used for generating random values from 0-1
    double randomNumber = Math.random();
    double randomZero2Ten = Math.random() * 10; // random between 0 and 10
    int randomInt = (int)Math.round(Math.random() * 100); // rounding into integers
    int randomNoRound = (int) (Math.random() * 100);

    
    
    // Working with Numbers
    // Formatting the Numbers

    // working with Currency convertions:
    NumberFormat localCurrency =  NumberFormat.getCurrencyInstance();
    String marketCurrency = localCurrency.format(98756437.50); 

    // Percentage instance convertions:
    NumberFormat currentRate = NumberFormat.getPercentInstance();
    String converted = currentRate.format(0.5);

    // Method chaining for Repeated Methods
    String currencyUpdate = NumberFormat.getPercentInstance().format(0.79);  



    
    
    // READING USER INPUTS:
    // uses Scanner object to allow user input
    // system.out -> writes out to the screen/file
    // system.in --> writes in from the terminal or file
    // MUST import java.util.Scanner

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    System.out.println("You are " + age + " years");

    // input Strings:
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Enter your Name: ");
    String name = scanner2.next();    // only takes in one string character.
    System.out.println(" You are " + name);

    System.out.print("Enter your School: ");
    String school = scanner2.nextLine();      // does not eliminate white spaces.
    System.out.println("You study at " + school );

    System.out.println("Enter your favorite food: ");
    String favouriteFood =scanner2.nextLine().trim();   // removes white spaces in your code
    System.out.println("You love eating; " + favouriteFood);

    
    // challenge: 1
    // simple interest calculator

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter principal amount: ");
    double principalAmount = scanner.nextDouble();

    System.out.println("Enter years: ");
    double years = scanner.nextDouble();

    System.out.println("Enter Rate: ");
    double rate = scanner.nextDouble();

    double totalAmount = principalAmount * (rate/100) * years;

    System.out.println("Your loan matured to: ksh: " + (totalAmount + principalAmount));


    // Challenge: 2
    // currency Compound interest calculator(Mortgage)
    // MUST import java.util.NumberFormat for formatting numbers

    final byte MONTHS_IN_YEAR = 12;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Principal Amount: ");
    int principal = scanner.nextInt();

    System.out.print("Enter Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

    System.out.print("Enter Period(Years): ");
    byte years = scanner.nextByte();
    int numberOfPayments = years * MONTHS_IN_YEAR;

    double Mortgage = principal * (annualInterestRate * (Math.pow((1+annualInterestRate),numberOfPayments)))
            /((Math.pow((1+annualInterestRate),numberOfPayments))-1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(Mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);

