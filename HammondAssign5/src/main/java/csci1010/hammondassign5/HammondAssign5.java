/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.hammondassign5;

import java.util.Scanner;

/**
 * CSCI 1010 - Assignment 5
 * @author Matt Hammond
 * A program that simulates a Tennis match
 */
public class HammondAssign5 {

    public static void main(String[] args) {
        System.out.println("Welcome to Matt Hammond's Tennis Match Simulator!");
        System.out.println("");
        // loop
        while (true){
            // Request User Inputs
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter the number of sets needed to win a match: ");
            int numberOfSets = keyboard.nextInt();
            System.out.print("Please enter the probabilty of player 1 winning: ");
            double probOfp1 = keyboard.nextDouble();
            System.out.print("Please enter the probabilty of player 2 winning: ");
            double probOfp2 = keyboard.nextDouble();
            //create match
            TennisMatch match1 = new TennisMatch(numberOfSets, probOfp1, probOfp2);
            match1.playMatch();
            // Ask to play another
            System.out.print("Would you like to run another sumulation? (Y/N): ");
            String playAgain = keyboard.next();
            System.out.println("");
                if (!playAgain.equalsIgnoreCase("Y")){
                    System.out.println("Thank you for using the tennis match simulator!");
                    System.exit(0);     
                }
            
    }
    }
}
