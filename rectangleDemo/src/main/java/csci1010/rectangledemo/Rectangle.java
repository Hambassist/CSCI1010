/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.rectangledemo;

/**
 *
 * @author Matt Hammond
 */
public class Rectangle {
    private int length;
    private int width;
    //private int area;
    
    public void setDimensions(int length, int width) {
        // set the dimensions of the rectangle
        this.length = length;
        this.width = width;
        //area = this.width * this.length;
    }

    public int getArea(){
        //return area;     
        return length * width; 
    }
    
    
    
}
