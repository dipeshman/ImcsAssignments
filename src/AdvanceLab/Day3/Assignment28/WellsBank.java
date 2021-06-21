package AdvanceLab.Day3.Assignment28;

public class WellsBank
{
    public static void main(String[] args)
    {
        Customer john = new Customer();

        System.out.println("********** Customer Account Info **********");
        john.setCustomerId(101);
        System.out.println("ID: "+john.getCustomerId());

        john.setCustomerName("John");
        System.out.println("Name: "+john.getCustomerName());

        john.setAddress("8033 MacArthur Blvd");
        System.out.println("Address: "+john.getAddress());

        john.setPinCode(1234);
        System.out.println("Pin Code: "+john.getPinCode());
    }
}
