/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CNP;

/**
 *
 * @author MMM
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CNP {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String CNP;

        String CNPRegEx
                = "[1-9]"// first number is a digit between 1 and 9
                + "[0-9]{2}" // year of birth
                + "("
                + "(0[13578]|1[02])" // months with 31 days
                + "(0[1-9]|[12]\\d|3[01])" // 31 days
                + "|"
                + "(0[469]|11)" // months with 30 days
                + "(0[1-9]|[12]\\d|30)" // 30 days
                + "|"
                + "02" // month with 28 or 29 days
                + "(0[1-9]|[12]\\d)" // 29 days
                + ")"
                + "(0[1-9]|[1-3]\\d|4[0-6]|5[12])" // county - a value between 01-46, 51 or 52

                + "((00[1-9])|(0[1-9][0-9])|([1-9][0-9][0-9]))" // a number between 001 and 999

                + "[0-9]"; //random digit between 0-9

        System.out.println("Insert CNP");
        try {
            CNP = userInput.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid data!");
            CNP = "";
        }

        Pattern pattern = Pattern.compile(CNPRegEx);
        Matcher matcher = pattern.matcher(CNP);

        System.out.print("\n" + CNP);

        if (matcher.matches()) {
            System.out.println(" is a valid CNP");
        } else {
            System.out.println(" is not a valid CNP");
        }
    }
}
