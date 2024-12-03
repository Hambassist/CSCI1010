/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.hammondassign1;

import java.util.Scanner;

/**
 * CSCI 1010 Assignment 1
 * @author Matt Hammond
 * A geometry calculator for squares, rectangles, and triangles. 
 */
public class HammondAssign1 {

    public static void main(String[] args) {
        double squareSide;
        double recSideLength;
        double recSideWidth;
        double triangleBase;
        double triangleHeight;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Welcome to Matt Hammond's geometry calculator");
        
        System.out.println("Enter the square's side:");
        squareSide = keyboard.nextDouble();
        System.out.println("Square Area: " + squareSide * squareSide );
        System.out.println("Square Perimeter: " + squareSide * 4);
        System.out.println("");
      
        System.out.println("Enter the Rectangle's length:");
        recSideLength = keyboard.nextDouble();
        System.out.println("Enter the Rectangle's width:");
        recSideWidth = keyboard.nextDouble();
        System.out.println("Rectangle Area: " + recSideLength * recSideWidth);
        System.out.println("Rectangle Perimeter: " + (recSideLength + recSideWidth)*2 );
        System.out.println(); 
              
        System.out.println("Enter Triangle's base:"); 
        triangleBase = keyboard.nextDouble();
        System.out.println("Enter Triangle's height:");
        triangleHeight = keyboard.nextDouble();
        System.out.println("Triangle Area: " + (triangleHeight * triangleBase /2) );
        
        
    }
}
