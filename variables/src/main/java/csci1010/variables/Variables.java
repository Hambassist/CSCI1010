/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.variables;

/**
 *
 * @author Matt Hammond
 */
public class Variables {

    public static void main(String[] args) {
        System.out.println("Maths");
        int amount = 40;
        double price = 3.13;
        double tax = 0.078;
        int loss = 6;
        
        //double totalCost = amount * price;
        //double totalCost = price / amount;
        //double totalCost = price + (tax * price);
        //double totalCost = amount / loss;
        //int totalCost = 5;
        //totalCost++;
        //price = price + 5.0;
        price += 5.0;  //same as above statement
        double totalCost = price;
        
        System.out.println("Total Cost: " + totalCost);
        
        
    }
}
