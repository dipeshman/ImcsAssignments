package D2Assignment4;

public class CourseManagement
{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setStudentId(45);
        s1.setStudentType('A');
        System.out.println("Getter for Student ID: " + s1.getStudentId());
        System.out.println("Getter for Student Type: "+ s1.getStudentType());
    }
}