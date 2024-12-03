/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.examaverage;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 * Computes the average of (non negative) exam scores
 * Repeats computation until the user quits
 */
public class ExamAverage {

    public static void main(String[] args) {
        System.out.println("Exam Averager");
        System.out.println("This program computes the average of");
        System.out.println("a list of (non-negative) exam scores.");
        
        double sum;
        int numberOfStudents;
        double next;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        
        do {
            System.out.println();
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter a negative number after");
            System.out.println("you have entered all the scores.");
            sum = 0;
            numberOfStudents = 0;
            next = keyboard.nextDouble();
            // do the maths
            while (next >=0){
                sum = sum + next;
                numberOfStudents++;
                next = keyboard.nextDouble();   
            }
            if (numberOfStudents >0){
                System.out.println("The average is " + (sum / numberOfStudents));
            }
            else {
                System.out.println("No scores to average");
            }
            //do again
            System.out.println("Want to average another exam?");
            System.out.println("Enter yes or no.");
            answer = keyboard.next();
            
        }while (answer.equalsIgnoreCase("yes"));
        
        
        
        
        
        
        
    }
    
}
