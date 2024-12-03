/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1010.bookeggs;

/**
 *
 * @author Matt Hammond
 */
public class Bookeggs {

    public static void main(String[] args) {
      int booksOnShelf = 18;
      int pagesInBooks = 300; 
      int totalPages = booksOnShelf * pagesInBooks; 
      
        System.out.println("If you have");
        System.out.println(booksOnShelf + " books on your shelf");
        System.out.println("and each book has " + pagesInBooks + " pages");
        System.out.println("then the total pages is " + totalPages);
        
    }
}
