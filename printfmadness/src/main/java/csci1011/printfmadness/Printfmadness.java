/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.printfmadness;

/**
 *
 * @author Matt Hammond
 */
public class Printfmadness {

    public static void main(String[] args) {
        System.out.println("PrintF Madness");
        //strings
        /*
        String lang = "Java";
        System.out.printf("I love %s! %n", lang);
        System.out.printf("I love %20s! \n", lang);
        System.out.printf("I love %-15s! \n", lang);
        System.out.printf("I love %S! \n", lang);
        System.out.printf("Original value " + lang);
        */
        
        //numbers      
        
        int wholeNumber = 1234567890;
        /*
        System.out.printf("Big money %d %n", wholeNumber);  //the %d is for doubles
        System.out.printf("Big money $%,d %n", wholeNumber); //propper comma separated numbers
        System.out.printf("Big money $%015d !%n", wholeNumber); //prints 15 wide leading wiht zeros
        */
        double precisionNumber = 3.1459;
        System.out.printf("Pie %f %n",precisionNumber); //f for float
        System.out.printf("Pie %015.8f %n", precisionNumber);
        System.out.printf("1234567890 in base 8 is %o \n", wholeNumber); //base 8 format
        System.out.printf("1234567890 in base 16 is %x %n", wholeNumber); //base 16 format "hexidecimal"       
        
        

    }
}
