/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.hammondassign4;

/**
 *
 * @author Matt Hammond
 */
public class Ball {
    private double hDist;
    private double vDist;
    private double hSpeed;
    private double vSpeed;
    
    // sets starting parameters
    public void initialize(double angle, double velocity, double height){
        hDist = 0;
        vDist = height;
        hSpeed = velocity * Math.cos(Math.toRadians(angle));
        vSpeed = velocity * Math.sin(Math.toRadians(angle));
    }
    //updates with mathematical expressions and the users inputs form Main
    public void update(double time){
        double oldVSpeed = vSpeed;
        hDist = (time * hSpeed) + hDist;
        vSpeed = vSpeed - (9.8 * time);
        vDist = ((oldVSpeed + vSpeed) / 2) * time + vDist;
    }
    // getters for vDist and hDist to return the values
    public double getvDist() {
        return vDist;
    }
    public double gethDist() {
        return hDist;
    }
    
    
}
