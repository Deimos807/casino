package assignment4_000828420;
/**
 * Gavin Lisi 
 *  14/06/2021
 *  Casino application, allows user to select a number between a number of slot machines to spin and 
 *  record and outcome
 */

import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userChoice; // used to ask the user what to do once
        int secondChoice; // used to ask the user for a second choice
        do { // Do while loop keeping the user prompted with things to do until they enter 0
            System.out.println("Enter 1 for a slot machine with 3 wheels and 7 faces.");
            System.out.println("Enter 2 for a slot machine with 5 wheels and 8 faces");
            System.out.println("Enter 0 to quit");
            userChoice = input.nextInt();
            if (userChoice == 1){
                System.out.println("Enter 1 to spin once, enter 2 to spin a million times");
                secondChoice = input.nextInt();
                if (secondChoice == 1){
                    SlotMachine slot1 = new SlotMachine(new String[]{"7", "BAR", "Lemon", "Orange", "Cherries", "Star", "1", "Emerald"},3 );
                    slot1.SlotMachineSpin();
                    slot1.check();
                    System.out.println(slot1);
                }

                if (secondChoice == 2){
                    SlotMachine slot1 = new SlotMachine(new String[]{"7", "BAR", "Lemon", "Orange", "Cherries", "Star", "1", "Emerald"},3 );
                    slot1.Histogram();
                    System.out.println(slot1);
                }

            }
            if (userChoice == 2){
                System.out.println("Enter 1 to spin once, enter 2 to spin a million times");
                secondChoice = input.nextInt();
                if (secondChoice == 1){
                    SlotMachine slot2 = new SlotMachine(new String[]{"Lime", "8", "Banana", "Diamond", "Watermelon", "Grapes", "Heart", "Coin"}, 5);
                    slot2.SlotMachineSpin();
                    slot2.check();
                    System.out.println(slot2);
                }
                if (secondChoice == 2) {
                    SlotMachine slot2 = new SlotMachine(new String[]{"Lime", "8", "Banana", "Diamond", "Watermelon", "Grapes", "Heart", "Coin"}, 5);
                    slot2.Histogram();
                    System.out.println(slot2);
                }
            }
        } while (userChoice != 0);

    }

}
