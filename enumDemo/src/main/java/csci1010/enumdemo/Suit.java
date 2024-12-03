/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.enumdemo;

/**
 *
 * @author Matt Hammond
 */
public enum Suit {
    CLUBS("black"),
    DIAMONDS("red"),
    SPADES("black"),
    HEARTS("red");
    
    private final String color;
    
    private Suit(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    
    
}
