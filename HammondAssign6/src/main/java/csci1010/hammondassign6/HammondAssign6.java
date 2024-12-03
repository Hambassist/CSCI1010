/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.hammondassign6;

import java.util.Scanner;


/**
 * CSCI 1010 - Assign 5
 * @author Matt Hammond
 * A program that uses Arrays to sort Album lengths
 */
public class HammondAssign6 {
    
        public static int NumberOfTracks = 12;
        
    public static void main(String[] args) {
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        int[] trackLength = new int[NumberOfTracks];
        int trackMin = 0;
        int trackSec = 0;
        int shortest = 0; 
        int longest = 0; 
        int totalAlbumLength = 0;
        
        System.out.println("Welcome to Matt Hammond's Album Length Calculator");
        System.out.println("Please enter all track lengths in minutes and seconds "
                + "separated by a space.");
        
        // Loop to fill the trackLength array with total time in seconds
        for (int i = 0; i < trackLength.length; i++) {
            System.out.print("Track " + (i + 1) + ": ");
            trackMin = keyboard.nextInt();
            trackSec = keyboard.nextInt();
            trackLength[i] = (trackMin * 60) + trackSec;
        }
        
        // Find the shortest, longest track and calculate total album length
        for (int i = 0; i < trackLength.length; i++) {
            if (trackLength[i] < trackLength[shortest]) {
                shortest = i; 
            }
            if (trackLength[i] > trackLength[longest]) {
                longest = i; 
            }
            totalAlbumLength += trackLength[i];
        }
        
        // Output the shortest and longest tracks with formatted time
        System.out.print("The shortest track is #" + (shortest + 1) + " at ");
        displayTime(trackLength[shortest]);
        
        System.out.print("The longest track is #" + (longest + 1) + " at ");
        displayTime(trackLength[longest]);
        
        System.out.print("The total length of the album is: ");
        displayTime(totalAlbumLength); 
        
        int averageLength = totalAlbumLength / NumberOfTracks;
        System.out.print("The average length of a track is: ");
        displayTime(averageLength); 
    }
                
    // Method to print the time 
    public static void displayTime(int totalSec) {
        int minutes = totalSec / 60;
        int seconds = totalSec % 60;
        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);  // For single digit seconds
        } else {
            System.out.println(minutes + ":" + seconds);   // For double digit seconds
        }
    }
}



