/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1011.hammondlab10;

/**
 *
 * @author Matt Hammond
 */
public class Line {
    
    private double slope;
    private double intercept;
    
    //constructor
    public Line(){
        set(0.0, 0.0);
    }
    
    public Line(double slope, double intercept){
        set(slope, intercept);
    }
    /**
     * Construct a string in the format "y = mx +b" where m is the slope and 
     * b is the y-intercept
     * @return a String representation of the line
     */
    public String toString(){
        String equation;
        if (slope == 0){
            equation = "y = " + intercept;
        }
        else if (intercept == 0){
            equation = "y = " + slope + "x";
        }
        else if (intercept > 0){
            equation = "y = " + slope + "x + " + intercept;
        }
        else {
            equation = "y = " + slope + "x - " + -intercept;
        }
        
        return equation;
    }
    // overloading set methods
    public void set(double slope, double intercept){
        this.slope = slope;
        this.intercept = intercept;
    }
    
    public void set(Point p1, Point p2){
        slope = Point.getSlope(p1, p2);
        intercept = p1.getyCoord() - slope * p1.getxCoord();
    }
    
    //getters
    public double getSlope() {
        return slope;
    }

    public double getIntercept() {
        return intercept;
    }
    
    //static methods
    public static Point getIntersection(Line line1, Line line2){
        double m1 = line1.getSlope();
        double b1 = line1.getIntercept();
        double m2 = line2.getSlope();
        double b2 = line2.getIntercept();
        double x = (b2 - b1) / (m1-m2);
        double y = m1 * x + b2;
        return new Point(x, y);
    }
    
    public static double getDistance(Point point, Line line){
        double x = point.getxCoord();
        double y = point.getyCoord();
        double m = line.getSlope();
        double b = line.getIntercept();
        return Math.abs(m * x - y + b) / Math.sqrt(m * m + 1);
    }
    
}
