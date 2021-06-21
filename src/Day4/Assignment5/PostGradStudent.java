package Day4.Assignment5;

public class PostGradStudent extends Student
{
    protected int postCourseId;
    protected String postCourseName;
    protected int postCourseFees;

    PostGradStudent()
    {

    }
    PostGradStudent(int postCourseId, String postCourseName, int postCourseFees, int studentId, char studentType, String studentName)
    {
        super(studentId,studentType,studentName);
        this. postCourseId=postCourseId;
        this.postCourseName=postCourseName;
        this.postCourseFees=postCourseFees;
//        this.studentId=studentId;
//        this.studentType=studentType;
//        this.studentName=studentName;
    }

    public int getPostCourseId()
    {
        return postCourseId;
    }

    public String getPostCourseName()
    {
        return postCourseName;
    }

    public int getPostCourseFees() {
        return postCourseFees;
    }
}