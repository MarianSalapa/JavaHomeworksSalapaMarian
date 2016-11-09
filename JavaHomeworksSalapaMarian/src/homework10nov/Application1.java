/*
 Short Java program that reads your name from keyboard and writes it in console
 */
package homework10nov;
import java.util.Scanner;

/**
 * @author MMM
 */
public class Application1 {
    
static Scanner userInput=new Scanner(System.in);
     static void yourName() {
        System.out.println("Enter your name: ");
        String name=userInput.next();
        System.out.println("Your name is "+name);
    }
}