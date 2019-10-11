package me.maroun;

public class Main {

    public static void main(String[] args) {
        /*Intro START*/

        //\n => New line
        //\t => New tab
        //\b => Backspace

        // MM said, you should "escape" your sentences
//        System.out.println("MM Said, you should \"escape\" your sentences\n");

        //Printing from another method
//        aMethod();

        // Path is: /home/mm/mmDev/mmJava/javaRefresher/HelloWorld not \home\mm\mmDev\mmJava\javaRefresher\HelloWorld
//        System.out.println("Path is: /home/mm/mmDev/mmJava/javaRefresher/HelloWorld not \\ home\\mm\\mmDev\\mmJava<\\javaRefresher\\HelloWorld\n\n");

        //Example
//        System.out.print("SHOPPING LIST\n\t - Milk\n\t\t> Semi-skimmed\n\t\t> Medium\n\t - Eggs\n\t\t > Free-range\n\t- Bread");
//        System.out.println("The");
//        System.out.println("\tCake");
//        System.out.println("Is\t\t\tA");
//        System.out.println("\tLie.");

        /*Intro END*/

        /* Variables START*/


        //Operators
        // + - * / (): operators
        // =: assignment operator
        //Variable declaration:
//        int guitar = 10;
//        double x = 2.5;
//        double y = guitar + x;

        //Data types
        //Primitive types and referenced types
        //Primitive data type: byte, short, int, long, float, double, boolean, char (literal)
        //Byte: -128 to 127
        //Short -32768 to 32767
        //Int: -2147483648 to 2147483647
        //Long: -9223372036854775808 to 9223372036854775807
        //Float: varies
        //Double: varies
        //Boolean: true/false
        //Char: 0 to 65535

        //Changing variables declarations
//        int m=15;
//        System.out.println(m);
//        m=32;
//        System.out.println(m);


        //Divisions:
//        System.out.println(15/6); //=> Should be 2.5 not 2
//        System.out.println(15.00/6.00); //=> Will return 2.5
        //OR
//        double m1=15;
//        double m2=6;
//        System.out.println(m1/m2); //Would return double answer


        //Boolean:
        // Only has 2 values: true/false
//        int a = 27;
//        double b=14.27;
//        boolean c=false;
//        System.out.println(c);


        //Char:
        //Has to be entered between quotes ''
        char d = 'z';
        char c = 169; //Copyright symbol
        char d2 = '\u005A'; //Unicode
//        String name = "Maroun Melhem "; //String is a referenced data type
//        System.out.println(name + c); //String concatenation


        //Variable Names
        //camelCase: statueHeightInMeters
        //snake_case: statue_height_in_meters
        //Letters / Numbers / _ / $ (cannot start with a number, shouldn't include $)


        //Type Casting
        double foo = 5.27;
        int bar = (int) foo;
//        System.out.println(bar);

        int foo2 = 17;
        int bar2 = 4;
        System.out.println(((double) foo2) / ((double) bar2));

        /* Variables END*/


    }

    public static void aMethod() {
        System.out.println("Message 1 from method aMethod");
        System.out.println("Message 2 from method aMethod\n\n");
    }
}
