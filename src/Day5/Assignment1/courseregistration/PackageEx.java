package Day5.Assignment1.courseregistration;

public class PackageEx
{
    public static void main(String[] args)
    {
        Student student=new Student();
        student.setStudentId(1001);
        student.setStudentName("Thomas");
        student.setStudentType('D');
        student.getDetails();

    }
}
