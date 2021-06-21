package D2Assignment5.DefaultConstructor;

import javax.print.DocFlavor;
import java.io.Serializable;

public class Student
{
    private int studentId;
    private char studentType;

        //Creating default constructor
    Student()
    {
        this.studentId = 10;
        this.studentType = 'F';
    }
    Student(int studentID, char studentType)
    {
        this.studentId=studentID;
        this.studentType=studentType;
    }

    Student(int studentID)
    {
        this.studentId = studentID;
    }


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



class CourseManagement
{
    public static void main(String[] args) {
       Student s1 = new Student();
        System.out.println("This is default StudentID: " + s1.getStudentId() +
                    "\n" + "This is default StudentType: "+ s1.getStudentType());

        System.out.println("==============================");

        Student s2= new Student();
        s2.setStudentId(27);
        s2.setStudentType('P');
        System.out.println("This is updated Student ID: "+ s2.getStudentId() +
                     "\n" +"This is updated Student Type: " + s2.getStudentType());
    }
}