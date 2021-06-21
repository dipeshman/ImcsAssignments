package Day4.Assignment4;

public class Student {

    protected int studentId;
    protected char studentType;
    protected double semesterFees;
    protected double feesPerMonth;
    protected String studentName;

    Student(int studentId) {
        this.studentId = studentId;
    }

    Student(int studentId, char studentType, String studName, int semesterFees, double feesPerMonth) {
        this.studentType = studentType;
        this.studentName = studName;
        this.semesterFees = semesterFees;
        this.studentId = studentId;
        this.feesPerMonth=feesPerMonth;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId+"\n" + "Student Name: " + studentName+"\n" + "Student Type: " + studentType+"\n" + "Student Semester Fee: " + semesterFees+"\n" + "Student Monthly Fee: " + feesPerMonth);
    }
}