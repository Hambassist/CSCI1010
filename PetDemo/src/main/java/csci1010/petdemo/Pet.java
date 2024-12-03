/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.petdemo;

/**
 *
 * @author Matt Hammond
 */
public class Pet {
    private String name;
    private int age;
    private double weight;
    
    // constructors
    
    public Pet(){
        name = "no name";
        age = 0;
        weight = 0;
    }
    
    public Pet(String name, int age, double weight){
        this.name = name;
        setAge(age);
        setWeight(weight);
    }
    
    public Pet(int age){
        name = "no name";
        setAge(age);
        weight = 0;
    }
    
    public Pet (double weight){
        name = "no name";
        age = 0;
        setWeight(weight);
    }
    
    public void writeOutput(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Weight: " + weight);
}
    
    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
    // setters 
    public void setName(String Name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Error: negative age");
            System.exit(0);
        }
        this.age = age;
    }

    public void setWeight(double weight) {
        if (weight < 0){
            System.out.println("Error: negative age");
            System.exit(0);
        }        
        this.weight = weight;
    }

    
    
    
}
