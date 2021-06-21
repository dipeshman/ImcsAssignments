package Day4.Assignment4.Problem2;

public class DayScholar extends Student
{
    private String residentialAddress;

    DayScholar()
    {

        super();

       // System.out.println("DaySholar default constructor called.");

    }

    DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress, String cName)
    {
        this();

        this.studentId=studentId;
        this.studentType=studentType;
        this.studentName=studName;
        this.semesterFees=semFees;
        this.residentialAddress=residentialAddress;
        this.courseName=cName;
    }
    public void displayDetails()
    {
        super.displayDetails();
    }
}