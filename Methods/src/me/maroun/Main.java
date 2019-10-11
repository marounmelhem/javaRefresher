package me.maroun;

import java.util.Scanner;

public class Main {
    //1-Introduction to methods
    /*public static void main(String[] args) {
        System.out.println("main ref 1");
        //Call other methods
        foo();
        System.out.println("main ref 2");
        //Each method creates a separate instance (variables won't overlap)
        foo();

        //foo should not call bar or else we'll have an infinite loop (methods are designed to be self contained)
        //Every reference of a function is added to a stack
        bar();

    }

    public static void foo() {
        String x = "foo ref 1";

        System.out.println(x);
        System.out.println("foo ref 2");
    }

    public static void bar(){
        System.out.println("bar ref 1");
        foo();
    }*/


    //2-Passing data to methods
    /*public static void main(String[] args) {
        int x = 123;
        //Foo requires an argument
        foo(x,57.5,"caramel");
    }

    public static void foo(int a,double b, String c) {
        System.out.println(a+b+" "+c);
    }*/


    //Returning data from methods
    /*public static void main(String[] args) {
        foo(3);
        int val=bar();
        System.out.println(val);
    }

    public static void foo(int a) {
        if (a < 5) {
            return;
        }
        System.out.println(a);
    }

    //Void means the method returns no data
    //void should be changed to the return type int/double/String
    public static int bar() {
        return 49;
    }
    */


    //4-Passing and returning data
    /*public static void main(String[] args) {
//        System.out.println(add(5, 10));
//        System.out.println(add(5, 10) * add(123, 89));
//        System.out.println(add(add(5, 10),add(5, 10) * add(123, 89)));
        System.out.format("%.4f",coneVolume(4, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double coneVolume(double r, double h) {
        return Math.PI * r * r * h / 3; //Math.PI = 3.141...
    }
     */


    //5-References part 1
    /*public static void main(String[] args) {
        //References works fine for variables
        int a = 10;
        int b = a;

        //But not for arrays:
        int[] x = {3, 22, 4, 16, 8};
        int[] y = x;
        //x would contain the memory location (address) of the array NOT the array => x=0x0035flab (not the array)
        //Changing y array would also change x (WHICH IS WRONG)

        //References of types
        Scanner sc = new Scanner(System.in); //A new scanner is created in memory and sc is a reference to it

        //6-References part 2
        //How to reference arrays
        int[] x2 = {3, 22, 4, 16, 8};
        int[] y2 = new int[5];
        x = y;


        //Passing arrays to methods
        int[] x3 = {3, 22, 4, 16, 8};
        foo(x3);
    }

    public static int[] foo(int[] c) {
        return c;
    }
     */


    //7- Classic/static members

    //Delaring x as a global variable
    static int x=5;
    static Scanner aScanner=new Scanner(System.in);

    //Static methods are called class members
    public static void main(String[] args){
        System.out.println(x);
        bar();
        foo();
    }

    static void foo(){
        System.out.println("Enter new value for x");
        x=aScanner.nextInt();
        System.out.println(x);
    }

    static void bar(){
        System.out.println(x);
    }
}
