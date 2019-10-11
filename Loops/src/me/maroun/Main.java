package me.maroun;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        //While Loop

        /*while (true){
            System.out.println("This will run forever...");//Infinite loop
        }
         */

        /*int i = 0;
        while (true) {
            i++;
            if (i > 10) {
                break;
            }
            System.out.format("\nRunning for %d", i);
        }*/

        /*int y = 0;
        while (y<10) {
            y++;
            System.out.format("\nRunning2 for %d", y);
        }
        */


        //For loop
        /*for(int m=1;m<=10;m++){
            System.out.format("\n This would run for 10 iterations: %d/10",m);
        }*/

        //Break and continue
        /*for(int i=1;i<=5;i++){
            if(i==2){
                continue;//Loop would only skip 2
            }

            if(i==4){
                break;//Loop would stop after 4
            }
            System.out.println(i);
        }
         */

        //Do-while
        /*int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 5);

        Scanner scanner = new Scanner(System.in);
        String again;

        do {
            int randNbr = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.format("\nYou rolled a %d ", randNbr);
            System.out.println("\nRoll again? y/n");
            again = scanner.next();
        } while (again.equals("y"));
         */


        //Modulo operator (remainder of division)
        //Can be used to check if a number is multiple of another
        /*
        System.out.println(9%2); //Returns the remainder
        System.out.println(15%5 == 0); //Returns true
        System.out.println(15%2 == 0); //False because 15 is odd
        System.out.println(14%2 == 0); //True because 14 is even
         */


        //Challenge
        //Q1
        /*for (int i = 89; i <= 117; i++) {
            System.out.println(i);
        }

        //Q2
        for (int i = 1; i <= 40; i++) {

            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print(" - Quack");
            }
            System.out.println("");
        }
*/

        //Q3
        /*
        Scanner scn = new Scanner(System.in);
        String correctPw = "shark50";
        String pw;
        int i = 0;
        int allowedAttempts = 3;

        do {
            i++;
            System.out.format("\n Enter your password: (%d/%d)\n", i, allowedAttempts);
            pw = scn.next();
        } while (!pw.equals(correctPw) && i < allowedAttempts);

        if(pw.equals(correctPw)){
            System.out.println("Access Approved!");
        }else{
            System.out.println("You're blocked from trying again");
        }
        */

        //Q4
        /*
        int i=0;
        while(i<=10){
            System.out.print(i);
            if(i==10){
                System.out.print(".");
            }else{
                System.out.print(", ");
            }
            i++;
        }
         */

        //Q5
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int userNbr;
        int i=0;
        do {
            i++;
            Scanner scn = new Scanner(System.in);
            System.out.format("\nEnter any number between 1 and 100: (%d) ",i);
            userNbr=scn.nextInt();

            if(userNbr<randomNumber){
                System.out.println("HIGHER");
            }else if(userNbr>randomNumber){
                System.out.println("LOWER");
            }
        } while (userNbr != randomNumber);

        System.out.format("\nCORRECT! It took you %d guesses",i);
    }
}
