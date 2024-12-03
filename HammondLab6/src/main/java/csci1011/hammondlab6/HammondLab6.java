/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab6;

import java.util.Scanner;

/**
 * CSCI 1011 - Lab 6
 * @author Matt Hammond
 * A menu based arithmetic quiz program
 */
public class HammondLab6 {
    public static final int MAX_VALUE = 12;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //declare boolean variable if loop should keep going
        boolean menuLoop = true;
        //Display welcome message
        System.out.println("Welcome to Matt Hammond's arithmetic quiz program");
        System.out.println("");
        //do while loop using boolean variable if true
        do {
        // within loop display menu
            System.out.println("Please choose from the following options:");
            System.out.println("1. Addition quiz");
            System.out.println("2. Multiplication quiz");
            System.out.println("3. Addition table");
            System.out.println("4. Multiplication table");
            System.out.println("5. Exit the program");
        //read user input as int and store in variable
        int choice = keyboard.nextInt();
            System.out.println("");
        //use variable for controlling statement for switch
        switch(choice){
            case 1: // addition
            case 2: // multiplication
                int number = 0;
                do{ 
                    System.out.println("Enter a number between 1 and " + MAX_VALUE);
                    number = keyboard.nextInt();
                } while (number <1 || number > MAX_VALUE);
                int numCorrect = 0;
                for (int count = 1; count <= MAX_VALUE; count++){
                if (choice == 1) {
                    System.out.println(number + " + " + count + " = ");
                }
                else {
                    System.out.println(number + " * " + count + " = ");
                }
                int result = keyboard.nextInt();
                if (choice == 1 && result == number + count
                        || choice == 2 && result == number * count){
                    numCorrect++;
                }
            } // end for loop
                System.out.println("You got " + numCorrect + " right out of " + MAX_VALUE);
                System.out.println("");
                break;
            case 3: //addition table
            case 4: //multiplication table
                // display column headings
                System.out.print("    |");
                for (int col = 1; col <= MAX_VALUE; col++){
                    System.out.printf("%4d", col);
                }
                System.out.println("");
                // display horizontal line
                System.out.print("----+");
                for (int col = 1; col <= MAX_VALUE; col++){
                    System.out.print("----");
                }
                System.out.println("");
                // display row headings and row
                for (int row = 1; row <= MAX_VALUE; row++){
                    // display the row heading
                    System.out.printf("%4d|", row);
                    // display the row
                    for (int col = 1; col <= MAX_VALUE; col++){
                        if (choice == 3){
                            System.out.printf("%4d", row + col);
                        }
                        else {
                            System.out.printf("%4d", row * col);
                        }
                    } // inner loop
                    System.out.println();
                } // outer loop
                System.out.println();
                break;
            case 5:
                menuLoop = false;
                break;
            default: 
                System.out.println("Invalid choice");
                System.out.println("");
        }
        } while(menuLoop == true);
        System.out.println("Thank you for using Matt Hammond's arithmetic quiz program");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
