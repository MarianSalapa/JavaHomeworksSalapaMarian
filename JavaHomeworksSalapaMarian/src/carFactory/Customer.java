/*
 * Customer class
 */
package carFactory;

/**
 * class implements attributes and behavior of a customer
 * @author MMM
 */
public class Customer {
    private String customerCode;
    private String cusotmerName;
    private int bankBalanceC;
    private static int noOfCustomers=0;
    
    public static void setNoOfCustomers(int noOfCustomers) {
        Customer.noOfCustomers = noOfCustomers;
    }
    
    
    public Customer( String cusotmerName, int bankBalanceC) {
        this.cusotmerName = cusotmerName;
        this.bankBalanceC = bankBalanceC;
        noOfCustomers++;
        this.customerCode="C"+Integer.toString(noOfCustomers);
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public int getBankBalanceC() {
        return bankBalanceC;
    }

    public String getCusotmerName() {
        return cusotmerName;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCusotmerName(String cusotmerName) {
        this.cusotmerName = cusotmerName;
    }

    public void setBankBalanceC(int bankBalanceC) {
        this.bankBalanceC = bankBalanceC;
    }
    
}
