/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eBookStore;

/**
 *
 * @author MMM
 */
public class Art_Albums extends EBook {

    public Art_Albums(String title, int noOfPages, double price, double rating) {
        super(title, noOfPages, price, rating);
        bookCategory = Category.ART_ALBUMS;
    }

}
