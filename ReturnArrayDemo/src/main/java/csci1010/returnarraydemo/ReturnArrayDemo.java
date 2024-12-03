/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.returnarraydemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class ReturnArrayDemo {

    public static void main(String[] args) {
        System.out.println("Return Array Demo");
        System.out.println("");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your score on exam 1: ");
        int firstScore = keyboard.nextInt();
        int[] nextScore = new int[3];
        // fill the array
        for (int i = 0; i < nextScore.length; i++){
            nextScore[i] = firstScore + 5 * i;
        }
        double[] averageScore = getArrayOfAverages(firstScore, nextScore);
        // display averages
        System.out.println("");
        for (int i = 0; i < averageScore.length; i++){
            System.out.print("If your score on exam 2 is " + nextScore[i]);
            System.out.println(", your average will be " + averageScore[i]);
            System.out.println("");
        }
            
    }
    
    public static double[] getArrayOfAverages(int firstScore, int[] nextScore){
        double[] temp = new double[nextScore.length];
        for (int i = 0; i < temp.length; i++){
            temp[i] = getAverage(firstScore, nextScore[i]);
        }
        return temp;
    }
    
    public static double getAverage(int n1, int n2){
        return (n1 + n2) / 2;
    }
}
