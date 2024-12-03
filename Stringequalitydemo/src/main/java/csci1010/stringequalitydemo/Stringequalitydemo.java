/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.stringequalitydemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class Stringequalitydemo {

    public static void main(String[] args) {
        System.out.println("Compare Strings!");
        String s1, s2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two lines of text: ");
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();

        //compare the strings
        if (s1.equals(s2)) {
            System.out.println("The two lines are equal");

        } 
        else {
            System.out.println("The two lines are not equal");
        }

        // compare ignoring case
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("The two lines are equal");
        } 
        else {
            System.out.println("The two lines are not equal");
        }

    }

}
