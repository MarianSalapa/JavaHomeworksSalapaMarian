/*
 * Orders class
 */
package carFactory;

/** 
 * class implements attributes and behavior of the orders made by customers
 * @author MMM
 */
public class Orders {
    private String orderCode;
    private String customerName;
    private String carOrdered;
    private String colorCarOrdered;
    private static int noOfOrders=0;
    private boolean delivered=false;
    
    public Orders(String customerName, String carOrdered, String colorCarOrdered) {
        this.customerName = customerName;
        this.carOrdered = carOrdered;
        this.colorCarOrdered = colorCarOrdered;
        noOfOrders++;
        this.orderCode="O"+Integer.toString(noOfOrders);
        this.delivered=false;
        
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCarOrdered(String carOrdered) {
        this.carOrdered = carOrdered;
    }

    public void setColorCarOrdered(String colorCarOrdered) {
        this.colorCarOrdered = colorCarOrdered;
    }

    public static void setNoOfOrders(int noOfOrders) {
        Orders.noOfOrders = noOfOrders;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCarOrdered() {
        return carOrdered;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public String getColorCarOrdered() {
        return colorCarOrdered;
    }

    
    
}
