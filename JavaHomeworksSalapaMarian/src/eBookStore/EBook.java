/*
 * EBook
 */
package eBookStore;

import java.util.ArrayList;
import java.util.List;

/**
 * implements attributes and behavior of an eBook
 *
 * @author MMM
 */
class EBook {

    public enum Category 
        {TECHNICAL, NOVELS, ART_ALBUMS, POETRY
    };
    private String codeISBN;
    Category bookCategory;
    private String title;
    List<Author> authors = new ArrayList<Author>();
    private int noOfPages;
    private double price;
    private double rating;
    private static int noOfeBook;
    private int noOfRatings=1;


    
    EBook(String title, int noOfPages, double price, double rating) {
        noOfeBook++;
        this.codeISBN="eB"+Integer.toString(noOfeBook);
        this.title = title;
        this.noOfPages = noOfPages;
        this.price = price;
        this.rating = rating;
        
    }

    
    
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
    
    public void setNoOfRatings(int noOfRatings) {
        this.noOfRatings = noOfRatings;
    }

    public int getNoOfRatings() {
        return noOfRatings;
    }

    public Category getBookCategory() {
        return bookCategory;
    }
    
}
