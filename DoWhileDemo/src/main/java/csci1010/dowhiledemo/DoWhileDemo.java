/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.dowhiledemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class DoWhileDemo {

    public static void main(String[] args) {
        System.out.println("While Demo");
        int count, number;
        System.out.println("Enter a Number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        count = 1;
        
        do {
            System.out.print(count + ", "); 
            count++;
        } while (count <= number);
        System.out.println();
        System.out.println("Buckle my shoe;");
        
        
        
        

    }
}
