/*
 * Class MenuCont
 */
package containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class MenuCont {

    static List<User> userList = new ArrayList<User>();
    static List<Book> bookList = new ArrayList<Book>();
    static HashMap<Rating, Book> soldBooks = new HashMap<Rating, Book>();

    public static Scanner userInput;

    public static void printMenu() {
        String menu1Text = "\n_______________Book_Menu________________"
                + "\n| Add user___________________1         |"
                + "\n| View user's list___________2         |"
                + "\n| Add book___________________3         |"
                + "\n| View book's list___________4         |"
                + "\n| New rating_________________5         |"
                + "\n| View all ratings___________6         |"
                + "\n| View rating for a book_____7         |"
                + "\n| To exit press______________0         |";
        System.out.print(menu1Text);
    }

    public static void menuChoice() {
        int choice;
        printMenu();
        choice = InputCheck.checkValidInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    UsersMeth.addUser(userList);
                    break;
                case 2:
                    UsersMeth.printUserList(userList);
                    break;
                case 3:
                    BookMeth.addBook(bookList);
                    break;
                case 4:
                    BookMeth.printBookList(bookList);
                    break;
                case 5:
                    RatingMeths.addRating(bookList, userList, soldBooks);
                    break;
                case 6:
                    RatingMeths.printRatings(soldBooks);
                    break;
                case 7:
                    RatingMeths.printBookRatings(soldBooks, bookList);
                    break;
                case 8:
                    break;
                case 0:
                    break;

                default:
                    
                    System.out.println("\nInvalid choice!");
                    break;
            }
            printMenu();
            choice = InputCheck.checkValidInt();
        }
    }

    public static void printBorder() {
        System.out.println("------------------------------------------");
    }

    public static void printInstructions() {
        System.out.println("------------------------------------------\n"
                + "Please follow these steps:\n"
                + "1. add user\n"
                + "2. add Book\n"
                + "3. rate a Book\n"
                + "------------------------------------------\n");
    }

    public static void zeroToExit() {
        System.out.print("------------------------------------------\n"
                + " Type 0 to get back to the menu: ");
        userInput = new Scanner(System.in);
        String exit = userInput.next();
    }

    public static void printSpaces(int noOfSpaces) {
        for (int i = 0; i < noOfSpaces; i++) {
            System.out.print(" ");
        }
    }
}
