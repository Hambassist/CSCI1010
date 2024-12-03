/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab10;

/**
 * CSCI 1011 - Lab 10
 * @author Matt Hammond
 * A program that calculates various aspects of a line
 */
public class HammondLab10 {

    public static void main(String[] args) {
        // test toString
        System.out.println("Testing the toString method:");
        testToString(new Line());
        testToString(new Line(2, 0));
        testToString(new Line(0, 3));
        testToString(new Line(2, 3));
        testToString(new Line(2, -3));  
        System.out.println("");
        
        // test set methods
        System.out.println("Testing the set method:");
        testSet(new Line(), 3, 5);
        testSet(new Line(), new Point(2, 5), new Point(5, 11));
        System.out.println("");
    
    
        // test getIntersection
        System.out.println("Testing the getIntersection method:");
        testGetIntersection(new Line(4, -1), new Line(3, 2));
        testGetIntersection(new Line(6, 5), new Line(6, 3));
        testGetIntersection(new Line(1, 7), new Line(1,7));
        System.out.println();
        
        // test getDistance
        testGetDistance(new Point(1, 0), new Line(1, 1));
        testGetDistance(new Point(0, 5), new Line(0.75, 0));
        testGetDistance(new Point(3, 5), new Line(2, -1));
        
    
    }
    // Main class methods
    // testToString method
    public static void testToString(Line line){
        System.out.print("The line with the slope " + line.getSlope());
        System.out.print(" and y-intercept " + line.getIntercept());
        System.out.println(" is " + line.toString());
    }
    
    // Overloading testSet method
    public static void testSet(Line line, double slope, double intercept){
        line.set(slope, intercept);
        testToString(line);
    }
    
    public static void testSet(Line line, Point p1, Point p2){
        line.set(p1, p2);
            System.out.print("The line from " + p1);
            System.out.print(" to " + p2);
            System.out.println(" is " + line.toString());
    }
    
    // Testing static getIntersection and getDistance Methods
    
    public static void testGetIntersection(Line line1, Line line2){
        Point point = Line.getIntersection(line1, line2);
        System.out.print(line1 + " and " + line2);
        System.out.println(" intersect at " + point.toString());
    }
    
    public static void testGetDistance(Point point, Line line){
        double distance = Line.getDistance(point, line);
        System.out.print("The distance from " + point);
        System.out.print(" and " + line);
        System.out.println(" is " + distance);
    }
}
