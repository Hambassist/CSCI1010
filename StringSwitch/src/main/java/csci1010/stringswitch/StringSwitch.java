/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.stringswitch;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class StringSwitch {

    public static void main(String[] args) {
        System.out.println("String Switch");
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the contact: ");
        String contact = keyboard.nextLine();
        
        switch(contact.toLowerCase())
        {
            case "dave":
                System.out.println("Phone #: 555-1100");
                break;
            case "joe":
                System.out.println("Phone #: 555-1101");
                break;
            default:
                System.out.println("Who the heck is " + contact);
        }
        
    }
}
