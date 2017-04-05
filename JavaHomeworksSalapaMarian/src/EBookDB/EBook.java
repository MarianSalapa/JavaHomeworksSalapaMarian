/*
 * EBook
 */
package EBookDB;


/**
 * implements attributes and behavior of an eBook
 *
 * @author MMM
 */
class EBook {

   
    private String codeISBN;
    private String title;
    String authorCode;
    private int noOfPages;
    private int price;
    private int rating;
    private int noOfRatings=1;


    
    EBook(String title,  int price, int rating, String codeISBN) {
        this.codeISBN=codeISBN;
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.noOfRatings=1;
    }

    public void setCodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }

    public String getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public String getTitle() {
        return title;
    }


    public int getNoOfPages() {
        return noOfPages;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }
    
    public void setNoOfRatings(int noOfRatings) {
        this.noOfRatings = noOfRatings;
    }

    public int getNoOfRatings() {
        return noOfRatings;
    }

    
}
