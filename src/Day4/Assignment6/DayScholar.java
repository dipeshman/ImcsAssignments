package Day4.Assignment6;

public class DayScholar extends Student
{
    private String residentialAddress;
    //private double fees;

    public void setResAddress(String resAddress)
    {

        this.residentialAddress=resAddress;
    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("Student Name: "+studentName);
        System.out.println("Residential Address: "+residentialAddress);
    }
}