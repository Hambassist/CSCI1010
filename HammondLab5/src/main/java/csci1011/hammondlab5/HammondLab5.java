/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1011.hammondlab5;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond 
 * CSCI 1011 - Lab 5
 * Program to use a menu based approach and switches to to math things
 */
public class HammondLab5 {

    public static void main(String[] args) {
        // main loop
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do{
            // display menu
            System.out.println("Choose one of the following options:");
            System.out.println("1. Perform an arithmetic operation");
            System.out.println("2. Apply a function");
            System.out.println("3. Calculate a factorial");
            System.out.println("4. Exit the program");
            // read input from user
            choice = keyboard.nextInt();
            System.out.println();
            // use a switch to determine the case
            switch(choice){
                case 1: // perform arthmetic operation
                    System.out.println("Enter an expression of the form NUM OP NUM:");
                    //get user input
                    int num1 = keyboard.nextInt();
                    String opString =  keyboard.next();
                    int num2 = keyboard.nextInt();                         
                    //conver OP to char
                    char opChar = opString.charAt(0);
                    // use a switch with the char for the operation
                    switch(opChar){
                        case '+': 
                            System.out.println("Result: " + (num1 + num2));
                            System.out.println();
                            break;
                        case '-':
                            System.out.println("Result: " + (num1 - num2));
                            System.out.println();
                            break;
                        case '*':
                            System.out.println("Result: " + (num1 * num2));
                            System.out.println();
                            break;
                        case '/':
                            System.out.println("Result: " + (num1 / num2));
                            System.out.println();
                            break;
                        case '%':
                            System.out.println("Result: " + (num1 % num2));
                            System.out.println("");
                            break;
                        default: 
                            System.out.println("Unknown operator: " + opString);
                            System.out.println();                    
                    }
                    break;
                case 2: // apply a function
                    System.out.println("Enter an expression of the form FUNC ARG:");
                    String function = keyboard.next();
                    double arg = keyboard.nextDouble();
                    switch(function){
                        case "sqrt":
                            System.out.println("Result: " + Math.sqrt(arg));
                            System.out.println();
                            break;
                        case "log":
                            System.out.println("Result: " + Math.log10(arg));
                            System.out.println();
                            break;
                        case "ln":
                            System.out.println("Result: " + Math.log(arg));
                            System.out.println("");
                            break;
                        default:
                            System.out.println("Unknown function: " + function);
                            System.out.println("");
                    }
                    break;
                case 3: //calculate a factorial
                    System.out.println("Enter a number:");
                    int facNum = keyboard.nextInt();
                    int fact = 1;
                    while(facNum > 0){
                        fact *= facNum;
                        facNum --;
                    }
                    System.out.println("Result: " + fact);
                    System.out.println("");
                    break;
                case 4: //exit the program
                    System.out.println("Thank you for using Matt Hammond's calculator");
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Invalid choice");
                    System.out.println();
            }                    
            // exit loop if choice == 4
        } while (choice != 4);
  
    
    }

}
