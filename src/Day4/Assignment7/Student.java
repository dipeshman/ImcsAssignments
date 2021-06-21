package Day4.Assignment7;

public class Student
{
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected final double semesterFees=12000;
    protected double feesPerMonth;

    Student(){}

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void calculateFees() {
        feesPerMonth = semesterFees/6;
        System.out.println("Monthly Fees: "+feesPerMonth);
    }

    public void displayDetail()
    {
        System.out.println("Semester Fees: "+semesterFees);

    }
}
