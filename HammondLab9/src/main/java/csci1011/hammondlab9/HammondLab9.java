/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab9;

/**
 * CSCI 1011 - Lab 9
 * @author Matt Hammond
 * A program that creates XY points and does various math things
 */
public class HammondLab9 {

    public static void main(String[] args) {
        
        //testing getNumPoints
        testGetNumPoints();
        
        //test constructors
        testConstructors();
        
        //testing getNumPoints a second time
        testGetNumPoints();
        
        //testing getSlope 
        testGetSlope();
        
        //testing getDistance 
        testGetDistance();
        
    } // end of main
    
    //main class method subclasses
    private static void testGetNumPoints(){
        int numPoints = Point.getNumPoints();
        System.out.println("Testing getNumPoints method");
        System.out.println("The number of points created is " + numPoints);
        System.out.println("");
    }
    
    private static void testConstructors(){
        Point p1 = new Point();
        System.out.println("Testing default constructor");
        System.out.println("The point is " + p1.toString());
        Point p2 = new Point(3.5, 8.1);
        System.out.println("Testing two-argument constructor");
        System.out.println("The point is " + p2.toString());
        System.out.println("");
    }
       
    private static void testGetSlope(){
         System.out.println("Testing getSlope method");
        Point p3 = new Point (2,1);
        Point p4 = new Point (4,2);
        double slope = Point.getSlope(p3, p4);
        System.out.println("The slope of the line from " + p3.toString()
                + " to " + p4.toString() + " is " + slope);
        System.out.println("");       
    }
    
    private static void testGetDistance(){
         System.out.println("Testing getDistance method");
        Point p5 = new Point (0, 0);
        Point p6 = new Point (3, 4);
        double distance = Point.getDistance(p5, p6);
        System.out.println("The distance of the line " + p5.toString() 
                + " to " + p6.toString() + " is " + distance);
        System.out.println("");       
    }
    
}
