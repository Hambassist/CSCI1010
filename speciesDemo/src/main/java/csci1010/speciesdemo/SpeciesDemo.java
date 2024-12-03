/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.speciesdemo;

/**
 *
 * @author Matt Hammond
 */
public class SpeciesDemo {

    public static void main(String[] args) {
        System.out.println("Species Demo");
        int predictYears = 8;
        Species speciesOfTheMonth = new Species();
        //double populationAmount = 500000;
        speciesOfTheMonth.setSpecies("rat", 1000, 50.0);
        //System.out.println("Enter species one");
        //speciesOfTheMonth.readInput();
        /*
        speciesOfTheMonth.writeOutput();
        int popInTen = speciesOfTheMonth.getPopulationIn10();
        //System.out.println("Population in 10 years: " + popInTen);
        //System.out.println("PopulationAmount: " + populationAmount);
        System.out.println("Population in " + predictYears + " years: "
                + speciesOfTheMonth.predictPopulation(predictYears));
        System.out.println("predict years: " + predictYears);
        */
        //System.out.println("Enter species two");
        Species lastMonth = new Species();
        //lastMonth.readInput();
        lastMonth.setSpecies("T-Rex", 1, -150.0);
        // use the equal method
        System.out.println("test using the equals method");
        if (speciesOfTheMonth.equals(lastMonth)){
            System.out.println("They are the same species");
        }
        else {
            System.out.println("They are not the same species");
        }
        /*
        System.out.println("Test using ==");
        if (speciesOfTheMonth == lastMonth){
            System.out.println("They are the same species");
        }
        else {
            System.out.println("They are not the same species");
        }
        */
        testEquals(speciesOfTheMonth, lastMonth);
        // population is larger than 
        if (speciesOfTheMonth.isPopulationLargerThan(lastMonth)){
            System.out.println("The " + speciesOfTheMonth.getName() + " has a larger population");
        }
        else{
            System.out.println("The " + lastMonth.getName() + " has a larger population");
        }
        // check isExtict
        lastMonth.predictPopulation(10);
        if(lastMonth.isExtinct()){
            System.out.println("The " + lastMonth.getName() + " is extinct");
        }
        System.out.println("T-Rex pop: " + lastMonth.getPopulation());
    }
    
    private static void testEquals(Species s1, Species s2){
         if (s1 == s2){
            System.out.println("They are the same species with testEquals");
        }
        else {
            System.out.println("They are not the same species testEquals");
        }       
    }
}
