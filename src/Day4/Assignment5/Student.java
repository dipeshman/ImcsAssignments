package Day4.Assignment5;

public class Student
{
    protected static int studentId;
    protected char studentType;
    protected String studentName;

    Student()
    {
        studentId++;
    }
    Student(int studentId, char studentType, String studentName)
    {
        this.studentId=studentId;
        this.studentType=studentType;
        this.studentName=studentName;
    }
}