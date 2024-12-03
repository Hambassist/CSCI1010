/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.testarrayequals;

/**
 *
 * @author Matt Hammond
 */
public class TestArrayEquals {

    public static void main(String[] args) {
        System.out.println("Test Array Equals");
        System.out.println("");
        int[] a = new int[3];
        int[] b = new int[3];
        setArray(a);
        setArray(b);
        
        // test changing an element for the equals method
        //b[2] = 20;
        a=b;
        
        System.out.println("first array");
        displayContents(a);
        System.out.println("");
        System.out.println("second array");
        displayContents(b);
        System.out.println("");
        
        // test for equality
        if (b == a){
            System.out.println("Equal by ==");
        }
        else{
            System.out.println("Not equal by ==");
        }
        if (equals(a, b)){
            System.out.println("Equal by the equals method");
        }
        else{
            System.out.println("Not equal by the equals method");
        }
    }
    
    public static void setArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }  
    }
    
    public static void displayContents(int[] array){
        for(int i=0; i < array.length; i++){
            System.out.println("The value at index " + i + " is: " + array[i]);
        }
    }
    
    public static boolean equals(int[] a, int[] b){
        boolean elementsMatch = true;
        if (a.length != b.length){
            elementsMatch = false;
        }
        else {
            int i = 0;
            while (elementsMatch && (i < a.length)){
                if (a[i] != b[i]){
                    elementsMatch = false;
                }
                i++;
            }
        }
        return elementsMatch;
    }
    
}
