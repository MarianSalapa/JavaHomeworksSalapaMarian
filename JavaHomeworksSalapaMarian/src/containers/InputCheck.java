/*
 * Input check class
 */
package containers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class InputCheck {

    public static Scanner userInput;

    public static int checkValidInt() {
        int choice = 8;
        System.out.print("\n            your choice is___");
        try {
            userInput = new Scanner(System.in);
            choice  = userInput.nextInt();
            
        } catch (InputMismatchException e) {
            
            System.out.println("\nThis is not a whole number!");

        }
        return choice;
    }

}
