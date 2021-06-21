package AdvanceLab.Day2.Assignment17;

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

    public void withdraw(double amount) {

        System.out.println("Withdrawing Now: "+amount);

        if (amount <= this.balance) {
            this.balance= this.balance - amount;

            System.out.println("The available balance after withdrawing "+amount+" is only "+balance);
            System.out.println();

        } else if (amount > this.balance) {
            balance=eligibleAvailable+ balance;
            balance=balance-amount;
            //this.balance= balance - amount;
            //eligibleAvailable= overdraftBalance;

            System.out.println("Overdraft Info: Account Balance Overdrawn by: " + (balance-10000) + ". \n" +
                    "Now available withdrawable overdraft balance is only: " + balance);
            System.out.println();
        } else if (amount > this.balance + 10000) {
            System.out.println("Overdraft Info: Overdraft Limit Exceeded!!! \n" +
                    "The available balance is only: " + this.balance + "\n" +

                    "\nYou can withdraw maximum of: " +  (eligibleAvailable+ this.balance)+" with overdraft amount of: "+eligibleAvailable);
            System.out.println();
        }
    }

    public double getEligibilityAmount() {

        eligibleAvailable = eligibleAvailable + balance;

        System.out.println("The available overdraft balance is only : "+eligibleAvailable);
        System.out.println();
        return eligibleAvailable;
    }
}