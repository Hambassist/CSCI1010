/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.dollarformat;

/**
 *
 * @author Matt Hammond
 */
public class DollarFormat {
    public static void write(double amount) {
        //System.out.println("Write method");
        //System.out.println("Value: " + amount);
        int allCents = (int)(Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;
        //print
        System.out.print("$");
        System.out.print(dollars);
        System.out.print(".");
        if (cents < 10){
            System.out.print("0");
            System.out.print(cents);
        }
        else{
        System.out.print(cents);
        }
    }
    
    public static void writeLn(double amount){
        write(amount);
        System.out.println();
    }
}
