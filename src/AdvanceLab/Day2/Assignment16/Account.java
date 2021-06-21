package AdvanceLab.Day2.Assignment16;

public abstract class Account
{
    private int accountNo;
    protected double balance;
    Customer customer;

    Account()
    {
        //System.out.println("::Account Class Default Constructor Call::");
    }
    Account(int accountNo, Customer customer, double balance)
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
    public double balanceEnquiry()
    {
        System.out.println("Current Balance Now: "+balance);
        System.out.println();
        return balance;
    }

    public void deposit(double amount)
    {
        System.out.println("Depositing Now: "+amount);
        balance+=amount;

        System.out.println("The available balance after this deposit is: "+balance);
        System.out.println();
    }
}
