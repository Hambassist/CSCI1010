/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1011.hammondlab7;

import java.util.Scanner;

/**
 * CSCI 1011 - Lab 7
 * @author Matt Hammond
 * A program that displays movie information
 */
public class Movie {
    private String title;
    private String director;
    private int year;
    
    
    /**
     *  Reads the users input for the Movie properties
     */
    public void readInput (){
        // get user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the title of the movie: ");
        title = keyboard.nextLine();
        System.out.println("Enter the director of the movie: ");
        director = keyboard.nextLine();
        System.out.println("Enter the year the movie was released: ");
        year = keyboard.nextInt();
    }
    
    /**
     * Outputs the Movie properties
     */
    public void writeOutput (){
        // display the movie info
        System.out.println(title + " dir. " + director + " (" + year + ")");
    }
    /**
     * Sets the Movie class properties
     * @param title
     * @param director
     * @param year 
     */
    public void setMovie (String title, String director, int year){
        this.title = title;
        this.director = director;
        this.year = year;
            
    }
    /**
     *  Gets the title of the movie
     * @return the title of the movie : String 
     */
    public String getTitle(){
        return title;
    }
    /**
     *  Gets the director of the movie
     * @return the director of the movie : String
     */
    public String getDirector() {
        return director;
    }
    /**
     * Gets the year the movie was released
     * @return the year the movie was released : int
     */
    public int getYear() {
        return year;
    }
    
    
    
    
}
