package Day3.Assignment1;

class Student
{
    private static int studentId=550;
    private char studentType;
    private String studentName;
    private static int studentCount=0;

    static
    {
        studentCount = 10;
    }

    public Student() {

         studentCount++;
         studentId = studentId+studentCount-(studentCount-1);

    }

    public Student(char studentType, String fName, String lName) {
        this();
        this.studentType = studentType;
        this.studentName = fName+" "+lName;
    }



    public static int getStudentCount(){
        return studentCount;
    }

    public void displayDetails(Student obj)
    {
        System.out.println("Student ID: "+obj.studentId+" Student Type: "+obj.studentType+" Student Full Name: "+obj.studentName);
        System.out.println();
    }
}