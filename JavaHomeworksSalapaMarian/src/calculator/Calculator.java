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
public class Calculator {

    static Scanner userInput = new Scanner(System.in);

    public static void calculator() {
        int num1, num2;
        System.out.print("Insert first number :");
        num1 = userInput.nextInt();
        System.out.print("Insert second number :");
        num2 = userInput.nextInt();

        System.out.println("Choose operation: + - * \\");
        String opeartorInput = userInput.next();
       
        if (opeartorInput.equals("+")) {
            System.out.println(num1+"+"+num2+"=" + addition(num1, num2));
        }
        if (opeartorInput.equals("-")) {
            System.out.println(num1+"-"+num2+"=" + decrease(num1, num2));
        }

        if (opeartorInput.equals("*")) {
            System.out.println(num1+"*"+num2+"=" + multiplication(num1, num2));
        }

        if (opeartorInput.equals("\\")) {
            System.out.println(num1+"\\"+num2+"=" + division(num1, num2));

        }

    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int decrease(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return a / b;
    }

}
