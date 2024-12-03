/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.branchingdemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class BranchingDemo {

    public static void main(String[] args) {
        System.out.println("If-Else");

        System.out.println("Enter your balance: ");
        Scanner keyboard = new Scanner(System.in);
        double balance = keyboard.nextDouble();

        if ((balance >= 0) && (balance > 5000) || (balance <= 10000)) {  //      && = and      || = or
            System.out.println("You have a positive balance");
            System.out.println("Big Money");
            if (balance >= 10000) {
                System.out.println("How about a new car?");
            }
        } 
        else {
            System.out.println("You are overdrawn");
        }

        //code without blocks {} = BAD
        /*
         if (balance >= 0)
            System.out.println("You have a positive balance");
            System.out.println("Big Money");
        else 
            System.out.println("You are overdrawn");
         */
    }
}
