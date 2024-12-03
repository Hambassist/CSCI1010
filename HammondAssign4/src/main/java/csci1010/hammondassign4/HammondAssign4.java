/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.hammondassign4;

import java.util.Scanner;

/**
 * CSCI 1010 - Assignment 4
 * @author Matt Hammond
 * A program that simulates what happens a ball is thrown at different angles
 */
public class HammondAssign4 {

    public static void main(String[] args) {
        System.out.println("Welcome to Matt Hammond's ball simulator!");
        System.out.println("");
        //request angle, velocity, height, time
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the angle in degrees: ");
        double angle = keyboard.nextDouble();
        System.out.print("Please enter the initial velocity: ");
        double velocity = keyboard.nextDouble();
        System.out.print("Please enter the initial height: ");
        double height = keyboard.nextDouble();
        System.out.print("Please enter the time interval: ");
        double time = keyboard.nextDouble();
        System.out.println("");
        //create ball object
        Ball ball = new Ball();
        ball.initialize(angle, velocity, height);
        //repeatedly update while vDist is greater than zero
        while (ball.getvDist() > 0){
            ball.update(time);
        }
        //display travel distance
        System.out.print("Distance traveled " + ball.gethDist() + " meters.");
            
        
    }
}
