/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.hammondassign3;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond 
 * CSCI 1010 - Assignment 3 
 * A Dog Age Calculator
 */
public class HammondAssign3 {

    public static void main(String[] args) {
        //declare variables
        String dogName;
        double dogAge;
        double dogWeight;
        double dogHumanAge;
        String userAns;
        // display welcome
        System.out.println("Welcome to Matt Hammond's Dog Age Calculator!");
        System.out.println("");
        // Ask user for name of dog
        do {
            System.out.print("Please enter the name of your dog: ");
            Scanner keyboard = new Scanner(System.in);
            dogName = keyboard.next();
            // ask user for age of dog repeatedly until age of dog is between 1 and 16/ 
            do {
                System.out.print("Please enter the actual age of your dog (1-16): ");
                dogAge = keyboard.nextInt();
                if (dogAge <= 0 || dogAge > 16) {
                    System.out.println("Error: Age is out of range.");
                }
            } while ((dogAge <= 0) || (dogAge > 16));
            // ask user for weight repeatedly until above zero
            do {
                System.out.print("Please enter your dog's weight in pounds: ");
                dogWeight = keyboard.nextInt();
                if (dogWeight <= 0) {
                    System.out.println("Error: weight must be greater than zero.");
                }
            } while (dogWeight <= 0);
            // display age of dog in human years with name they entered
            if (dogAge == 1) {
                System.out.println("");
                System.out.println(dogName + "'s age in human years is 15.");
            } else if ((dogAge >= 2) && (dogAge <= 5)) {
                dogHumanAge = ((dogAge * 4) + 16);
                System.out.println("");
                System.out.println(dogName + "'s age in human years is " + (int) dogHumanAge + ".");
            } else if ((dogAge >= 6) && (dogAge <= 16)) {
                if (dogWeight <= 20) {
                    dogHumanAge = (dogAge * 4) + 16;
                    System.out.println("");
                    System.out.println(dogName + "'s age in human years is " + (int) dogHumanAge + ".");
                }
                if ((dogWeight >= 21) && (dogWeight <= 50)) {
                    dogHumanAge = (dogAge * 4.5) + 15;
                    System.out.println("");
                    System.out.println(dogName + "'s age in human years is " + (int) dogHumanAge + ".");
                }
                if (dogWeight > 50) {
                    dogHumanAge = (dogAge * 7.5);
                    System.out.println("");
                    System.out.println(dogName + "'s age in human years is " + (int) dogHumanAge + ".");
                }
            }
            // ask user if they want to do another dog
            System.out.println("");
            do {
                System.out.print("Would you like to calculate the age of another Dog? (Y/N): ");
                userAns = keyboard.next().toUpperCase();
                if (userAns.equalsIgnoreCase("Y")) {
                } else if (userAns.equalsIgnoreCase("N")) {
                    System.out.println("Thank you for using the dog age calculator!");
                } else {
                    System.out.println("Error: Invalid Choice");
                }
            } while (!userAns.equals("Y") && !userAns.equals("N"));
        } while (userAns.equals("Y"));

    }
}
