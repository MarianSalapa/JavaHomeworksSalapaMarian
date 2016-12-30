/*
 * Input check class
 */
package filesmanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class InputCheck {

    public static Scanner userInput = new Scanner(System.in);

    public static int checkValidInt() {
        int choice = 5;
        System.out.print("\n             your choice is___");
        try {
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            userInput.next();
            System.out.println("That's not a whole number");
            return choice;
        }

    }

   
}
