/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.whiledemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class WhileDemo {

    public static void main(String[] args) {
        System.out.println("While Demo");
        int count, number;
        System.out.println("Enter a Number: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();
        // loop 
        count = 1;
        while (count <= number){
            System.out.print(count + ", ");
            count++;
    }
        
        
        
    }
}
