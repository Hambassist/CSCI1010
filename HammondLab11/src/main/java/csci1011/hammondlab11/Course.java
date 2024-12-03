/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1011.hammondlab11;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class Course {
    private String courseCode;
    private String courseTitle;
    private double creditHours;
    private double[] studentScores;
    
    /**
     * Default Constructor
     * @param courseCode - String - course code
     * @param courseTitle - String - course title
     * @param creditHours - double- credit hours
     * @param numStudents - int -  number of students
     */
    public Course(String courseCode, String courseTitle, double creditHours, int numStudents){
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.creditHours = creditHours;
        this.studentScores = new double[numStudents];
    }
    /**
    * Read a score for each student in the course and store it in an array
    */
    public void readScores (){
        Scanner keyboard = new Scanner(System.in);
        int numStudents = studentScores.length;
        System.out.println("Enter the scores for " + numStudents + " students");
        for (int i = 0; i < numStudents; i++){
            studentScores[i] = keyboard.nextDouble();
        }
    }
    /**
     * Display the information for the course
     */
    public void displayInfo(){
        System.out.println(courseCode + ": " + courseTitle 
                + " (" + creditHours + " credit hours)");
        System.out.println("Class size: " + studentScores.length);
        System.out.print("Scores: ");
        for (double score : studentScores){
            System.out.print(score + " ");
        }
        System.out.println("");
    }
    
    private double getSum(){
        double sum = 0;
        for (double score: studentScores){
            sum += score;
        }
        return sum;
    }
    
    public double getAverage(){
        double sum = getSum();
        double numStudents = studentScores.length;
        return sum/numStudents;
    }
    /**
     * Determine the highest student's score
     * @return - double - max score
     */
    public double getMax(){
        double max = studentScores[0];
        for (int i = 1; i < studentScores.length; i++){
            if (studentScores[i] > max){
                max = studentScores[i];
            }
        }
        return max;         
    }
    /**
     * Determine the lowest student's score
     * @return - double - lowest score
     */
    public double getMin(){
        double min = studentScores[0];
        for (int i = 1; i < studentScores.length; i++){
            if (studentScores[i] < min){
                min = studentScores[i];
            }
        }
        return min;
    }
}
