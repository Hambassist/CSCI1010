/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.scannerdemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class ScannerDemo {

    public static void main(String[] args) {
        System.out.println("Scanner Demo");
        Scanner keyboard = new Scanner(System.in);
        //nextInt(
        /*
        System.out.println("Enter two whole numbers");
        System.out.println(" seperated by one or more whitespaces: ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        System.out.println("You entered " + num1 + " and " + num2);
         */
        //nextDouble()

        /*
        System.out.println("Enter two numbers a decimal place is ok: ");
        double dub1 = keyboard.nextDouble();
        double dub2 = keyboard.nextDouble();
        System.out.println("You entered " + dub1 + " and " + dub2);
         */
        //next();
        /*
        System.out.println("Enter two words");
        String s1 = keyboard.next();
        String s2 = keyboard.next();
        System.out.println("You entered " + s1 + " and " + s2);
        //String s3 = keyboard.next();
        //System.out.println("Buffer: " + s3);
        keyboard.nextLine();

         */
        //nextLine()
        System.out.println("Enter a line of text");
        String s4 = keyboard.nextLine();
        System.out.println("You entered \"" + s4 + "\"");

    }
}
