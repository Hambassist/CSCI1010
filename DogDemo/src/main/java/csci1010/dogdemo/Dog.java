/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.dogdemo;

/**
 *
 * @author Matt Hammond
 */
public class Dog {
    public String name;
    public String breed;
    public int age;
    
    public void writeOutput(){
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age); 
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
    this.name = name; 
    }

    public int getAgeInHumanYears(){
        int humanAge = 0;
        // do math
        if (age <= 2){
            humanAge = age * 11;
        }
        else {
            humanAge = 22 + ((age- 2)*5);
        }
        
        return humanAge;
    }
        public void initialize(String name, String breed, int age){
            this.name = name;
            this.breed = breed;
            this.age = age;
        }
    }
    
