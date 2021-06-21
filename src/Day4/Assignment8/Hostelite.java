package Day4.Assignment8;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    Hostelite() {
        super();
    }

    Hostelite(int studentId, char studentType, String firstName, String lastName, String hostelName, int roomNumber) {
        this.studentId = studentId;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        this.feesPerMonth = feesPerMonth;
        this.studentType = studentType;
        this.studentName = firstName + " " + lastName;

    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Hostel Name: " + hostelName + "\nRoom Number: " + roomNumber +  "\n");
    }

    double calculateFees(double semesterFees)
    {

        //feesPerMonth=feesPerMonth/6;
        feesPerMonth=(semesterFees/6)+1200;
//        System.out.println("Monthly fees for Hostel Student: "+feesPerMonth);
        return feesPerMonth;
    }

}