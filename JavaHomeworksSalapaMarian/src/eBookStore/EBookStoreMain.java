/*
 * Class MainEBookStore
 */
package eBookStore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author MMM
 */
class EBookStoreMain {

    public static void main(String[] args) {
        List<EBook> eBookList = new ArrayList<EBook>();
        List<Author> authorList = new ArrayList<Author>();
        int choice;

        MenuEBook.printInitMenu();

        MenuEBook.printMenu();
        try {
            choice = MenuEBook.userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value!");
            choice = 0;
        }

        while (choice != 0) {
            switch (choice) {
                case 1:
                    MenuEBook.addEBook(eBookList, authorList);
                    break;
                case 2:
                    MenuEBook.printEBookList(eBookList);
                    break;
                case 3:
                    MenuEBook.deleteEBook(eBookList);
                    break;
                case 4:
                    AuthorsListM.addAuthor(authorList);
                    break;
                case 5:
                    AuthorsListM.printAuthorsList(authorList);
                    break;
                case 6:
                    MenuEBook.rateEBook(eBookList);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            MenuEBook.printMenu();
            try {
                choice = MenuEBook.userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid value!");
                choice = 0;
            }
        }

    }

}
