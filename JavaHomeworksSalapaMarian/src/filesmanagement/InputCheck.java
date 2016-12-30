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

    static int InputChoiceCheck() {
        int choice = 5;
        boolean check = true;

        while (check) {
            check = false;
            System.out.print("\n             your choice is___");
            try {
                choice = userInput.nextInt();


            } catch (InputMismatchException e) {
                System.out.println("Invalid type!");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid value!");
            }
        }
        return choice;
    }

    public static boolean checkAcceptedValue(int newChoice) {
        int[] acceptedValues = {1, 2, 3, 4, 0};
        boolean checkV = false;

        for (int k : acceptedValues) {
            if (k == newChoice) {
                checkV = true;
            }
        }
        return checkV;
    }
}
