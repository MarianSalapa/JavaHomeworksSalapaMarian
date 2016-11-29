/*
 * Menu class
 */
package carFactory;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * implements customer menu and factory menu
 *
 * @author MMM
 */
public class MenuClass {

    static Scanner userInput = new Scanner(System.in);

    public static void printMenu1() {
        String menu1Text = "\n__MainMenu______________________________"
                + "\n| Customers menu press_______1         |"
                + "\n| Car Factory menu press_____2         |"
                + "\n| To exit press______________0         |"
                + "\n| your choice________";
        System.out.print(menu1Text);
    }

    public static void printCustomersMenu() {
        String menuCText = "\n    _____________________CustomersMenu__"
                + "\n    | New customer_______________1     |"
                + "\n    | New order__________________2     |"
                + "\n    | List of customers__________3     |"
                + "\n    | List of orders_____________4     |"
                + "\n    | Get back to main menu______0     |"
                + "\n    | your choice______";
        System.out.print(menuCText);
    }

    public static void customersMenuMeth(List<Orders> newOrdersList, List<Customer> newCustomersList) {
        printCustomersMenu();
        int choiceC;

        try {
            choiceC = userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value!");
            choiceC = 0;
        }

        while (choiceC != 0) {
            switch (choiceC) {
                case 1:
                    CustomersMehods.addCustomer(newCustomersList);
                    break;
                case 2:
                    CustomersMehods.addOrder(newOrdersList, newCustomersList);
                    break;
                case 3:
                    CustomersMehods.printCustomersList(newCustomersList);
                    break;
                case 4:
                    CustomersMehods.printOrdersList(newOrdersList);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            printCustomersMenu();
            try {
                choiceC = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid value!");
                choiceC = 0;
            }
        }

    }

    public static void carFactoryMenuPrint() {
        String menuFText = "\n    ____________________CarFactoryMenu__"
                + "\n    | View pending orders________1     |"
                + "\n    | Preceed orders_____________2     |"
                + "\n    | View delivered cars list___3     |"
                + "\n    | To exit press______________0     |"
                + "\n    | your choice______";
        System.out.print(menuFText);

    }

    public static void carFactoryMenuMeth(List<Orders> newOrdersList, List<Car2> newManufacturedCarsList) {
        carFactoryMenuPrint();
        int choiceF;

        try {
            choiceF = userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value!");
            choiceF = 0;
        }

        while (choiceF != 0) {
            switch (choiceF) {
                case 1:
                    CarFactoryMethods.viewOrders(newOrdersList);
                    break;
                case 2:
                    CarFactoryMethods.proceedOrders(newOrdersList, newManufacturedCarsList);
                    break;
                case 3:
                    CarFactoryMethods.deliveredCarsList(newManufacturedCarsList);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            carFactoryMenuPrint();
            try {
                choiceF = userInput.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid value!");
                choiceF = 0;
            }
        }

    }

    public static void printInitMenu() {
        System.out.println(
                "----------------------------------------\n"
                + "To deliver a car please follow three steps:\n"
                + "1. add customer\n2. add order\n3. proceed order and deliver the car\n"
                + "----------------------------------------\n");

    }
}
