package D2Assignment4;

public class Student
{
    private int studentId;
    private char studentType;

    //Setter
    public void setStudentId(int studentId)
    {
        this.studentId=studentId;
    }
    public  void setStudentType(char studentType)
    {
        this.studentType=studentType;
    }

    //Getter
    public int getStudentId()
    {
        return studentId;
    }
    public char getStudentType()
    {
        return studentType;
    }
}