/*
 * class AuthorMethodsList
 */
package eBookStore;

import java.util.List;

/**
 * Implements methods of author's list
 * @author MMM
 */
public class AuthorsListM {
        public static void addAuthor(List<Author> newAuthorList) {
        String name, surname;
        System.out.print("----------------------------------------\n"
                + "________Add new author________"
                + "\nInsert author's name:");
        name = MenuEBook.userInput.next();
        System.out.print("Insert author's surname:");
        surname = MenuEBook.userInput.next();

        Author newAuthor = new Author(name, surname);
        newAuthorList.add(newAuthor);
        System.out.println("Author " + name + " " + surname + " added");
        MenuEBook.zeroToExit();
    }

    public static void printAuthorsList(List<Author> newAuthorList) {
        System.out.print(
                "----------------------------------------\n");
        if (newAuthorList.size() > 0) {
            System.out.println("Code\tName\tSurname");
            for (int i = 0; i < newAuthorList.size(); i++) {

                System.out.println(newAuthorList.get(i).getCodeAuthor()
                        + "\t" + newAuthorList.get(i).getNameAuthor()
                        + "\t" + newAuthorList.get(i).getSurnameAuthor());

            }

        } else {
            System.out.println("Nothing to display");
        }
        MenuEBook.zeroToExit();
    }

}
