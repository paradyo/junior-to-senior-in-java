import java.math.BigDecimal;

public class DataTypes {
    public static void main(String[] args){
        /*
        Primitive Data Types
        Stores simple values in stack.
        Their sizes are already defined into the Java system.
        You cannot predefine a value.


        None-Primitive (Reference) Data Types
        Stores the values in heap.
        Stores class objects and various type of array variables come under
        reference datatype.
        Reference variables are created using defined constructors of the classes.
        Their default values are null.
        A reference variable can be used to refer to any object of declared type
        or any compatible type.
        Example: Fish fish = new Fish('Shark')
         */

        int integerData = 2147483647;
        boolean booleanData = true;
        byte byteData = 127;
        char charData = 'a';
        short shortData = 32767;
        long longData = 9223372036854775807L;
        float floatData = 3.1234567f; // Temperatures etc. Never for currency!
        double doubleData = 3.123456789123456789124124124; //math functions


        //BigDecimal currencyData = new BigDecimal();

        //Using underscore for more readable code.
        int integerDataWithUnderscore = 2_147_483_647;
        long longDataWithUnderscore = 9223372036854775807L;
        float floatDataWithUnderscore = 9.1234f;
        /*
        You can place underscores only between digits; you cannot place underscores in the following places:
            At the beginning or end of a number
            Adjacent to a decimal point in a floating point literal
            Prior to an F or L suffix
            In positions where a string of digits is expected
         */

        // Using Literals on Long Datatypes
        long longData2 = 9223372036854775807L; //Better use L instead of l
        // We don't use literals on int, short or byte datatypes. Only long.

        // Using Literals on Double Datatypes
        double d1 = 123.4;
        // same value as d1, but in scientific notation
        double d2 = 1.234e2;

        // Using Literals on Character and String Datatypes
        String string1 = "S\u00ED Se\u00F1or";
        /*
        "S\u00ED Se\u00F1or" (Sí Señor in Spanish).
        Always use 'single quotes' for char literals and
        "double quotes" for String literals.

        The Java programming language also supports a few special
         escape sequences for char and String literals:
         \b (backspace), \t (tab), \n (line feed),
         \f (form feed), \r (carriage return),
         \" (double quote), \' (single quote),
         and \\ (backslash).
         */

        //More about char and String
        char charData2 = 'a';
        //char charData3 = "a"; //That's wrong.
        // Enclosing your character string within double quotes will
        // automatically create a new String object.


        // String objects are immutable. Why?
        //Code Source: https://www.scaler.com/topics/why-string-is-immutable-in-java/
        String s1 = "Hello"; // String literal
        String s2 = "Hello"; // String literal
        String s3 = s1; // same reference
        //Changing the value of s1
        s1 = "Java";

        //Updating with concat() operation
        s2.concat(" World");

        //The concatenated String will be created as a new instance and an object should refer to that instance to get the concatenated value.
        String newS3 = s3.concat(" Scaler");

        System.out.println("s1 refers to " + s1);
        System.out.println("s2 refers to " + s2);
        System.out.println("s3 refers to " + s3);
        System.out.println("newS3 refers to " + newS3);


        //ARRAYS
        // declares an array of integers
        int[] anArray;
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // allocates memory for 10 integers
        anArray = new int[10];

        int[] anAnotherArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);


        // Multi-Dimensional Arrays
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

    }
}
