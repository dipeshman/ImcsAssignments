package AdvanceLab.Day2.Assignment19.customer;

import AdvanceLab.Day2.Assignment17.Customer;

public class SavingAccount extends Account {

    private double minimumBalance=500;
    protected double balance;
    private int interestRate=12;
    private int accountNo;

    public SavingAccount()
    {
        //System.out.println("::SavingAccount Class Default Constructor Call::");

    }
    public SavingAccount(int accountNo, Customer customer, double balance)
    {
        super();
        //System.out.println("::SavingAccount Class Parameterized Constructor Call::");
        this.accountNo=accountNo;
        this.customer=customer;
        this.balance=balance;
    }

    public double balanceEnquiry()
    {
        System.out.println("Current Balance Now: "+balance);
        System.out.println();
        return balance;
    }

    public void withdraw(double amount)
    {
        System.out.println("Withdrawing Now: "+amount);
        if (amount <=minimumBalance && balance>500)
        {
            balance=balance-amount;
            System.out.println("balance is "+balance);
            //System.out.println("Your current balance is now oafter withdraw: "+ balance);
        }
        else
        {
            System.out.println("Withdraw balance exceeded!!! \nYour available balance is: "+balance+
                    "\nBut you must maintain minimum Rs.500 in your Saving Account."+
                    "\nYou can only withdraw: "+(balance-minimumBalance));
            System.out.println();
        }
    }
    public void calculateInterest()
    {
        balance+=balance*(interestRate/100.0);
        System.out.println("The balance including interest: "+ balance);
        System.out.println();
    }
}