/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.nestedloops;

/**
 *
 * @author Matt Hammond
 */
public class NestedLoops {

    public static void main(String[] args) {
        System.out.println("Nested Loops");

        for (int i = 0; i < 5; i++) {
            System.out.println("Outer loop iterations: " + i);
            System.out.println("");
            for (int j = 0; j < 5; j++) {

                if (i == 2) {
                    break;
                }
                System.out.println("Inner Loop iterations: " + j);
            }
            System.out.println("");
        }
        System.out.println("Done with loops");

    }
}
