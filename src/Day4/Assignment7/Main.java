package Day4.Assignment7;

public class Main
{
    public static void main(String[] args)
    {
        DayScholar dayScholar=new DayScholar();
        dayScholar.setStudentId(7);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Dipesh");
        dayScholar.setResidentialAddress("8033 MacArthur Blvd");
        dayScholar.calculateFees();
        dayScholar.displayDaySDetails();
    }
}
