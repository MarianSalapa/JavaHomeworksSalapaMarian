/*
 *  Customer Methods class
 */
package carFactory;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * implements customer methods
 *
 * @author MMM
 */
public class CustomersMehods {

    static Scanner userInput = new Scanner(System.in);

    public static void addCustomer(List<Customer> newCustomersList) {
        String nameC;
        int bankBalance;

        System.out.print("----------------------------------------\n"
                + "________Add new client________\n   Insert customer's name:");
        nameC = userInput.next();

        System.out.print("   Insert balance: ");
        try{
        bankBalance = userInput.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid value! Bank balance set to 0");
            bankBalance=0;
        }
        Customer newCustomer = new Customer(nameC, bankBalance);
        newCustomersList.add(newCustomer);
        System.out.print(" Customer added\n----------------------------------------");
        zeroToExit();
    }

    public static void addOrder(List<Orders> newOrdersList, List<Customer> newCustomersList) {
        String nameCustomer, carOrdered, colorOrderedInp;
        boolean checkClient = false;

        System.out.print("----------------------------------------\n"
                + "________Add new order________\n   Insert customer's name:");
        nameCustomer = userInput.next();

        for (int i = 0; i < newCustomersList.size(); i++) {
            if (nameCustomer.equals(newCustomersList.get(i).getCusotmerName())) {
                checkClient = true;
            }
        }
        if (checkClient) {
            System.out.print("   Insert type: ");
            carOrdered = userInput.next();

            System.out.print("   Insert color: ");
            colorOrderedInp = userInput.next();

            Car2.Color colorOrdered = Car2.colorOrdered(colorOrderedInp);
                if (colorOrdered.toString().equals(Car2.Color.NONE.toString())) {
                    System.out.println("Car Factory don't have this color");
                    zeroToExit();
                } else {
            Orders newOrder = new Orders(nameCustomer, carOrdered, colorOrderedInp);
            newOrdersList.add(newOrder);

            System.out.print("\n Order added\n----------------------------------------");
                zeroToExit();
                }
        } else {
            System.out.println("Customer not found !\nGo to \"New customer\" to add\n");
            zeroToExit();
        }

    }

    public static void printCustomersList(List<Customer> newCustomersList) {
        System.out.print(
                "----------------------------------------\n");
        if (newCustomersList.size() > 0) {
            System.out.println("Code\tName\tBalance");
            for (int i = 0; i < newCustomersList.size(); i++) {

                System.out.println(newCustomersList.get(i).getCustomerCode() 
                        + "\t" + newCustomersList.get(i).getCusotmerName() 
                        + "\t" + newCustomersList.get(i).getBankBalanceC());
                
                
            }
                
        } else {
            System.out.println("Nothing to display");
        }
        zeroToExit();
    }

    public static void printOrdersList(List<Orders> newOrdersList) {
        System.out.print(
                "----------------------------------------\n");
        if (newOrdersList.size() > 0) {

            System.out.println("Code\tName\tType\tColor\tDelivered");
            for (int i = 0; i < newOrdersList.size(); i++) {

                System.out.println(newOrdersList.get(i).getOrderCode() + "\t" 
                        + newOrdersList.get(i).getCustomerName() + "\t" 
                        + newOrdersList.get(i).getCarOrdered() + "\t" 
                        + newOrdersList.get(i).getColorCarOrdered()+ "\t" 
                        + newOrdersList.get(i).isDelivered());

            }
        } else {
            System.out.println("Nothing to display");
        }
        zeroToExit();
    }
    public static void zeroToExit(){
        System.out.print("\n Type 0 to get back to the menu: ");
        String exit = userInput.next();
    }
}
