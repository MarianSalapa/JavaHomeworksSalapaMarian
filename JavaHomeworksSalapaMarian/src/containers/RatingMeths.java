/*
 * class RatingMeths
 */
package containers;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class RatingMeths {

    public static void addRating(List<Book> newBookList, List<User> newUserList, HashMap<Rating, Book> newSoldBooks) {
        MenuCont.printBorder();
        String bookName;
        Scanner userInput;
        String description;
        userInput = new Scanner(System.in);
        int user_id;

        System.out.println("Insert the name of the book: ");
        bookName = userInput.nextLine().trim();

        if (BookMeth.checkBookName(newBookList, bookName)) {
            System.out.println("Insert the user Id: ");

            try {
                user_id = userInput.nextInt();

                boolean checkUserId = UsersMeth.checkUserId(newUserList, user_id);
                if (checkUserId) {
                    System.out.println("Insert rating: ");
                    try {
                        float rating = userInput.nextFloat();

                        if (checkRating(rating)) {
                            System.out.println("Insert description: ");
                            userInput = new Scanner(System.in);
                            description = userInput.nextLine().trim();
                            
                            Rating newRating = new Rating(rating, user_id, description);
                            newSoldBooks.put(newRating, BookMeth.getBook(newBookList, bookName));
                            BookMeth.recomputeRating(rating, BookMeth.getBook(newBookList, bookName));

                        } else {
                            System.out.println("Invalid rating: ");

                        }

                    } catch (InputMismatchException e) {
                        System.out.println("Rating is a float number! ");
                    }

                } else {
                    System.out.println("Invalid user code!");
                }

            } catch (InputMismatchException e) {
                System.out.println("User Id is a whole number! ");
            }
        } else {
            System.out.println("No book with this name!");
        }
        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static void printRatings(HashMap<Rating, Book> newSoldBooks) {

        MenuCont.printBorder();

        if (!newSoldBooks.keySet().isEmpty()) {
            System.out.println("Name\tStars\tUser_Id\tDescription");

            newSoldBooks.keySet().forEach((k) -> {
                System.out.println(newSoldBooks.get(k).getBookName() + "\t" + k.getStars() + "\t" + k.getUser_id() + "\t" + k.getDescription());
            });
        } else {
            System.out.println("No ratings recorded");
        }
        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static void printBookRatings(HashMap<Rating, Book> newSoldBooks, List<Book> newBookList) {
        MenuCont.printBorder();
        String bookName;
        boolean checkName, checkBook;
        int user_id;
        Scanner userInput;

        System.out.println("Insert the name of the book: ");
        userInput = new Scanner(System.in);
        bookName = userInput.nextLine().trim();

        if (BookMeth.checkBookName(newBookList, bookName)) {

            if (!newSoldBooks.keySet().isEmpty()) {
                System.out.println("Name\tStars\tUser_Id\tDescription");

                newSoldBooks.keySet().forEach((k) -> {
                    if (bookName.equals(newSoldBooks.get(k).getBookName())) {
                        System.out.println(newSoldBooks.get(k).getBookName()
                                + "\t" + k.getStars() + "\t" + k.getUser_id()
                                + "\t" + k.getDescription());
                    }
                });

            } else {
                System.out.println("No ratings recorded");
            }

        } else {
            System.out.println("No book with this name");
        }

        MenuCont.zeroToExit();
        MenuCont.printBorder();
    }

    public static boolean checkRating(float rating) {
        boolean check = false;
        float[] posValues = new float[]{1.0f, 1.5f, 2.0f, 2.5f, 3.0f, 3.5f, 4.0f, 4.5f, 5, 0f};

        for (float k : posValues) {
            if (rating == k) {
                check = true;
            }
        }
        return check;
    }
}
