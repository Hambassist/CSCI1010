/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.argumentdemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class ArgumentDemo {

    public static void main(String[] args) {
        
        System.out.println("Argument Demo");
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter your score on exam 1: ");
        int firstScore = keyboard.nextInt();
        int[] nextScore = new int[3];
        // initialize array
        for (int i = 0; i< nextScore.length; i++){
            nextScore[i] = firstScore + 5 * i;
        }
        // do the getAverage stuff
        
        for (int i = 0; i< nextScore.length; i++){
            double possibleAverage = getAverage(firstScore, nextScore[i]);
            System.out.println("If your score on exam 2 is " + nextScore[i]);
            System.out.println("Your average will be " + possibleAverage);
        }
    }
    
    public static double getAverage(int n1, int n2){
        return (n1 + n2) / 2.0;
    }
}
