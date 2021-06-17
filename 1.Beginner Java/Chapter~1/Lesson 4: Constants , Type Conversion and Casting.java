    // JAVA CONSTANTS:
    // used when we have values that need to remain the same all throughout the program
    // "final" keyword is used before any data type

    final float transactionRate = 5.25F;
    final float areaCircle = 3.412F;

    // values for this case cannot be reassigned here.
    System.out.println(transactionRate);
    System.out.println(areaCircle);

    // MATHS IN JAVA
    // addition, subtraction, division, multiplication;
    double i = 20;
    double j = 10.5;

    int addition = 20 + 10;
    int subtraction = 20 - 10;
    int division = 9 / 3;
    double interest = (double)10 / (double)3; // casting to allow double values
    int remainder = 10 % 2;
    double area = j * i;

    System.out.println(addition);
    System.out.println(subtraction);
    System.out.println(division);
    System.out.println(remainder);
    System.out.println(intrest);
    System.out.println(area);

      // Values increment and decrement
    int x = 2;
    int y = ++x;
    int z = x++;
    System.out.println(y);
    System.out.println(z);

    // augmented operators (+=, /=, *=)
    int i = 2;
    i = i + 2;
    System.out.println(i);
    i += 2;
    System.out.println(i);
    
    // flow of execution:
    // BODMAS
    int x = 10 + 5 * 8;
    int j = (10 + 5) * 8;

    System.out.println(x);
    System.out.println(j);


    // TYPE CONVERSION & CASTING:
    // conversion happend from: byte>short>int>long>float>double
    int a = 20;  // 4 bytes
    short b = 5; // 2 bytes
    System.out.println(a + b); // Integrated Development Environment(IDE) does implicit conversion to one of the type and performs the operation


    // Explicit conversion:
    int a = 5;
    double b = 5.5;
    int results = (int)b + a;  // casting a double to an integer
    System.out.println(results);


    //Strings and integers:
    String myAge = "23";
    int weekDays = 7;
    String weight = "70.50";
    double weightSum = Double.parseDouble(weight) + Integer.parseInt(myAge);
    System.out.println(weightSum);
    int total_sum = Integer.parseInt(myAge) + weekDays;
    System.out.println(total_sum);
