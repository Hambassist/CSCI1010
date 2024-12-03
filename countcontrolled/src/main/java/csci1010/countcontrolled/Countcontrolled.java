/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package csci1010.countcontrolled;

/**
 *
 * @author Matt Hammond
 */
public class Countcontrolled {

    public static void main(String[] args) {
        System.out.println("Loops");
        int sum = 0;
        int maxCount = 10;
        //count controlled loops
        // i is only used in "for" loop, then isn't used outside of it
        for (int i = 0; i < maxCount; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum = sum + i;
            if (sum > 23) {
                break;
            }
            System.out.println("looping " + i);
        }
        System.out.println("Sum is: " + sum);

        // count conrolled with a while loop
        int whileSum = 0;
        int whileMaxCount = 10;
        int i = 1;
        while (i <= whileMaxCount) {
            whileSum = whileSum + i;
            System.out.println("Looping: " + i);
            i++;
        }
        System.out.println("While loop sum: " + whileSum);
        System.out.println("Max while iteration: " + i);
        
    }
}
