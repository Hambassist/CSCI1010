/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.hammondassign2;

import java.util.Scanner;

/**
 * CSCI 1010 Assignment 2
 * @author Matt Hammond 
 * A calorie burn calculator
 */
public class HammondAssign2 {

    public static void main(String[] args) {
        //Display Message and request input
        System.out.println("Welcome to Matt Hammond's Workout Calculator.");
        System.out.println("");
        System.out.printf("Please enter your weight: ");
        Scanner keyboard = new Scanner(System.in);
        int weight = keyboard.nextInt();
        System.out.printf("Please enter the minutes spent playing badminton: ");
        int badmintonMin = keyboard.nextInt();
        System.out.printf("Please enter the minutes spent running: ");
        int runningMin = keyboard.nextInt();
        System.out.printf("Please enter the minutes spent walking: ");
        int walkingMin = keyboard.nextInt();
        System.out.printf("Please enter the minutes spent lifting weights: ");
        int liftMin = keyboard.nextInt();
        System.out.println("");
        //calorie output
        double calorieBadminton = weight * .044 * badmintonMin;
        double calorieRun = weight * .087 * runningMin;
        double calorieWalk = weight * .036 * walkingMin;
        double calorieLift = weight * .042 * liftMin;
        if (badmintonMin > 0) {
            System.out.printf("You spent " + badmintonMin + " minutes playing badminton and burned %.1f calories.\n", calorieBadminton);
        }
        if (runningMin > 0) {
            System.out.printf("You spent " + runningMin + " minutes running and burned %.1f calories.\n", calorieRun);
        }
        if (walkingMin > 0) {
            System.out.printf("You spent " + walkingMin + " minutes walking and burned %.1f calories.\n", calorieWalk);
        }
        if (liftMin > 0) {
            System.out.printf("You spent " + liftMin + " minutes lifting weights and burned %.1f calories.\n", calorieLift);
        }
        System.out.println("");
        //Total time and calories
        double totalCal = calorieRun + calorieBadminton + calorieWalk + calorieLift;
        int totalTime = badmintonMin + runningMin + walkingMin + liftMin;
        int OriginalTotalTime = totalTime;
        int hours = totalTime / 60;
        totalTime = totalTime % 60;
        int minutes = totalTime;
        System.out.printf("You spent " + hours + " hours and " + minutes + " minutes working out and burned %.1f calories.", totalCal);
    }
}
