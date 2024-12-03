/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.petdemo;

/**
 *
 * @author Matt Hammond
 */
public class PetDemo {

    public static void main(String[] args) {
        System.out.println("Pet Demo");
        Pet p1 = new Pet();
        System.out.println("Pet()");
        p1.writeOutput();
        Pet p2 = new Pet("Rex", 20, 200.);
        System.out.println("Pet(String, int, double)");
        p2.writeOutput();
        Pet p3 = new Pet(12);
        System.out.println("Pet(int)");
        p3.writeOutput();
    }
}
