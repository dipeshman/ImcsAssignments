package AdvanceLab.Day2.Assignment19.customer;

import AdvanceLab.Day2.Assignment17.Customer;

public abstract class Account
{
    private int accountNo;
    protected double balance;
    AdvanceLab.Day2.Assignment17.Customer customer;

    public Account()
    {
        //System.out.println("::Account Class Default Constructor Call::");
    }
    public Account(int accountNo, AdvanceLab.Day2.Assignment17.Customer customer, double balance)
    {
        //System.out.println("::Account Class Parameterized Constructor Call::");
        this.accountNo=accountNo;
        this.customer=customer;
        this.balance=balance;
    }

    public abstract void withdraw(double amount);

    public Customer getCustomer() {
        return customer;
    }

    public abstract double balanceEnquiry();


    public void deposit(double amount)
    {
        System.out.println("Depositing Now: "+amount);
        balance+=amount;

        System.out.println("The available balance after this deposit is: "+balance);
        System.out.println();
    }
}
