/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.overload;

/**
 *
 * @author Matt Hammond
 */
public class Overload {

    public static void main(String[] args) {
        System.out.println("Overload");
        double avg1 = Overload.getAverage(40.0, 50.0);
        System.out.println("Average 1 = " + avg1);
        double avg2 = Overload.getAverage(1.0, 2.0, 3.0);
        System.out.println("Average 2 = " + avg2);
        char avg3 = Overload.getAverage('A', 'C');
        System.out.println("Average 3 = " + avg3);
    }
    
    public static double getAverage(double first, double second){
        return (first + second) / 2;
    }
    
    public static double getAverage(double first, double second, double third){
        return (first + second + third) / 3;
    }
    
    public static char getAverage(char first, char second){
        return (char) ((int) first + (int) second / 2);
    }
}
