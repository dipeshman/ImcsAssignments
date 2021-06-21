package Day4.Assignment1;

public class Student
{
    private int studentId;
    private char studentType;
    private String studentName;
    private double feesPerMonth;

    Student(){}

    Student(int studentId, char studentType, String firstName, String lastName, double feesPerMonth)
    {
        this.studentId=studentId;
        this.studentType=studentType;
        this.studentName=firstName+lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }
}
