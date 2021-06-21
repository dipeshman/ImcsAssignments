package AdvanceLab.Day2.Assignment16;

public class SavingAccount extends Account {

    private double minimumBalance=500;
    private double balance;
    private int interestRate=12;
    private int accountNo;

    SavingAccount()
    {
        //System.out.println("::SavingAccount Class Default Constructor Call::");

    }
    SavingAccount(int accountNo, Customer customer, double balance)
    {
        super();
        //System.out.println("::SavingAccount Class Parameterized Constructor Call::");
        this.accountNo=accountNo;
        this.customer=customer;
        this.balance=balance;
    }
    public void withdraw(double amount)
    {
        System.out.println("Withdrawing Now: "+amount);
        if (amount <=minimumBalance)
        {
            balance=balance-amount;
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