package AdvanceLab.Day2.Assingment14;

public class WellsBank
{
    public static void main(String[] args)
    {
        Customer john =new Customer(101, "John", "Dallas, Texas",1111);
        SavingAccount johnSA=new SavingAccount(101,john,1000);

        System.out.println("**********Account Transaction of John**********");
        johnSA.deposit(1000);
        johnSA.balanceEnquiry();

        johnSA.withdraw(1600);
        System.out.println();

        System.out.println();



        Customer jenny=new Customer(102, "Jenny", "Dallas, Texas",2222);
        CurrentAccount jennyCA=new CurrentAccount(201,jenny,500,2000);

        System.out.println("**********Account Transaction of Jenny**********");

        jennyCA.deposit(1500);
        jennyCA.balanceEnquiry();

        jennyCA.withdraw(1000);
        jennyCA.balanceEnquiry();

        jennyCA.withdraw(4000);
        jennyCA.balanceEnquiry();

        jennyCA.withdraw(3000);
        jennyCA.balanceEnquiry();
    }
}