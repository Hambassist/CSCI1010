/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.textfileoutputdemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class TextFileOutputDemo {

    public static void main(String[] args) {
        String fileName = "out.txt";
        PrintWriter outputStream = null;
        try{
            outputStream = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file: " + fileName);
            System.exit(0);
        }
        // get data to write the file
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three lines of text: ");
        for (int i = 0; i < 3; i++){
            String line = keyboard.nextLine();
            outputStream.println(line);
        }
        
        outputStream.close();
        System.out.println("Lines written to " + fileName);
    }
}
