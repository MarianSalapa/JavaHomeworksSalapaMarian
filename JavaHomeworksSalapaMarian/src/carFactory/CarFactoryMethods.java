/*
 *  Car Factory Methods class
 */
package carFactory;

import java.util.List;

/**
 * implements car factory methods
 *
 * @author MMM
 */
public class CarFactoryMethods {

    public static void viewOrders(List<Orders> newOrdersList) {
        System.out.println("\n List of pending orders:\n"
                + "----------------------------------------");
        if (newOrdersList.size() > 0) {

            System.out.println("Code\tName\tType\tColor\tStatus");
            for (int i = 0; i < newOrdersList.size(); i++) {
                if (!newOrdersList.get(i).isDelivered()) {
                    System.out.println(newOrdersList.get(i).getOrderCode()
                            + "\t" + newOrdersList.get(i).getCustomerName()
                            + "\t" + newOrdersList.get(i).getCarOrdered()
                            + "\t" + newOrdersList.get(i).getColorCarOrdered() + "\tpending");
                }
            }
            System.out.print("----------------------------------------");
        } else {
            System.out.println("Nothing to display");
        }
        CustomersMehods.zeroToExit();
    }

    public static void proceedOrders(List<Orders> newOrdersList, List<Car2> newManufacturedCarsList) {
        String proceedOrder;
        int checkOrder = 0;

        System.out.println("\nChoose the order you want to proceed:");
        proceedOrder = CustomersMehods.userInput.next();

        for (int i = 0; i < newOrdersList.size(); i++) {
            if ((proceedOrder.equals(newOrdersList.get(i).getOrderCode())) && (!newOrdersList.get(i).isDelivered())) {

                Car2.Color colorOrdered = Car2.colorOrdered(newOrdersList.get(i).getColorCarOrdered());
                if (colorOrdered.toString().equals(Car2.Color.NONE.toString())) {
                    System.out.println("Car Factory don't have this color");
                    checkOrder = 2;
                } else {
                    Car2 newCar = new Car2(newOrdersList.get(i).getCarOrdered(), colorOrdered, (short) 140);

                    newManufacturedCarsList.add(newCar);
                    System.out.println("Car " + newOrdersList.get(i).getCarOrdered() + " delivered!");
                    newOrdersList.get(i).setDelivered(true);
                    checkOrder = 1;
                }

            }

        }
        if (checkOrder == 0) {
            System.out.println("Invalid order");
        }

        CustomersMehods.zeroToExit();
    }

    public static void deliveredCarsList(List<Car2> newManufacturedCarsList) {

        if (newManufacturedCarsList.size() > 0) {

            System.out.println("\n List of delivered cars:\n"
                    + "----------------------------------------");

            System.out.println("No\tType\tColor");
            for (int i = 0; i < newManufacturedCarsList.size(); i++) {
                System.out.println((i + 1) + "\t" + newManufacturedCarsList.get(i).getName() + "\t" + newManufacturedCarsList.get(i).getColor());

            }
            System.out.print("----------------------------------------");
        } else {
            System.out.println("----------------------------------------"
                    + "No deliverd cars to display");
        }
        CustomersMehods.zeroToExit();
    }
}
