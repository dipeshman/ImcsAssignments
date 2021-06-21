package Day5.Assignment2.registrationpack;

import Day5.Assignment2.courseregistration.Student;

public class DayScholar extends Student
{
    private String residentialAddress;

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }
    public void getDetails()
    {

        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Type: "+studentType);
    }
}
