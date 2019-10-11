package me.maroun;

//Required for scanner to work

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scan/Read user input
        /*Scanner scanner = new Scanner(System.in);

        //Wait for user to input text and store it in a variable
        System.out.println("Please identify yourself:\n");
        String userName = scanner.next(); //Scans a string

        //Return entered text
        System.out.println("\nHello, " + userName + "! Nice to have you around.");

        //Request Age
        System.out.println("\nNow, how old are you?");
        int userAge = scanner.nextInt(); //Scans an integer

        //Return concatenated text
        System.out.println("\n" + userName + ", you are: " + userAge + " years old!");

        //Request Height + Format height example
        System.out.println("\nAlso, how tall are you (in m)?");
        double userHeight = scanner.nextDouble(); //Scans a double
        System.out.println("\nYou are " + userHeight + "m tall");

        //Return height status
        double avgMaleHeightDifferent = userHeight - 1.75;
        double avgFemaleHeightDifferent = userHeight - 1.62;

        System.out.println("\nThe difference between your height and the average is:");
        System.out.format("\nMale: %.2fm", avgMaleHeightDifferent);
        System.out.format("\nFemale: %.2fm", avgFemaleHeightDifferent);

        //Print format
        //Float: %f (.1%f according to required decimal)
        //Int: %d
        //String: %s
//        System.out.println(4.5-2.7); //Returns 1.799999998
//        System.out.format("I have %d cats for %s that cost %.1f$!",7,"Jess",4.5-2.7);*/


        //Scanners Recap
//        Scanner scn = new Scanner(System.in);
//        scn.next();
//        scn.nextInt();
//        scn.nextDouble();
//        boolean b = scanner.nextBoolean();

        //Scanners tokens: Each token is separated by a space => 9 Rubies: 2 tokens
        //Since each token is separated by space, we can use scn.nextLine() to get multiple words from same input
        /*System.out.println("Enter your full name");
        String fullName=scn.nextLine();
        System.out.println("Your full name is: "+fullName);*/


        //Challenge
        Scanner userScn = new Scanner(System.in);

        /*System.out.println("Enter your name:");
        String userName = userScn.nextLine();
        int userNameLength = userName.length();

        System.out.println("Enter your age:");
        int userAge = userScn.nextInt();
        int doubleAge = 2 * userAge;

        System.out.format("\nYou've lived %d years. In another %d years you'll be %d years old", userAge, userAge, doubleAge);
        System.out.format("\n%s, your name consists of %d characters", userName, userNameLength);*/

        System.out.println("Restaurant bill calculator");
        System.out.println("Enter bill amount:");
        double billAmount = userScn.nextDouble();

        System.out.println("Enter number of people:");
        int totalPeople = userScn.nextInt();

        double amountPerPerson = billAmount / totalPeople;
        System.out.format("Each person should pay: %.2f",amountPerPerson);

    }
}
