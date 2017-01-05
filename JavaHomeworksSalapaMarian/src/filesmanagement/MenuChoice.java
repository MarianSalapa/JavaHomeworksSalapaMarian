/*
 * MenuChoice class
 */
package filesmanagement;

import java.util.Scanner;

/**
 * 
 * @author MMM
 */
public class MenuChoice {
    public static Scanner userInput = new Scanner(System.in);
    public static void menuChoice(){
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
