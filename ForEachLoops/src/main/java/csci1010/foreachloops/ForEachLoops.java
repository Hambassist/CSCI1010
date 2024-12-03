/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.foreachloops;

/**
 *
 * @author Matt Hammond
 */
public class ForEachLoops {

    public static void main(String[] args) {
        System.out.println("Foreach loops");
        
        enum Suit {CLUBS, DIAMONDS, HEARTS, SPADES, JOKERS}
        
        for (Suit nextSuit : Suit.values()){
            System.out.println(nextSuit + " ");            
        }
        
        
        
    }
}
