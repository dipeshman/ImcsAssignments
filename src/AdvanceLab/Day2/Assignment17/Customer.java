package AdvanceLab.Day2.Assignment17;

public class Customer
{
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int pinCode;

    Customer()
    {
        //System.out.println("::Customer Class Default Constructor Call::");
    }

    Customer(int customerId, String customerName, String customerAddress, int pinCode)
    {
        //System.out.println("::Customer Class Parameterized Constructor Call::");
        this.customerId=customerId;
        this.customerName=customerName;
        this.customerAddress=customerAddress;
        this.pinCode=pinCode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
