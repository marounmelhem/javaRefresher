package me.maroun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Arrays
        //Initialize an array
        int[] randNbrs = {75, 290, 350, 7, 4192};

        //Updating array values
//        randNbrs[3] = 51;

        //Print array values
//        System.out.print(randNbrs[3]);

        //Print all values
//        for (int i = 0; i < randNbrs.length; i++) {
//            System.out.println(randNbrs[i]);
//        }


        //Adaptive iterations
        //use arr.length to get the items length
        //Run array backwards
//        for (int i = randNbrs.length - 1; i >= 0; i--) {
//            System.out.println(randNbrs[i]);
//        }


        //Simple processing on array
        /*int count = 0;
        int total=0;
        for (int i = 0; i < randNbrs.length; i++) {
            if (randNbrs[i] > 100) {
                count++;
            }

            //Increment array values
            total=total+randNbrs[i];
        }
        System.out.format("%d numbers are greater than 100\n",count);
        System.out.format("%d is all numbers total\n",total);
         */

        //Size/types
        //A size/length of an array is fixed and cannot be changed
        //Create a flexible array
        /*int[] bar = new int[3]; //Default values of 0

        //Create arrays of other types
        double[] foo = new double[3]; //Default values of  0.0
        boolean[] bool = new boolean[3];
        bool[1] = true;

        String[] predictions = new String[3];
        predictions[0] = "a pioneer";
        predictions[1] = "loved by many";
        predictions[2] = "very wealthy";

        Scanner arrScan = new Scanner(System.in);
        System.out.println("I will predict your future, choose a number (1/2/3)");
        int fortuneTeller = arrScan.nextInt();
        System.out.println("Your future: "+predictions[fortuneTeller-1]);
         */


        //Inputting data and generating a statistic
        /*Scanner arrScan = new Scanner(System.in);
        System.out.println("Number of laps:");
        int numberOfLaps = arrScan.nextInt();

        double[] lapTimes = new double[numberOfLaps];
        double fastestTime = 0;

        for (int i = 0; i < numberOfLaps; i++) {
            System.out.print("Lap time: ");
            lapTimes[i] = arrScan.nextDouble();

            if(i==0){
                fastestTime=lapTimes[i];
            }else{
                if (lapTimes[i] < fastestTime) {
                    fastestTime = lapTimes[i];
                }
            }
        }

        System.out.println("Your fastest time is: "+fastestTime);
        */


        //Challenge
        //Q1
        /*int[] arbArr = new int[10];
        arbArr[0] = 1;
        arbArr[1] = 2;
        arbArr[2] = 3;
        arbArr[3] = 4;
        arbArr[4] = 5;
        arbArr[5] = 6;
        arbArr[6] = 7;
        arbArr[7] = 8;
        arbArr[8] = 9;
        arbArr[9] = 10;

        for (int i = 0; i < arbArr.length; i++) {
//            System.out.println(arbArr[i]);
        }

        //Q2
        int[] arbArr2 = new int[20];
        for (int i2 = 0; i2 < arbArr2.length; i2++) {
            arbArr2[i2] = i2 + 1;
        }

        for (int i3 = arbArr2.length-1; i3 >= 0; i3--) {
            System.out.println(arbArr2[i3]);
        }
        */

        //Q3
        double[] arbArr3 = new double[5];
        arbArr3[0] = 0.1;
        arbArr3[1] = 1.2;
        arbArr3[2] = 2.3;
        arbArr3[3] = 3.4;
        arbArr3[4] = 4.5;

        double arbArr3Sum = 0;
        for (int i4 = 0; i4 < arbArr3.length; i4++) {
            arbArr3Sum = arbArr3Sum + arbArr3[i4];
        }

        System.out.println("Sum is: "+arbArr3Sum);
        System.out.println("Avg is: "+arbArr3Sum/arbArr3.length);
    }
}
