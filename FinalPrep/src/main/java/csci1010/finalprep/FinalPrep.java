/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.finalprep;

/**
 *
 * @author Matt Hammond
 */
public class FinalPrep {

    public static void main(String[] args) {
        System.out.println("Final Prep");
        
        // arrays
        int[] arr = new int[6]; //array of integers with 6 elements
        for (int i = 0; i < 6; i++){
            arr[i] = 2 - i;
        }
        
        int j = 0;
        while (j < 3){
            if (arr[j] > 0){
                System.out.println(arr[j]);
            }
            j++;
        }
        
        //math stuff
        System.out.println(doMaths(5, 2, 7));   
        
        // try - catch
        try{
            System.out.println("first");
            System.out.println("second");
            if(true){
                throw new Exception("third");
            }
            System.out.println("fourth");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Last");
        
        // more array stuff
        int[] arr2 = {1,2, 3, 4, 5, 6, 7};
        int highest = arr2[0];
        int lowest = arr2[0];
        for (int i = 1; i < arr2.length; i++){
            if (arr2[i] > highest){
                highest = arr[i];
            }
            if (arr2[i] < lowest){
                lowest = arr[i];
            }
        }
    }
    
    public static int doMaths(int a, int num, int d){
        int c;
        c = (num + d) * a % num;
        return c;
    }
}
