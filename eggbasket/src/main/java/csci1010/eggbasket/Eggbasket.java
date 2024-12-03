/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.eggbasket;

/**
 *
 * @author Matt Hammond
 */
public class Eggbasket {

    public static void main(String[] args) {
        System.out.println("Egg Basket");
        int numberOfBaskets;
        int eggsPerBasket = 6;
        int totalEggs; 
        
        numberOfBaskets = 10; //assign number of baskets
        
        totalEggs = numberOfBaskets * eggsPerBasket; 
        
        // show the results
        System.out.println("If you have");
        System.out.println(eggsPerBasket + " eggs per basket and");
        System.out.println(numberOfBaskets + " baskets, then");
        System.out.println("the total number of eggs is " + totalEggs); 
        
    }
}
