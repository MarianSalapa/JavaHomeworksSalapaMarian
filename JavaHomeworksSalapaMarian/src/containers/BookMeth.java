/*
 * public class BookMeth {

 */
package containers;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class BookMeth {

    public static void addBook(List<Book> newBookList) {
        Scanner userInput;
        userInput = new Scanner(System.in);
        String bookName, author;

        MenuCont.printBorder();
        System.out.print("Insert the name of the book: ");
        bookName = userInput.nextLine().trim();
        
        System.out.print("Insert the author of the book: ");
        
        author = userInput.nextLine().trim();

        

        if ((bookName.length() > 0) && (author.length() > 0)) {
            Book newBook = new Book(bookName, author);
            newBookList.add(newBook);
            System.out.println("Book added");
        } else {
            System.out.println("Name or author inserted inserted are not valid");
        }
        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static void printBookList(List<Book> newBookList) {
        MenuCont.printBorder();

        if (newBookList.size() > 0) {
            System.out.println("Name\tAuthor\tRating");
            for (int i = 0; i < newBookList.size(); i++) {

                System.out.println(newBookList.get(i).getBookName()
                        + "\t" + newBookList.get(i).getBookAuthor()
                        + "\t" + newBookList.get(i).getBookRating());
            }

        } else {
            System.out.println("Nothing to display");
        }
        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static boolean checkBookName(List<Book> newBookList, String nameSearched) {
        boolean check = false;
        for (int i = 0; i < newBookList.size(); i++) {
            if (nameSearched.equals(newBookList.get(i).getBookName())) {
                check = true;
            }
        }
        return check;
    }

    public static Book getBook(List<Book> newBookList, String nameSearched) {

        Book searchedBook = null;
        for (int i = 0; i < newBookList.size(); i++) {
            if (nameSearched.equals(newBookList.get(i).getBookName())) {
                searchedBook = newBookList.get(i);
            }
        }

        return searchedBook;
    }

    public static void recomputeRating(float newRating, Book newBook) {
        if (newBook.getNoOfRatings() == 0) {
            newBook.setBookRating(newRating);
            newBook.setNoOfRatings(1);
        } else {
            float newRecomputedRating;
            newRecomputedRating = (newBook.getBookRating() * newBook.getNoOfRatings() + newRating) / (newBook.getNoOfRatings() + 1);
            newBook.setBookRating(newRecomputedRating);
            newBook.setNoOfRatings(newBook.getNoOfRatings() + 1);
        }
    }
}
