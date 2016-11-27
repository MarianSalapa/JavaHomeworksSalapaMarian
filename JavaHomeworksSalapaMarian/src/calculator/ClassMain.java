/*
 * main class calculator
 */
package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * menu of calculator before start calculation
 *
 * @author MMM
 */
public class ClassMain {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int choise = 0;
        String menuInitial = "____________________________________"
                + "\n|For a new calculation insert__1   |"
                + "\n| For exit insert______________0   |"
                + "\n| your choise______";
        System.out.print(menuInitial);
        try {
            choise = userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("------------------------------------\nInvalid value!");
        }
        while (choise != 0) {
            int res = Calculator.calculator();
            if (res == 2) { //if typed "AC" restart calculation
                System.out.println("\n- AC - Calculation reset");
                choise = 1;
            } else if (res != 0 && res != 2) {
                System.out.print(menuInitial);
                try {
                    choise = userInput.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid value!");
                }
            } else {
                choise = 0;
            }
        }
        System.out.println("------------------------------------\nApplication terminated !");
    }
}
