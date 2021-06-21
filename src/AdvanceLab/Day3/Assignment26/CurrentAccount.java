package AdvanceLab.Day3.Assignment26;

public class CurrentAccount extends Account {
    private double currentAmount;
    protected int accountNo;
    static double eligibleAvailable=10000;
    //double overdraftBalance=10000;

    CurrentAccount() {
        //System.out.println("::CurrentAccount Class Default Constructor Call::");
    }

    CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super();
        //System.out.println("::CurrentAccount Class Parameterized Constructor Call::");
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance+currentAmount;
        //this.currentAmount = currentAmount;
        //this.currentAmount=currentAmount+balance;
    }
    public double balanceEnquiry()
    {
        System.out.println("Current Balance Now: "+balance);
        System.out.println();
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException
    {

        System.out.println("Withdrawing Now: "+amount);

        if (amount >= this.balance)
        {
            throw new InsufficientBalanceException();
        }
        else
        {
            System.out.println("Your available balance: "+balance);
        }
    }

    public double getEligibilityAmount() {

        eligibleAvailable = eligibleAvailable + balance;

        System.out.println("The available overdraft balance is only : "+eligibleAvailable);
        System.out.println();
        return eligibleAvailable;
    }
}