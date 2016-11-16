/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author MMM
 */
public class Result {

    public double result(String numS1, String numS2, String op) {
        double resultOp = 0;
        double num1=Double.parseDouble(numS1);
        double num2=Double.parseDouble(numS2);
        
            switch (op) {
                case "+":
                    resultOp = new Add().add(num1, num2);
                    break;
                case "-":
                    resultOp = new Decrease().decrease(num1, num2);
                    break;
                case "*":
                    resultOp = new Multiply().multiply(num1, num2);
                    break;
                case "\\":
                    resultOp = new Divide().divide(num1, num2);
                    break;
                default:
                    break;
            }
            return (resultOp);
        
        
    }
}
