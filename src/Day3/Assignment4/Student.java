package Day3.Assignment4;

public class Student
{
    private int studentID;
    private char studentType;
    private String studentName;

    public Student()
    {
        studentID=10;
        studentType='F';
    }
    public Student(int studentID, char studentType, String firstName, String lastName)
    {
        this.studentID=studentID;
        this.studentType=studentType;
        this.studentName=firstName+" "+lastName;
    }

    public void setStudentID(int studentID)
    {
        this.studentID=studentID;
    }

    public void setStudentType(char studentType)
    {
        this.studentType=studentType;
    }

    public void setStudentName(String firstName, String lastName)
    {
        this.studentName=studentName;
        studentName=firstName+" "+lastName;
    }
    public int getStudentId() {
        return studentID;
    }
}