/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab11;

import java.util.Scanner;

/**
 * CSCI 1011 - Lab 11
 * @author Matt Hammond
 * Creates an array to store scores for a course object and displays all the information for that cours
 */
public class HammondLab11 {

    public static void main(String[] args) {
        Course course = createCourse();
        course.readScores();
        course.displayInfo();
        System.out.printf("The average score is: %.2f\n", course.getAverage());
        System.out.printf("The maximum score is: %.2f\n", course.getMax());
        System.out.printf("The minimum score is: %.2f\n", course.getMin());
    }
    /**
     *  Create a new course object using information provided by the user
     * @return new Course object
     */
    public static Course createCourse(){
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter the course code: ");
        String courseCode = keyboard.nextLine();
        System.out.println("Enter the course title: ");
        String courseTitle = keyboard.nextLine();
        System.out.println("Enter the credit hours: ");
        double creditHours = keyboard.nextDouble();
        System.out.println("Enter the number of students: ");
        int numStudents = keyboard.nextInt();
        Course course = new Course(courseCode, courseTitle, creditHours, numStudents);
        return course;
    }
}
