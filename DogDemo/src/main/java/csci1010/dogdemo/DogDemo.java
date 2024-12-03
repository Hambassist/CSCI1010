/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.dogdemo;

/**
 *
 * @author Matt Hammond
 */
public class DogDemo {

    public static void main(String[] args) {
        System.out.println("Dog Demo!");
        Dog myDog = new Dog();
        String myName = "Fido Rules!";
        myDog.setName (myName);
        myDog.age = 4;
        Dog yourDog = new Dog ();
        System.out.println("My Dog");
        myDog.writeOutput();
        yourDog.setName("Bob");
        System.out.println("Your dog");
        yourDog.writeOutput();
        int myDogsYears = myDog.getAgeInHumanYears();
        System.out.println("My dog is " + myDogsYears + " years old");
        Dog notMyDog = new Dog();
        notMyDog.initialize("Barky mc Barkly", "small", 3);
        
    }
}
