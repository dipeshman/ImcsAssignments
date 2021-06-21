package Day4.Assignment8;

public abstract class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected double feesPerMonth;

    Student() {
    }

    Student(int studentId, char studentType, String firstName, String lastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = firstName + lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    abstract double calculateFees(double semesterFees);

    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentId + "\nStudent Name: " + studentName + "\nStudent Type: " + studentType );
    }

}