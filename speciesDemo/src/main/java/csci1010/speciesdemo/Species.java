/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csci1010.speciesdemo;

import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class Species {
    public String name;
    public int population;
    public double growthRate;
    
    public void readInput(){
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the species name: ");
        name = keyboard.nextLine();
        System.out.println("What is the population of the species? ");
        population = keyboard.nextInt();
        System.out.println("Enter the growth rate % per year: ");
        growthRate = keyboard.nextDouble();
    }
    
    public void writeOutput(){
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth Rate = " + growthRate);
    }
    
    public int getPopulationIn10(){
        int result = 0;
        // math stuff
        double populationAmount = population;
        int count = 10;
        while((count > 0) && (populationAmount >0)){
            populationAmount = populationAmount + (growthRate / 100) 
                    * populationAmount;
            count --;           
        }
        if (populationAmount > 0){
            result = (int)populationAmount;
        }
        return result;
    }
    
    public int predictPopulation(int years){
        int result = 0;
        // math stuff
        double populationAmount = population;
        int count = years;
        while((count > 0) && (populationAmount >0)){
            populationAmount = populationAmount + (growthRate / 100) 
                    * populationAmount;
            count --;           
        }
        if (populationAmount > 0){
            //years = 500000;
            result = (int)populationAmount;
        }
        else {
            population = 0;
        }
        return result;
    }
    
    public boolean equals(Species other){
        return ((this.name.equalsIgnoreCase(other.name)) && 
                (this.population == other.population) && 
                (this.growthRate == other.growthRate));
    }
    
    public void setSpecies(String name, int population, double growthRate){
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
        
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
    /**
     * 
     * @return 
     */
    public double getGrowthRate() {
        return growthRate;
    }
    
    public boolean isPopulationLargerThan(Species other){
        return this.population > other.population;        
    }
    
    public boolean isExtinct(){
        return population == 0;
    }
}
