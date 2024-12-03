/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1011.hammondlab9;

/**
 *
 * @author Matt Hammond
 */
public class Point {
    private static int numPoints = 0;
    private double xCoord;
    private double yCoord;
    
    // constructor that sets coord default to 0
    public Point(){
        //xCoord = 0.0;
        //yCoord = 0.0;
        initPoint(0.0, 0.0);
    }

    public Point(double x, double y){
       // xCoord = x;
       // yCoord = y;
       initPoint(x,y);
    }
    
    // Getters
    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }
    
    public static int getNumPoints(){
        return numPoints;
    }
    
    // Methods
    public String toString(){
    return "(" + xCoord + ", " + yCoord + ")";
    }
    
    private void initPoint(double xCoord, double yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        numPoints++;
    }
    
    public static double getSlope(Point p1, Point p2){
         double xDiff = p1.xCoord - p2.xCoord;
         double yDiff = p1.yCoord - p2.yCoord;
         return yDiff/xDiff;  
    }
    public static double getDistance(Point p1, Point p2){
        double xDiff = p1.xCoord - p2.xCoord;
        double yDiff = p1.yCoord - p2.yCoord;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    
}
