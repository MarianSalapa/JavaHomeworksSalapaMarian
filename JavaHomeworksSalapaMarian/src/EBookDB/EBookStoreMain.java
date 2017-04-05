/*
 * Class MainEBookStore
 */
package EBookDB;


import java.util.InputMismatchException;


/**
 *
 * @author MMM
 */
class EBookStoreMain {

    public static void main(String[] args) {
        
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
                    MenuEBook.addEBook();
                    break;
                case 2:
                    MenuEBook.printEBookList();
                    break;
                case 3:
                    MenuEBook.deleteEBook();
                    break;
                case 4:
                    AuthorsListM.addAuthor();
                    break;
                case 5:
                    AuthorsListM.printAuthorsList();
                    break;
                case 6:
                   MenuEBook.rateEBook();
                    break;
                case 7:
                    Table.createTable();
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
