/*
 * Class FilesManagement
 */
package filesmanagement;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
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
                    try {
                        WriteReadAddDel.readFromFile();
                    } catch (IOException e) {
                        System.out.println("File not found");
                    }
                    break;
                case 3:
                    try {
                        WriteReadAddDel.addToFile();
                    } catch (IOException e) {
                        System.out.println("File not found");
                    }
                    break;

                case 4:
                    try {
                        WriteReadAddDel.deleteContent();
                    } catch (IOException e) {
                        System.out.println("File not found");
                    }
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
