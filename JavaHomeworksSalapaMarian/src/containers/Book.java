/*
 * Class Book
 */
package containers;

/**
 *
 * @author MMM
 */
class Book {
    String bookName;
    String bookAuthor;
    float bookRating;
    int noOfRatings;

    public Book(String bookName, String bookAuthor) {
        bookRating=0.0f;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        noOfRatings=0;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public float getBookRating() {
        return bookRating;
    }

    public int getNoOfRatings() {
        return noOfRatings;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookRating(float bookRating) {
        this.bookRating = bookRating;
    }

    public void setNoOfRatings(int noOfRatings) {
        this.noOfRatings = noOfRatings;
    }

}
