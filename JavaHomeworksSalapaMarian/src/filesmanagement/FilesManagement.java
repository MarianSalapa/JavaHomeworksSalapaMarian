/*
 * Class FilesManagement
 */
package filesmanagement;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class FilesManagement {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        WriteReadAddDel.printMenu();
        choice = InputCheck.checkValidInt();

        while (choice != 0) {
            switch (choice) {
                case 1:
                    WriteReadAddDel.writeToFile();
                    break;
                case 2:
                    WriteReadAddDel.readFromFile();
                    break;
                case 3:
                    WriteReadAddDel.addToFile();
                    break;

                case 4:
                   WriteReadAddDel.deleteContent();
                   
                    break;

                case 0:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            WriteReadAddDel.printMenu();
            choice = InputCheck.checkValidInt();
        }
    }

}
