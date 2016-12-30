/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author MMM
 */
public class ValidationException extends Exception {

    public ValidationException(String message) {
        super(message);
    }

    public static int parseAge(String age) throws ValidationException {
        int value;
        try {
            value = Integer.parseInt(age);
        } catch (NumberFormatException e) {
            throw new ValidationException("should be an int");
        }
        if (value < 0 || value > 150) {
            throw new ValidationException("should be between 0 and 150 inclusive");
        }
        return value;
    }
}
