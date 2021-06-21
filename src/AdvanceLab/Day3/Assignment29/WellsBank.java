package AdvanceLab.Day3.Assignment29;

public class WellsBank
{
    public static void main(String[] args)
    {
        Customer john = new Customer(101,"John","8033 N MacArthur Blvd",1234);

        System.out.println("********** Customer Account Info **********");
        //john.setCustomerId(101);
        System.out.println("ID: "+john.getCustomerId());

        //john.setCustomerName("John");
        System.out.println("Name: "+john.getCustomerName());

        //john.setAddress("8033 MacArthur Blvd");
        System.out.println("Address: "+john.getAddress());

        //john.setPinCode(1234);
        System.out.println("Pin Code: "+john.getPinCode());
    }
}
