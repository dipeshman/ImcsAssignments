package AdvanceLab.Day3.Assignment26;

public class SavingAccount extends Account {

    private double minimumBalance=500;
    protected double balance;
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

    public double balanceEnquiry()
    {
        System.out.println("Current Balance Now: "+balance);
        System.out.println();
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {
        {
            System.out.println("Withdrawing Now: "+amount);
            if (amount >=(balance+minimumBalance))
            {
                throw new InsufficientBalanceException();
            }
            else
            {
                System.out.println("Withdraw balance exceeded!!! \nYour available balance is: "+balance);
                System.out.println();
            }
        }

    }


    public void calculateInterest()
    {
        balance+=balance*(interestRate/100.0);
        System.out.println("The balance including interest: "+ balance);
        System.out.println();
    }
}