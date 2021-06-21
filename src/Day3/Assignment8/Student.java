package Day3.Assignment8;


public class Student
{
    private int studentID;
    private String studentName;
    private char studentType;
    String residentialStatus;
    double feesPerMonth;


    public Student() {}
    public Student(int studentID, char studentType, String fName, String lName) {}

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String fName, String lName) {
        this.studentName = studentName=fName+" "+lName;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public void setResidentialStatus(String residentialStatus)
    {
        this.residentialStatus = residentialStatus;
    }

    public void setFees(double feesPerMonth)
    {
        this.feesPerMonth=feesPerMonth;
    }

    public double getFees()
    {
        return feesPerMonth;
    }

    public void calculateFees(double semesterFees)
    {
        feesPerMonth=semesterFees/6.0;
    }

    public void calculateFees(double semesterFees, double hostelFees)
    {
        feesPerMonth=semesterFees/6.0;
        feesPerMonth=feesPerMonth+hostelFees;
    }
}
