
    // WHILE LOOP:
    // used mostly when we don't know the exact number of iterations to perform


    int i = 5;
    while(i>0){
      System.out.println("current score: " + i);   //be aware of infinite loops, (dont forget --)
      i--;
    }

    int a =1;
    while(a<=5){
      System.out.println("hello at number: " + a);
      a++;
    }


    // challenge
    // create a program to get user input;
    String exitgame = "";
    Scanner scanner = new Scanner(System.in);
    while(!exitgame.equals("exit")){
      System.out.print("Input: ");
      exitgame = scanner.next().toLowerCase();
      System.out.println("Entered: " + exitgame);
    }


    // DO WHILE LOOPS:
    // Always get's executed atleast once:
    // conditions are checked later and not at first


    Scanner scanner = new Scanner(System.in);
    String game = " ";
    do{
      System.out.println("Enter Number: ");
      game = scanner.next();
      System.out.println("You just entered :" + game);
    }while(!game.equals("over"));


    
    // BREAKING AND CONTINUE IN LOOPS:
    // using above example, make sure the "over" is not printed
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(!gameover.equals("over")){
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if(!gameover.equals("over"))  // exits without printing 
        System.out.println("Entered: "+ gameover);
    }


    // break without using the not operator ! 
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(!gameover.equals("over")){
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if(gameover.equals("over"))
        break;  // exits without printing 
      System.out.println("Entered: "+ gameover);
    }


    // continue;
    // used to move to the start of a loop or next block without breaking a condition
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(!gameover.equals("over")){
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if (gameover.equals("pass"))
        continue;
      if(!gameover.equals("over"))  // exits without printing 
        System.out.println("Entered: " + gameover);
    }


    // simplify by removing repeated code:
    String gameover = " ";
    Scanner scanner = new Scanner(System.in);
    while(true){  // simplified 
      System.out.println("Enter Number: ");
      gameover = scanner.next();
      if (gameover.equals("pass"))
        continue;
      if (gameover.equals("over"))  // removed the not operator and set it to true value
        break;
      System.out.println("Entered: " + gameover);
    }


    // LOOPING ARRAYS: 
    
    String[] laptops = {"Apple","HP","Toshiba","Lenovo"};
    for (int i = 0; i<laptops.length; i++){
      System.out.println(laptops[i]);
    }

    // looping using declared data type
    for (String laptop : laptops){  
      System.out.println(laptop);
    }


    
    
    // FINAL PROJECT:
    // mortgage calculator:

    final byte MONTHS_IN_YEARS = 12;
    final byte PERCENT = 100;
    
    int principal = 0;
    float monthlyIntrest = 0;
    int numberOfPayments = 0;

    Scanner scanner = new Scanner(System.in);
    
    while(true){
      System.out.println("Principal amount");
      principal = scanner.nextInt();
      if(principal>= 1_000 && principal <= 1_000_000)
        break;
      System.out.println("Enter number between $1 and $1000");
    }
    while(true){
    System.out.println("Annual Intrest Rate: ");
    float annualIntrest = scanner.nextFloat();
    if (annualIntrest >=1 && annualIntrest<=30){
      monthlyIntrest = annualIntrest/PERCENT/MONTHS_IN_YEARS;
      break;
      }
    }
    while(true){
      System.out.println("Period in years: ");
      byte years = scanner.nextByte();
      if(years >= 1 && years <= 30){
        numberOfPayments = years * MONTHS_IN_YEARS;
        break;
      }
      System.out.println("Enter value between 1 and 30: ");
      
      double mortgage = principal
                      * (monthlyIntrest * Math.pow(1 + monthlyIntrest, numberOfPayments))
                      /(Math.pow(1 + monthlyIntrest, numberOfPayments));
      String mortgageFormated = NumberFormat.getCurrencyInstance(mortgage);
      System.out.println("mortgage: " + mortgageFormated);

