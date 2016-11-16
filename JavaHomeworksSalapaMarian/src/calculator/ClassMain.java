/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author MMM
 */
public class ClassMain {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int choise;
        System.out.print("For a new calculation insert 1\nFor exit insert 0\n   your choise__");
        choise = userInput.nextInt();
        while (choise != 0) {
            int res = Calculator.calculator();
            if (res == 2) { //if typed "AC" restart calculation
                System.out.println("\n- AC - Calculation reset");
                choise = 1;
            } else if (res != 0 && res != 2) {
                System.out.print("\n\nFor a new calculation insert 1\nFor exit insert 0\n   your choise__");
                choise = userInput.nextInt();
            } else {
                choise = 0;
            }
        }
        System.out.println("Application terminated ");
    }
}
