package AdvanceLab.Day3.Assignment26;

public class WellsBank
{
    public static void main(String[] args) throws InsufficientBalanceException {
        //Account account=new Account();

        Customer john =new Customer(101, "John", "Dallas, Texas",1111);
        SavingAccount johnSA=new SavingAccount(101,john,1000);


        System.out.println("**********Saving Account Transaction of John**********");
        System.out.println();


        try
        {
            transaction(johnSA, 50);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }

        //johnSA.withdraw(1600);
        johnSA.balanceEnquiry();


        Customer jenny=new Customer(102, "Jenny", "Dallas, Texas",2222);
        CurrentAccount jennyCA=new CurrentAccount(201,jenny,500,2000);


        System.out.println("**********Current Account Transaction of Jenny**********");
        System.out.println();

        try {
            transaction(jennyCA, 1500);
        }
        catch (InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        //jennyCA.withdraw(1000);
        jennyCA.balanceEnquiry();

//        jennyCA.withdraw(4000);
//        jennyCA.balanceEnquiry();
//
//        jennyCA.withdraw(3000);
//        jennyCA.balanceEnquiry();

    }
    public static void transaction(Account account, double amount) throws InsufficientBalanceException
    {
        account.deposit(amount);
        account.withdraw(10000);
    }
}