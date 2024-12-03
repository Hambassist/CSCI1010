/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.packagedemo;
//import Retail.Customer;  // allows class to be used from retail package
//import Retail.Items; // imports item class from customer package.  Usefull when you don't want all classes in package
import Retail.*; // the * allows all classes under retail to be imported
import Enterprise.Customer; // imports enterprise package class customer
/**
 *
 * @author Matt Hammond
 */
public class PackageDemo {

    public static void main(String[] args) {
        Retail.Customer rC = new Retail.Customer(); // can't find because customer class is in a different package. MUST IMPORT
        System.out.println("rC= " + rC.toString());
        Items i1 = new Items();
        Customer eC = new Customer();
        System.out.println("eC= " + eC.toString());
    }
}
