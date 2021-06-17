
    // LOGICAL CONTROL STATEMENTS IN JAVA:
    // Used to compare primitive values:

    // comparison operators 
    // == --> Equal, >= --> greater/equal to, <= --> less/equal to  != --> Not equal to
    int speed = 50;
    int fuelConsumption = 50;
    
    System.out.println(speed == fuelConsumption); // returns a boolean (True)
    System.out.println(speed != fuelConsumption); // False
    System.out.println(speed <= fuelConsumption);
    System.out.println(speed >= fuelConsumption);


    // logical operators
    // Logical AND operator (&&)
    // true if both conditions are met

    int speed = 100;
    boolean isBMW = speed>300 && speed<500; // checks for both conditions from left to right if true. 
    System.out.println(isBMW);

    // OR operator (||)
    // is true if either of the conditions is met;

    boolean hasExperience = true;
    boolean hasGraduated = false;
    System.out.println(hasExperience || hasGraduated); // True


    //COMBINED OPERATIONS
    boolean hasExperience = true;
    boolean hasGraduated = true;
    boolean hasIncompleteUnits = false;  // to be eligible there must no be incomplete units to be employed
    System.out.println((hasExperience || hasGraduated) && !hasIncompleteUnits); // ! reverses the statement


    
    // IF STATEMENTS
    // Used for making decisions based on certain conditions
    int score = 40;

    if (score < 20){
      System.out.println("Easy game !! ");
      System.out.println(" Simplify Training ");
    }
    else if (score > 20){
      System.out.println(" Tough game ");
      System.out.println(" Do more training ");
    }
    else if (score == 20){
      System.out.println(" Draw game .");
      System.out.println("Score shared");
    }
    else{
      System.out.println("Check score board ");
    }


    
    // Reduce complexity in control staements
    int startingSalary = 800_000;
    boolean hasGoodSalary;
    if (startingSalary > 100_000){
      hasGoodSalary = true;
      System.out.println(hasGoodSalary);
    }
    else
    {
      hasGoodSalary = false;
      System.out.println(hasGoodSalary);
    }


   
    // more simplification:

    int startingSalary = 80_000;
    boolean hasGoodSalary = false;
    if (startingSalary > 100_000){
      hasGoodSalary = true;
    }
    System.out.println(hasGoodSalary);


    // simplify it more:

    int startingSalary = 500_000;
    boolean hasGoodSalary = (startingSalary>100_000);
    System.out.println(hasGoodSalary);

    
    // Terrnary and If combination:
    ?: --> tenary operator
      int carPrice = 1_200_000;
      String driverClass = "Passanger class";
      if (carPrice > 2_500_000){
        driverClass = "The Owners class";
      }
      System.out.println(driverClass);


    // reduce complexity

      int carPrice = 5_200_000;
      String driverClass = (carPrice > 2_500_000) ? "The Owners": "The passanger class";
      System.out.println(driverClass);

     
    // SWITCH STATEMENTS IN JAVA:
    // used to execute different type of code depending on expresion's value:
    // break is always used to exit the block's execution 
    // if statements can perform the same tasks but not recommended:
    int daysOfWeek = 7;
    switch(daysOfWeek){
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 6: 
        System.out.println("Sartuday");
      default:
        System.out.println("Sunday");
    }


    // FizzBuzz Game Challenge:

    // solution 1
    System.out.println("Number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    
    if ((number % 5 == 0) && (number % 3 == 0)){
      System.out.println("FizzBuzz");
    }
    else if (number % 3 == 0){
      System.out.println("Buzz");
    }
    else if (number % 5 == 0){
      System.out.println("Fizz");
    }
    else{
      System.out.println(number);
    }


    
    // solution 2
    // nesting loops

    System.out.println("Number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    if (number % 5 == 0){
      if (number % 3 == 0){
        System.out.println("FizzBuzz");
      }
      else{
        System.out.println("Fizz");
      }
      }
    else if (number % 3 == 0){
      System.out.println("Buzz");
    }
    else{
      System.out.println(number);
    }

    
