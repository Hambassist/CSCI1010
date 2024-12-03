/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondllab8;

/**
 *
 * @author Matt Hammond
 * CSCI 1011 - Lab 8
 * A program that compares user inputted contact information
 */
public class HammondlLab8 {

    public static void main(String[] args) {
        //assign customer1
        Customer customer1 = new Customer();
        customer1.readInput();
        customer1.writeOutput();
        //assign customer 2
        Customer customer2 = new Customer();
        customer2.readInput();
        customer2.writeOutput();
        // compare customers using == operator
        if (customer1 == customer2){
            System.out.println("customer1 is equal ot customer2 using the == operator");
        }
        else {
            System.out.println("customer1 is not equal to customer2 using the == operator");
        }
        // compare customerd with equals method
        if (customer1.equals(customer2)){
            System.out.println("customer1 is equal to customer2 using the equals method");
        }
        else {
            System.out.println("customer1 is not equal to customer2 using the equals method");
        }
        System.out.println("");
        // assign customer2 to customer 1 then display if they are equal with ==
        customer1 = customer2;
        if (customer1 == customer2){
            System.out.println("customer1 is equal to customer2 using the == operator.");
        }
        else{
             System.out.println("customer1 is equal to customer2 using the == operator.");
        }
        // change customer2 email and display customer1 info
        customer2.setEmail("nobody@nowhere.com");
        System.out.println("");
        customer1.writeOutput();
        
       
}
}
