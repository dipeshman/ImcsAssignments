package AdvanceLab.Day2.Assignment8.C;

public class TestLoan
{
    public static void main(String[] args)
    {
        System.out.println(Loan.getLoanInstance());
        //Loan loan = new Loan();
        //Loan loan2 = new Loan(1007,7,1,5000.2f,3);
        System.out.println("Total number of objects :"+Loan.getLoanInstance());
    }
}
