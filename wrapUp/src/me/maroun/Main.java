package me.maroun;

import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
//        ticTacToe();
        primeNumbers();
    }

    static void primeNumbers() {
        System.out.println("Enter max number to check for prime:");
        int maxPrime = scn.nextInt();
        int totalPrime = 0;

        for (int i = 0; i < maxPrime; i++) {
            if (primeNumberChecker(i)) {
                totalPrime++;
                System.out.println(i + " is a prime (0 => " + maxPrime + ")");
            }
        }

        System.out.println("\n\n Found: " + totalPrime);
    }

    static boolean primeNumberChecker(int num) {

        boolean isPrime = true;

        //Added div*div to make to process run way more faster
        for (int div = 2; div * div <= num; div++) {
            if (num % div == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }

    //Coding tic-tac-toe Q1
    static void ticTacToe() {

        char[] pos = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';

        System.out.println("");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("==========TIC TAC TOE==========");
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");

        System.out.println(" 7 | 8 | 9 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 1 | 2 | 3 ");

        while (true) {
            do {
                System.out.println("\n" + turn + "=> Enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

            pos[input - 1] = turn;

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            if (pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[6] == turn && pos[3] == turn && pos[0] == turn
                    || pos[7] == turn && pos[4] == turn && pos[1] == turn
                    || pos[8] == turn && pos[5] == turn && pos[2] == turn
                    || pos[6] == turn && pos[4] == turn && pos[2] == turn
                    || pos[0] == turn && pos[4] == turn && pos[8] == turn
            ) {
                System.out.println("\nCongrats, " + turn + "! You've won!");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }
        }
    }
}