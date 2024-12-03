/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1011.lab2.hammondlab2;

import java.util.Scanner;

/**
 * CSCI 1011 Lab 2
 * @author Matt Hammond
 * A program that calculates interest on a deposit
 */
public class HammondLab2 {
    public static final double RATE = 0.059;
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double percent = RATE * 100;
        System.out.println("Welcome to Matt Hammond's interest calculator.");
        System.out.println();
        System.out.println("Please enter your initial deposit amount: ");
        double balance = keyboard.nextDouble();
        balance = balance + (balance * RATE);

        System.out.println("With a " + percent + "% APR your deposit will be worth $"
                + balance + " in one year.");
        System.out.println("");
        // second year
        balance = balance + (balance * RATE);
        System.out.println("With a " + percent + "% APR your deposit will be worth $"
                + balance + " in two years.");

    }
}
