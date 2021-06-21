package AdvanceLab.Day2.Assignment13;

public class Customer
{
    int accountNumber;
    String customerName;
    String customerAddress;
    String ssn;
    int passcode;


       //This class to hold customer information and details
}

class Account
{


    char accountType;
    double availableBalance;
    float interestRate;
    double minimumBalance;

    //This account type can be classified into two different class (Saving Account & Overdraft Account)
    //These account types can inhert the parent class.

    public void balanceInquiry()
    {
        //Method to display balance
    }

    public void withdrawBalance()
    {
        //Method to withdraw Balance from the account
    }
    public void balanceDeposit()
    {
        //Method to Deposit balance in the account
    }
}

class SavingAccount extends Account{}

class OverdraftAccount extends Account{}