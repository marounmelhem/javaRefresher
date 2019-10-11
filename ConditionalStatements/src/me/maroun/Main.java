package me.maroun;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        //Operators:
        /*
        > greater than
        >= greater than or equal to
        < less than
        <= less than or equal to

        == equal to
        != not equal to
         */

        //If statement
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        if(10>5){ //or true/false
            System.out.println(4);
            System.out.println(5);
            System.out.println(6);
        }

        System.out.println(7);
        System.out.println(8);
        System.out.println(9);*/

        //if-else-if statement
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to superFast RollerCoaster!");
        System.out.print("Please enter your height in cm:");

        int height=scanner.nextInt();

        if(height<130){
            System.out.println("Sorry, you're too short to ride");
        }else if(height > 210){
            System.out.println("You're too tall to ride");
        }else{
            System.out.println("You're good to go!");
        }*/


        //Complex conditions with logical operators
        /*
        || (Logical OR):
        true || true - true
        true || false - true
        false || true - true
        false || false - false

        && (Logical AND):
        true && true - true
        true && false - false
        false && true - false
        false && false - false
        */

        /*Scanner scanner2 = new Scanner(System.in);
        System.out.println("Welcome to superFast RollerCoaster!");
        System.out.print("Please enter your height in cm:");

        int height = scanner2.nextInt();

        if (height < 130 || height > 210) {
            System.out.println("Sorry, you can't ride!");
        } else {
            System.out.println("You are good to go!");
        }*/


        //Checking String equality
//        System.out.println("pasta".equals("pasta")); //true
        /*Scanner scanner3 = new Scanner(System.in);
        System.out.println("The VIP Lounge");

        System.out.println("Age:");
        int age = scanner3.nextInt();

        System.out.println("Do you have VIP pass? yes/no");
        String vipPass = scanner3.next();

        if ((age >= 70) || (age >= 18 && vipPass.equals("yes"))) {
            System.out.println("Thanks, go in!");
        } else {
            System.out.println("Sorry, no can do!");
        }*/


        //Nested if-statements
        /*Scanner scanner3 = new Scanner(System.in);
        System.out.println("The VIP Lounge");

        System.out.println("Age:");
        int age = scanner3.nextInt();

        if (age >= 18) {
            System.out.println("Do you have VIP pass? yes/no");
            String vipPass = scanner3.next();

            if (vipPass.equals("yes") || age >= 70) {
                System.out.println("Thanks, go in!");
            } else {
                System.out.println("Sorry you must have a VIP pass or be over 70");
            }
        } else {
            System.out.println("Sorry, you must be over 18");
        }*/


        //Lexical Scope
        //Contexts in which variables can be used
        /*int x=10;
        if(true){
            x=20;
            int y=20;
        }
        y=20;//This is not acceptable
        */
        /*int numPets = -1;

        if (false) {

            System.out.print("Enter the number of pets you own: ");
            Scanner scanner4 = new Scanner(System.in);
            numPets = scanner4.nextInt();

        }

        System.out.println("You have " + numPets + " pets");
        */


        //Switch statements
        /*Scanner scanner5=new Scanner(System.in);
        int num = scanner5.nextInt();

        switch(num){
            case 1:
                System.out.println("You've entered 1");
                break;
            case 2:
                System.out.println("You've entered 2");
                break;
            default:
                System.out.println("Missing or invalid number");
        }*/


        //Challenge
        /*int x = 123;
        int y = 456;

        int diff = 0;

        if (x < y) {
            diff = y - x;
            System.out.format("\n %d is less than %d", x, y);
        } else if (x == y) {
            System.out.format("\n %d is equal to %d", x, y);
        } else {
            diff = x - y;
            System.out.format("\n %d is greater than %d", x, y);
        }

        System.out.format("\n The difference between %d and %d is %d",x,y,diff);
    */
        System.out.println("");
        System.out.println("======================================");
        System.out.println("Welcome to our good old guessing game!");
        System.out.println("======================================");
        System.out.println("");

        System.out.println("Enter any number between 1 and 5");

        int randNumber = ThreadLocalRandom.current().nextInt(1, 6);

        Scanner scanner6 = new Scanner(System.in);
        int userNumber;

        do {

            while (!scanner6.hasNextInt()) {
                System.out.println("That's an invalid number");
                System.out.println("Enter any number between 1 and 5");
                scanner6.next();
            }
            userNumber = scanner6.nextInt();
        } while (userNumber <= 0 || userNumber > 5);

        if(userNumber==randNumber){
            System.out.println("You've won!");
        }else{
            System.out.format("\nBetter luck next time, our system chose: %d",randNumber);
        }

    }
}
