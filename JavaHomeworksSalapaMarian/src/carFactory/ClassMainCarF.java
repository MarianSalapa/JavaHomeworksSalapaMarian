/*
 * main class for car factory
 */
package carFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * will test the implementation of all involved classes
 *
 * @author MMM
 */
public class ClassMainCarF {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<Customer>();
        List<Car2> manufacturedCarsList = new ArrayList<Car2>();
        List<Orders> ordersList = new ArrayList<Orders>();

        int choice;

        MenuClass.printInitMenu();

        MenuClass.printMenu1();
        try {
            choice = userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value!");
            choice=0;
        }

        while (choice != 0) {

            if (choice == 1) {
                MenuClass.customersMenuMeth(ordersList, customerList);
            } else if (choice == 2) {
                MenuClass.carFactoryMenuMeth(ordersList, manufacturedCarsList);
            } else if ((choice != 1) && (choice != 2)) {
                System.out.println("\nInvalid choice");
            }

            MenuClass.printMenu1();
            
            try {
                choice = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid value!");
                choice=0;
            }
        }

        System.out.println(
                "----------------------------------------\n"
                +"Application terminated !");
    }

}
