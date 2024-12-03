/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.enumdemo;

/**
 *
 * @author Matt Hammond
 */
public class EnumDemo {

    public static void main(String[] args) {
        System.out.println("Enum Demo");
        Suit s = Suit.SPADES;
        Suit h = Suit.HEARTS;
        
        System.out.println("Card 1 = " + s + " which is " + s.getColor());
        System.out.println("Card 2 = " + h + " which is " + h.getColor());
    }
}
