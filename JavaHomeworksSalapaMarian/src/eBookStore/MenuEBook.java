/*
 * eBook Menu class
 */
package eBookStore;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * implements methods of the eBook menu
 *
 * @author MMM
 */
public class MenuEBook {

    static Scanner userInput = new Scanner(System.in);

    public static void printMenu() {
        String menu1Text = "\n_______________eBook_Menu_______________"
                + "\n| Add eBook__________________1         |"
                + "\n| List eBook_________________2         |"
                + "\n| Delete eBook_______________3         |"
                + "\n| New Author_________________4         |"
                + "\n| Author's list______________5         |"
                + "\n| Rate a eBook_______________6         |"
                + "\n| To exit press______________0         |"
                + "\n| your choice________";
        System.out.print(menu1Text);
    }

    public static void addEBook(List<EBook> newEBookList, List<Author> newAuthorList) {
        String title, category;
        int noOfPages;
        double price, rating;
        boolean checkCategoryVar;
        List<Author> bookAuthorList = new ArrayList<Author>();

        System.out.print("----------------------------------------\n"
                + "_________Add new eBook________"
                + "\nInsert title:");
        title = userInput.next();
        System.out.print("Existent categories:\n"
                + "> technical, novels, art_albums, poetry"
                + "\nInsert category: ");
        category = userInput.next();

        checkCategoryVar = checkCategory(category);
        if (checkCategoryVar) {

            InsertAutorEBook(bookAuthorList, newAuthorList);
            if (bookAuthorList.size() > 0) {
                System.out.print("Insert noOfPages:");
                try {
                    noOfPages = userInput.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid value! No of pages set to 0");
                    noOfPages = 0;
                }
                System.out.print("Insert price:");
                try {
                    price = userInput.nextDouble();
                } catch (InputMismatchException e2) {
                    System.out.println("Invalid value! Price set to 0");
                    price = 0.0;
                }
                System.out.print("Insert rating (1 to 5):");
                try {
                    rating = userInput.nextDouble();
                } catch (InputMismatchException e3) {
                    System.out.println("Invalid value! Rating set to 2.5");
                    rating = 2.5;
                }
                if (!(rating >= 1) || !(rating <= 5)) {
                    System.out.println("Invalid value! Rating set to 2.5");
                    rating = 2.5;
                }

                EBook newEBook = new EBook(title, noOfPages, price, rating);
                newEBook.authors.addAll(bookAuthorList);
                newEBookList.add(newEBook);

                System.out.println("Book " + title + " added");

                zeroToExit();
            } else {
                System.out.println("Invalid author");
            }
        } else {
            System.out.println("Invalid category");
        }
    }

    public static void printEBookList(List<EBook> newEBookList) {

        if (newEBookList.size() > 0) {

            System.out.println(
                    "\n eBook list ");

            for (int i = 0; i < newEBookList.size(); i++) {
                System.out.print(
                        "----------------------------------------\n");

                System.out.println(newEBookList.get(i).getTitle() + "\n   eBook code: "
                        + newEBookList.get(i).getCodeISBN()
                        + "\n   eBook title:" + newEBookList.get(i).getTitle());
                printAutorEBook(newEBookList.get(i).getAuthors());
                System.out.print("\n   No of pages: " + newEBookList.get(i).getNoOfPages()
                        + "\n   Price: ");
                System.out.printf("%.2f", newEBookList.get(i).getPrice());
                System.out.print("\n   Rating: ");
                System.out.printf("%.1f", newEBookList.get(i).getRating());
                System.out.println("");
            }

        } else {
            System.out.println("Nothing to display");

        }
        zeroToExit();

    }

    public static void deleteEBook(List<EBook> newEBookList) {
        String codeDelete;
        System.out.print(
                "----------------------------------------\n"
                + "Code of the eBook to be deleted: ");
        codeDelete = userInput.next();
        for (int i = 0; i < newEBookList.size(); i++) {
            if (codeDelete.equals(newEBookList.get(i).getCodeISBN())) {
                newEBookList.remove(i);
                System.out.println("The book " + codeDelete + " was deleted");

            } else {
                System.out.println("Invalid code");

            }
        }
        zeroToExit();
    }

    public static void InsertAutorEBook(List<Author> newAuthorAddEBook, List<Author> newAuthorList) {
        String name, surname;
        boolean checkAuthor = false;
        int choice1 = 1;
        while (choice1 != 0) {
            System.out.print("Insert author's name:");
            name = userInput.next();
            System.out.print("Insert author's surname:");
            surname = userInput.next();

            for (int i = 0; i < newAuthorList.size(); i++) {
                if ((name.equals(newAuthorList.get(i).getNameAuthor())) && (surname.equals(newAuthorList.get(i).getSurnameAuthor()))) {
                    checkAuthor = true;
                }
            }
            if (checkAuthor) {
                Author newAuthor = new Author(name, surname);
                newAuthorAddEBook.add(newAuthor);
            }
            System.out.print("     >Add another author_________1"
                    + "\n     >This was the last author___0"
                    + "\n     >your choise: ");
            choice1 = userInput.nextInt();
        }

    }

    public static void printAutorEBook(List<Author> newEBookListAuthor) {
        System.out.print("   Authors: ");
        for (int j = 0; j < newEBookListAuthor.size(); j++) {
            System.out.print(newEBookListAuthor.get(j).getNameAuthor() + " "
                    + newEBookListAuthor.get(j).getSurnameAuthor() + " , ");
        }
    }

    public static boolean checkCategory(String newCategory) {
        boolean check = false;
        newCategory = newCategory.toUpperCase();
        for (EBook.Category k : EBook.Category.values()) {
            if (k.toString().equals(newCategory)) {
                check = true;
            }
        }
        return check;
    }

    public static void rateEBook(List<EBook> newEBookList) {
        String codeRated;
        double newRating;
        System.out.print(
                "----------------------------------------\n"
                + "Code of the eBook to be rated: ");
        codeRated = userInput.next();
        for (int i = 0; i < newEBookList.size(); i++) {
            if (codeRated.equals(newEBookList.get(i).getCodeISBN())) {
                int ratings = newEBookList.get(i).getNoOfRatings();
                ratings++;
                newEBookList.get(i).setNoOfRatings(ratings);
                System.out.print("Insert new rating (1 to 5): ");

                newRating = userInput.nextDouble();

                if ((newRating >= 1) && (newRating <= 5)) {
                    newEBookList.get(i).setRating((newEBookList.get(i).getRating() * (ratings - 1) + newRating) / (ratings));
                    System.out.println("The book " + codeRated + " was rated");
                } else {
                    System.out.println("Invalid rating!");

                }
            } else {
                System.out.println("Invalid code !");

            }
        }
        zeroToExit();
    }

    public static void zeroToExit() {
        System.out.print("----------------------------------------\n"
                + " Type 0 to get back to the menu: ");
        String exit = userInput.next();
    }

    public static void printInitMenu() {
        System.out.println(
                "----------------------------------------\n"
                + "Please follow three steps:\n"
                + "1. add author\n2. add eBook\nThen you can rate or delete a eBook\n"
                + "----------------------------------------\n");

    }

}
