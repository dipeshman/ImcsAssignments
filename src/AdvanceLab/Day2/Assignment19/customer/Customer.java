package AdvanceLab.Day2.Assignment19.customer;

public class Customer
{
    private String customerID;
    private String customerName;
    private String address;
    private int pinCode;

    public Customer(){}

    public static void main(String[] args)
    {
        Customer customer=new Customer();
        customer.customerID="1234";
        customer.customerName="Jayant";
        customer.address="PHA0Sawan Apts., Yadavgiri, Mysore";
        customer.pinCode=570020;
        System.out.println("Customer ID: "+customer.customerID);
        System.out.println("Customer Name: "+customer.customerName);
        System.out.println("Customer Address: "+customer.address);
        System.out.println("Customer Pin Code: "+customer.pinCode);
    }
}