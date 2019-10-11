package me.maroun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] guests = new String[10];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1- Display all guests");
            System.out.println("2- Add guest");
            System.out.println("3- Remove guest");
            System.out.println("4- Exit");

            System.out.print("\nOption: \n");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    System.out.println(guests[i]);
                }
            } else if (option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                guests[0] = name;
            } else if (option == 4) {
                break;
            }
        } while (true);

        System.out.println("Exiting...");
    }
}
