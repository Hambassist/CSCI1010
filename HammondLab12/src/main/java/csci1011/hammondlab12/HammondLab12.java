/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.hammondlab12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * CSCI 1011 - Lab 12
 * @author Matt Hammond
 * A series of methods to test write, append, and display files
 */ 
public class HammondLab12 {

    public static void main(String[] args) {

        String fileName = "testfile.txt";
        PrintWriter outputFile;
        int linesWritten, linesRead;
        Scanner inputFile = null;
        
        
        // part one: Create an empty file and write to it
        outputFile = openFileForWriting(fileName);
        System.out.println("Opened file " + fileName + " for writing");
        linesWritten = writeLinesToFile(outputFile);
        System.out.println("Wrote " + linesWritten + " lines to " + fileName);
        System.out.println("");
        outputFile.close();
        
        // part two: display the file
        inputFile = openFileForReading(fileName);
        System.out.println("Opened file " + fileName + " for reading");
        linesRead = readLinesFromFile(inputFile);
        System.out.println("Read " + linesRead + " from the file " + fileName);
        System.out.println();
        inputFile.close(); 
        
        // part three: append lines to the file
        outputFile = openFileForAppending(fileName);
        System.out.println("Opened file " + fileName + " for appending");
        linesWritten = writeLinesToFile(outputFile);
        System.out.println("Wrote " + linesWritten + " lines to " + fileName);
        System.out.println("");
        outputFile.close();
        
        // part four: display the file
        inputFile = openFileForReading(fileName);
        System.out.println("Opened file " + fileName + " for reading");
        linesRead = readLinesFromFile(inputFile);
        System.out.println("Read " + linesRead + " from the file " + fileName);
        System.out.println();
        inputFile.close(); 
    }
    /**
     * Opens a file to write
     * @param fileName
     * @return outFile
     */
    public static PrintWriter openFileForWriting(String fileName){
        PrintWriter outFile = null;
        try{
            outFile = new PrintWriter(fileName);
        }
        catch (FileNotFoundException e){
            System.out.println("Could not open file " + fileName + " for writing");
            System.exit(0);
        }
        return outFile;
    }
    /**
     * Writes new lines to file
     * @param outputFile
     * @return linesWritten
     */ 
    public static int writeLinesToFile(PrintWriter outputFile){
        Scanner keyboard = new Scanner(System.in);
        String line = "";
        int linesWritten = 0;
        System.out.println("Enter the text you want to write to the file.");
        System.out.println("Enter a blank line when you are done.");
        do {
            line = keyboard.nextLine();
            if (line.length() > 0){
                outputFile.println(line);
                linesWritten ++;
            }
        } while (line.length() > 0);       
        return linesWritten;
    }
    /**
     * Allows you add add lines to existing file.
     * @param fileName
     * @return outFile
     */
    public static PrintWriter openFileForAppending(String fileName){
        PrintWriter outFile = null;
        try{
            outFile = new PrintWriter(new FileOutputStream(fileName, true));
        }
        catch (FileNotFoundException e){
            System.out.println("Could not open file " + fileName + " for appending");
            System.exit(0);
        }
        return outFile;
    }
    /**
     * Opens a file to read only
     * @param fileName
     * @return inputFile
     */
    public static Scanner openFileForReading(String fileName){
        Scanner inputFile = null;
        try{
            inputFile = new Scanner(new File(fileName)); 
        }
        catch(FileNotFoundException e){
            System.out.println("COuld not open file " + fileName + " for reading");
            System.exit(0);
        }
        return inputFile;
    }
    /**
     * Keeps track of the total lines in a file
     * @param inputFile
     * @return linesRead
     */
    public static int readLinesFromFile(Scanner inputFile){
        int linesRead = 0;
        while (inputFile.hasNextLine()){
            String line = inputFile.nextLine();
            linesRead ++;
            System.out.println(line);
        }
        return linesRead;
    }
}