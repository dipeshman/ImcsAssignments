package Day4.Assignment4.Problem2;

public class CourseRegistration
{
    static protected int regId;
    protected String courseName;

    CourseRegistration()
    {
     //   System.out.println("Course default constructor called.");
        regId++;
    }

    CourseRegistration(String cName)
    {
        this();

       // System.out.println("Course second constructor called.");

        this.courseName=cName;
    }
    public void displayDetails()
    {
        System.out.println("Registration ID: "+regId);
        System.out.println("CourseName: "+courseName);
    }
}