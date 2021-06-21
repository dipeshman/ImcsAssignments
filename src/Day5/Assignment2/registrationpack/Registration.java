package Day5.Assignment2.registrationpack;

import Day5.Assignment2.registrationpack.DayScholar;

public class Registration
{
    public static void main(String[] args)
    {
        DayScholar dayScholar=new DayScholar();
        dayScholar.setStudentId(1001);
        dayScholar.setStudentName("Dinil");
        dayScholar.setStudentType('D');
        dayScholar.getDetails();
    }
}
