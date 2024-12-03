/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.hammondassign5;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class TennisMatch {
    // private fields
    private int numberOfSets;
    private double probOfP1;
    private double probOfP2;
    private int currentServer;
    private int p1WinsGame;
    private int p2WinsGame;
    private int p1WinsSet;
    private int p2WinsSet;
    private String resultsOfSet;
    
    //constructor
    public TennisMatch(int setsToWin, double p1Serve, double p2Serve){
        this.numberOfSets = setsToWin;
        this.probOfP1 = p1Serve;
        this.probOfP2 = p2Serve;
        this.currentServer = 1;
        this.p1WinsGame = 0;
        this.p2WinsGame = 0;
        this.p1WinsSet = 0;
        this.p2WinsSet = 0;
        this.resultsOfSet = "";        
    }
    
    public void playMatch(){
        while (!matchOver()){
            playSet();
        }
    // display results
        String winner;
        if (p1WinsSet >= numberOfSets){
            winner = "Player 1 wins: ";
        }
        else {
            winner = "Player 2 wins: ";
        }
            System.out.println(winner + resultsOfSet);
    }
    // private methods
    private void playSet(){
        p1WinsGame = 0;
        p2WinsGame = 0;
        
        while (!setOver()){
            playGame();
        }
        //record results
        resultsOfSet += p1WinsGame + "-" + p2WinsGame + " ";
        //increase sets won
        if (p1WinsGame > p2WinsGame){
            p1WinsSet++;
        }
        else {
            p2WinsSet++;
        }     
    }
    
    private void playGame(){
        double randomNumber = Math.random();
        
        if (currentServer == 1){
            if (randomNumber <= probOfP1){
                p1WinsGame++;
            }
            else {
                p2WinsGame++;
            }
        }
        else{
            if (randomNumber <= probOfP2){
                p2WinsGame++;
            }
            else {
                p1WinsGame++;
            }
        }
        
        if (currentServer == 1){
            currentServer = 2;
        }
        else {
            currentServer = 1;
        }
    }
    
    // booleans
    private boolean matchOver(){
        return (p1WinsSet == numberOfSets || p2WinsSet == numberOfSets);
    }
    
    private boolean setOver(){
        return ((p1WinsGame >= 6 && (p1WinsGame - p2WinsGame) >= 2) || 
                (p2WinsGame >= 6 && (p2WinsGame - p1WinsGame) >- 2));
                
    }
    
}
