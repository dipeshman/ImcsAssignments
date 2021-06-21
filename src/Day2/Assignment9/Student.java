package Day2.Assignment9;

class Student
{
    private static int studentId=550;
    private char studentType;
    private String studentName;

    public Student() {
        studentId++;
    }

    public Student(char studentType, String fName, String lName) {
        this();
        this.studentType = studentType;
        this.studentName = fName+" "+lName;
    }

    public void displayDetails(Student obj)
    {
        System.out.println("Student ID: "+obj.studentId+" Student Type: "+obj.studentType+" Student Full Name: "+obj.studentName);
    }
}