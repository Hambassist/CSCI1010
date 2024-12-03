/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1011.hammondllab8;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    
    /**
     * Gets customers first name
     * @return the customer first name : String
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Gets customers last name
     * @return return the customer last name : String
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Gets customers email
     * @return the customer email : String
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets firstName properties
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Sets lastName properties
     * @param lastName 
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Sets email properties
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    // prompt user for first, last name and email
    public void readInput (){
    Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the customer first name:");
        firstName = keyboard.nextLine();
        System.out.println("Enter the customer last name:");
        lastName = keyboard.nextLine();
        System.out.println("Enter the customer email address:");
        email = keyboard.nextLine();
        System.out.println("");
    }
    // displays user contact information
    public void writeOutput (){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("");
    }    
    // add boolean methods to compare names and methods
    private boolean hasSameNameAs (Customer targetCustomer){
        boolean isSame = true;
        
        if (!this.firstName.equalsIgnoreCase(targetCustomer.firstName)){
            isSame = false;
        }
        if (!this.lastName.equalsIgnoreCase(targetCustomer.lastName)) {
            isSame = false;
        }
        return isSame;
    }
    
    private boolean hasSameEmailAs (Customer targetCustomer){
        boolean isSame = true;
        
        if (!this.email.equalsIgnoreCase(targetCustomer.email)){
            isSame = false;
        }
        return isSame;
    }
    public boolean equals (Customer targetCustomer){
        boolean isSame = true;
        
        if (!this.hasSameNameAs(targetCustomer)){
            isSame = false;
        }
        if (!this.hasSameEmailAs(targetCustomer)){
            isSame = false;
        }

        return isSame;
    }
}

