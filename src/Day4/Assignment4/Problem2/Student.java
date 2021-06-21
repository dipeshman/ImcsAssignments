package Day4.Assignment4.Problem2;

public class Student extends CourseRegistration
{
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double semesterFees;
    private double feesPerMonth;

    Student(int studentId, String cName)
    {
        super(cName);

        //System.out.println("Student default constructor called.");

        this.studentId=studentId;
    }
    Student(int studentId,char studentType, String cName,String studName, double semFees)
    {
        super ();
        //System.out.println("Student second constructor called.");

        this.studentType=studentType;
        this.studentName=studName;
        this.semesterFees=semFees;
    }

    public Student() {

    }

    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Student ID: "+studentId+"\n"+"Student Name: "+studentName+"\n"+"Student Type: "+studentType+"\n"+"Semester Fees: "+semesterFees);

    }

}
