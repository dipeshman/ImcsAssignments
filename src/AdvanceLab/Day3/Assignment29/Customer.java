package AdvanceLab.Day3.Assignment29;

public class Customer
{
    private int customerId;
    private String customerName;
    private String address;
    private int pinCode;

    public Customer(int customerId, String customerName, String address, int pinCode) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.pinCode = pinCode;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
