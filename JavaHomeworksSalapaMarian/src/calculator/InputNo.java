/*
 * clas Input
 */
package calculator;

import java.util.Scanner;

/**
 * Input numbers and text
 *
 * @author MMM
 */
public class InputNo {

    static Scanner userInput = new Scanner(System.in);

    public static String inputText() {
        String opeartorInput;
        opeartorInput = userInput.next();
        return opeartorInput;
    }

    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
