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
        System.out.print("------------------------------------\nInsert first number(AC to reset):  ");
        num1 = InputNo.inputText();
        if (num1.equals("AC")) {
            returnNo = 2;
        } else if (InputNo.isNumeric(num1)) {
            System.out.print("Choose operation: + - * \\ :_______ ");
            String operatorInput = InputNo.inputText();
            for (String k : operatori) {
                if (k.equals(operatorInput)) {
                    checkOp = true;
                }
            }
            if (checkOp) {
                System.out.print("Insert second number(AC to reset): ");
                num2 = InputNo.inputText();
                if (num2.equals("AC")) {
                    returnNo = 2; //return 2 in AC, restart calculator
                } else if ((InputNo.isNumeric(num2))) {
                    System.out.print("Press \"=\" to display the result!  ");
                    String resultInput = InputNo.inputText();
                    if (resultInput.equals("=")) {
                        Result objResult = new Result();
                        System.out.println("------------------------------------\n    "+num1 + operatorInput + num2 + "=" + objResult.result(num1, num2, operatorInput));
                    } else {
                        System.out.println("------------------------------------\nYou din not pushed \" =\" sign ");
                        returnNo = 0; //terminate the application
                    }
                } else {
                    System.out.println("------------------------------------\nYou did not inserted a number");
                    returnNo = 0; //terminate the application
                }
            } else if (!checkOp) {
                if (operatorInput.equals("AC")) {
                    returnNo = 2; //return 2 in AC, restart calculator
                } else {
                    System.out.println("------------------------------------\nUnknown operation");
                    returnNo = 0; //terminate the application
                }
            }
        } else {
            System.out.println("------------------------------------\nYou did not inserted a number");
            returnNo = 0; //terminate the application
        }
        return returnNo; // return 0 if text inserted in not a number or operator is not +-\*
    }
}
