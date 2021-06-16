
   // STRINGS:
    // Removing string from their literal and placing them in values
    // They are of reference type and no need of 'new' key words
    System.out.println("Hello World !");
    String myName = " Douglas Obara ";
    System.out.println(myName);

    // String concatenation
    String mySchool = "Kabarak " + "University";
    System.out.println(mySchool);

    // Strings with methods:
    boolean booleanEndsWith = mySchool.endsWith("ty"); //endsWith method
    System.out.println(booleanEndsWith);
    System.out.println(mySchool.startsWith("mk")); // returns False
    System.out.println(myName.length()); // call length of string characters (n/b: spaces counted)
    System.out.println(mySchool.indexOf("a")); // returns index of first char occurance
    System.out.println(myName.replace("o", "O")); // takes in a target and replpacement values

    String shoutHey = "Hey !!! ";
    System.out.println(shoutHey.replace("!", "@")); // saves the value to new variable, does not modify 1st one
    System.out.println(shoutHey); // returns the original value without modification

    System.out.println(myName.toLowerCase());
    System.out.println(myName.toUpperCase());
    System.out.println(myName.trim()); // remove unnecessary white spaces

    // ESCAPING CHARACCTERS IN JAVA
    String doubleQuote = "I am the \"local man\" coding java";
    System.out.println(doubleQuote);
    String driveLocation = "\\usr\\bin\\local...";
    System.out.println(driveLocation);
    System.out.println("welcome \n to Java \n python");
    System.out.println("I love\t using\t tabs\n");
