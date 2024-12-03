/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.forloopdemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class ForLoopDemo {

    public static void main(String[] args) {
        System.out.println("For Loop demo");
        double next, average, sum;
        int numberOfStudents;
        sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of students to grade: ");
        numberOfStudents = keyboard.nextInt();
        System.out.println("Enter the exam scores: ");
        for (int count = 1;count <= numberOfStudents; count++){
            next = keyboard.nextDouble();
            sum = sum + next;
        }
        average = sum / numberOfStudents;
        System.out.println("Average score is " + average);
        
        
    }
}
