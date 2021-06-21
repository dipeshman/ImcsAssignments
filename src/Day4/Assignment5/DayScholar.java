package Day4.Assignment5;

public class DayScholar extends PostGradStudent
{
    private String residentialAddress;
    private double fees;

    DayScholar(int postCourseId, String postCourseName, int postCourseFees,int studentId, char studentType, String studentName , String residentialAddress )
    {

        this.postCourseId=postCourseId;
        this. postCourseName=postCourseName;
        this. postCourseFees=postCourseFees;
        this.studentType=studentType;
        this.studentName=studentName;
        this.residentialAddress=residentialAddress;
    }
    public void calculateFees()
    {
        this.fees=postCourseFees/6;
        System.out.println("Monthly Fee: "+fees);

    }
    public double getFees()
    {
        return postCourseFees;
    }
}