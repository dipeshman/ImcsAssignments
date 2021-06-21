package Day4.Assignment5;

public class Main
{
    public static void main(String[] args) {

        DayScholar dayScholar=new DayScholar('5',"OOP",16000,1001,'D',"Manu","No 32/3 Vijayanagar");
        dayScholar.calculateFees();
        System.out.println("Semester Fees: "+dayScholar.getFees());

    }
}