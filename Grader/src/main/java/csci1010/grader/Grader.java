/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.grader;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class Grader {

    public static void main(String[] args) {
        System.out.println("Do some grading!");
        // take in a score and return a letter grade
        int score;
        char grade;
        System.out.println("Enter your score: ");
        Scanner keyboard = new Scanner(System.in);
        score = keyboard.nextInt();
        
        //compute the letter grade
        if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }        
        //show the grade
        System.out.println("Score = " + score);
        System.out.println("Grade = " + grade);
   
        
    }
}
