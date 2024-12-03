/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * CSCI 1011 - Lab 7
 * @author Matt Hammond
 * A program that displays movie information
 */
public class HammondLab7 {

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.readInput();
        System.out.println("");
        movie.writeOutput();
        System.out.println("");
        
        //mutate the title
        System.out.println("Enter a new title: ");
        Scanner keyboard = new Scanner(System.in);
        String title = keyboard.nextLine();
        String director = movie.getDirector();
        int year = movie.getYear();
        // set only title - keep the year and director
        movie.setMovie(title, director, year);
        movie.writeOutput();
        
    }
}
