package AdvanceLab.Day2.Assignment17;

public class WellsBank
{
    public static void main(String[] args)
    {
        //Account account=new Account();

        Customer john =new Customer(101, "John", "Dallas, Texas",1111);
        SavingAccount johnSA=new SavingAccount(101,john,1000);


        System.out.println("**********Saving Account Transaction of John**********");
        System.out.println();
        transaction(johnSA, 2000);

        //johnSA.withdraw(1600);
        johnSA.balanceEnquiry();


        Customer jenny=new Customer(102, "Jenny", "Dallas, Texas",2222);
        CurrentAccount jennyCA=new CurrentAccount(201,jenny,500,2000);


        System.out.println("**********Current Account Transaction of Jenny**********");
        System.out.println();
        transaction(jennyCA,1500);
        //jennyCA.withdraw(1000);
        jennyCA.balanceEnquiry();

//        jennyCA.withdraw(4000);
//        jennyCA.balanceEnquiry();
//
//        jennyCA.withdraw(3000);
//        jennyCA.balanceEnquiry();

    }
    public static void transaction(Account account, double amount)
    {
        account.deposit(amount);
        account.withdraw(600);
    }
}