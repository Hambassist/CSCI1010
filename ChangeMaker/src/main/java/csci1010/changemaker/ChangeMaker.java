/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.changemaker;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class ChangeMaker {

    public static void main(String[] args) {
        // prompt user for amount
        System.out.println("Enter a whole number from 1 to 99.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amound of change.");
        Scanner keyboard = new Scanner(System.in);
        int amount = keyboard.nextInt(); 
        int originalAmount = amount;
        //find number of quarters
        int quarters = amount / 25;
        amount = amount % 25;
       // System.out.println("original amount " + originalAmount);
       // System.out.println("amount " + amount);
       // System.out.println("quarters " + quarters);
        // find the number of dimes
        int dimes = amount / 10;
        amount = amount % 10;             
       // find the number of nickles
        int nickels = amount / 5;
        amount = amount % 5;
        // find the number of pennies
        int pennies = amount;
        // display results
        System.out.println(" cents in couns can be given as:");
        System.out.println("Quarters " + quarters);
        System.out.println("Dimes " + dimes);
        System.out.println("Nickels " + nickels);
        System.out.println("Pennies " +pennies);
    }
   }
