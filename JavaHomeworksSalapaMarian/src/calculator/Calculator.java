/*
 * Calcuator class
 */
package calculator;

import java.util.Scanner;

/**
 * implements a computer
 *
 * @author MMM
 */
public class Calculator {

    static Scanner userInput = new Scanner(System.in);

    public static int calculator() {
        String num1, num2;
        int returnNo = 999;
        boolean checkOp = false;
        String operatori[] = {"+", "-", "*", "\\"};

        System.out.print("\nInsert first number(type AC to reset calculation) :");
        num1 = InputNo.inputText();
        if (num1.equals("AC")) {
            returnNo = 2;
        } else if (InputNo.isNumeric(num1)) {

            System.out.print("Insert second number(type AC to reset calculation) :");
            num2 = InputNo.inputText();
            if (num2.equals("AC")) {
                returnNo = 2;
            } else if ((InputNo.isNumeric(num2))) {
                System.out.println("Choose operation: + - * \\");
                String operatorInput = InputNo.inputText();
                for (String k : operatori) {
                    if (k.equals(operatorInput)) {

                        Result objResult = new Result();
                        System.out.println(num1 + operatorInput + num2 + "=" + objResult.result(num1, num2, operatorInput));
                        checkOp = true;
                    }

                }
                if (!checkOp) {
                    System.out.println("Unknown operation");
                    returnNo = 0;
                }
            } else {
                System.out.println("Number inserted is not a double");
                returnNo = 0;
            }

        } else {
            System.out.println("You did not inserted a number");
            returnNo = 0;
        }
        return returnNo; // return 0 if text inseted in not a number or operator is not +-\*
    }
}
