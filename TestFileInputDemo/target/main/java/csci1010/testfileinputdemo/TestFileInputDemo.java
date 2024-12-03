/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.testfileinputdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Matt Hammond
 */
public class TestFileInputDemo {

    public static void main(String[] args) {
        String fileName = "out.txt";
        Scanner inputStream = null;
        System.out.println("The file " + fileName + "\ncontains the following lines:\n");
        try{
            inputStream = new Scanner(new File(fileName));
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the " + fileName + " file");
            System.exit(0);
        }
        while (inputStream.hasNextLine()){
            String line = inputStream.nextLine();
            System.out.println(line);
        }
        System.out.println("");
        System.out.println("Done reading from the " + fileName + " file");
        inputStream.close();
    }
}
