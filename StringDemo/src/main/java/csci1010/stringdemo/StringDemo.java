/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.stringdemo;

/**
 *
 * @author Matt Hammond
 */
public class StringDemo {

    public static void main(String[] args) {
        System.out.print("Fun with strings!\n");
        String sentence = "Text processing is hard";

        int position = sentence.indexOf("hard");
        System.out.println("The word \"hard\" starts at index: " + position);
        sentence = sentence.substring(0, position) + "easy";
        sentence = sentence.toUpperCase();
        
        
        //display
        System.out.println(sentence);
    }
}
