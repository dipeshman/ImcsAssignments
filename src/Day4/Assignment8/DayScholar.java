package Day4.Assignment8;

public class DayScholar extends Student {
    private String residentialAddress;

    DayScholar() {
        super();
    }

    DayScholar(int studnetId, char studentType, String firstName, String lastName, String residentialAddress) {
        this.studentId = studnetId;
        this.studentType = studentType;
        this.studentName = firstName + " " + lastName;
        this.feesPerMonth = feesPerMonth;
        this.residentialAddress = residentialAddress;
    }

//    public String getResidentialAddress() {
//        return residentialAddress;
//    }

    @Override
    public void displayStudentDetails() {

        super.displayStudentDetails();
        System.out.println("Student Residential Address: " + residentialAddress + "\n");
    }

    double calculateFees(double semesterFees)
    {
        return semesterFees/6;
    }


}