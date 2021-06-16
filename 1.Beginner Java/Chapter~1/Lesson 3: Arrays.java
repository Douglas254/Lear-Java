
   // ARRAYS:
    // used to store list of items
    // "new" keyword is used because they are referance type
    int[] arrayNum = new int[5];
    arrayNum[0] = 2;
    arrayNum[1] = 4;
    arrayNum[2] = 6;
    arrayNum[3] = 8;
    // to print all array you have to convert them to strings, otherwise prints address index:
    System.out.println(arrayNum);
    System.out.println(Arrays.toString(arrayNum)); // this imports the array
    // also N/B unassigned int values set to 0, boolean= false, string = " "

    // Easy way is to use curl braces
    int[] numbers = {2, 4, 6, 8, 10, 1, 3, 5, 7, 12, 20};
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers.length); // Returns the total number of elements in array;
    Arrays.sort(numbers); // sorts values in an array:
    System.out.println(Arrays.toString(numbers)); // sorts values in ascending order for integers;

    // MULTI-DIMENTIONAL ARRAYS:
    // working with 2 dimentional array
    // to print use "deepToString" and not toString
    int[][] number2D = new int[2][3];
    number2D[0][0] = 2;
    number2D[1][0] = 4;
    number2D[1][1] = 6;
    number2D[0][2] = 8;

    System.out.println(Arrays.deepToString(number2D));

    // 2-D arrays in Curl brackets:
    int[][] twoDArray = {{2,4,6},{8,10,12}};
    System.out.println(Arrays.deepToString(twoDArray));
