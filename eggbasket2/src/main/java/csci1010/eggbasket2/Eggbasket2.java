/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.eggbasket2;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class Eggbasket2 {

    public static void main(String[] args) {
         System.out.println("Egg Basket");
        int numberOfBaskets;
        int eggsPerBasket;
        int totalEggs; 
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the number of eggs in each basket: ");
        eggsPerBasket = keyboard.nextInt();
        System.out.println("Enter the number of baskets: ");
        numberOfBaskets = keyboard.nextInt();             
        
        
        totalEggs = numberOfBaskets * eggsPerBasket; 
        
        // show the results
        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs); 
    }
}
