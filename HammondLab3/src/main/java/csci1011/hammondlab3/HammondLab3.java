/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab3;

import java.util.Scanner;

/**
 * 
 * @author Matt Hammond
 * CSCI 1011 - Lab3
 * Use string methods
 */
public class HammondLab3 {

    public static void main(String[] args) {
        // declare variables
        //String courseCode = "CSCI 1011";
        //String courseTitle = "Introduction to Programming I Lab";
        System.out.println("Enter the course code:");
        Scanner keyboard = new Scanner(System.in);
        String courseCode = keyboard.nextLine();
        System.out.println("Enter the course title:");
        String courseTitle = keyboard.nextLine();
        // concat strings
        String welcomeMessage = "Welcome to " + courseCode  + ": " + courseTitle + "!";
        // display welcomeMessage
        System.out.println("Testing + operator:");
        System.out.println(welcomeMessage);
        System.out.println("");
        // toLowerCase
        System.out.println("Testing + toLowerCase:");
        System.out.println(welcomeMessage.toLowerCase());
        System.out.println("");
        // toUpperCase
        System.out.println("Testing + toUpperCase:");
        System.out.println(welcomeMessage.toUpperCase());
        System.out.println("");
        // length
        System.out.println("Testing + toUpperCase:");
        System.out.println("The length of the string welcomeMessage is: " + welcomeMessage.length());
        System.out.println("");
        // declare welcomeMessage2
        String welcomeMessage2 = welcomeMessage.toUpperCase();
        //System.out.println("welcomeMessage2: " + welcomeMessage2);
        // equals
        System.out.println("Testing equals method:");
        boolean msgEqual = welcomeMessage.equals(welcomeMessage2);
        System.out.println("Messages are equal: " + msgEqual);
        System.out.println("");
        // equalsIgnoreCase
        System.out.println("Testing equalsIgnoreCase method:");
        System.out.println("Messages are equal ignoring case: " 
                + welcomeMessage.equalsIgnoreCase(welcomeMessage2));
        System.out.println("");
        // replace
        System.out.println("Testing replace method:");
        welcomeMessage = welcomeMessage.replace("1011", "1010");
        System.out.println(welcomeMessage);
        System.out.println("");
        // indexOf
        // substring
        // concat substring and display
        System.out.println("Testing indexOf, substring, and concat method:");
        int index = welcomeMessage.indexOf("Introduction");
        //System.out.println("What is my index??:" + index);
        welcomeMessage = welcomeMessage.substring(0, index);
        //System.out.println("subbed out: " + welcomeMessage);
        welcomeMessage = welcomeMessage + "Introduction to Programming";
        System.out.println(welcomeMessage);
        System.out.println("");
        // TODO go back to beginning and get user input
        
        
        
        
    }
}
