package Day4.Assignment1;

public class Hostelite extends Student
{
    private String hostelName;
    private int roomNumber;
    private String studentName;

    Hostelite(){}

    Hostelite(int studentId, char studentType, String firstName, String lastName,String hostelName, int roomNumber, double feesPerMonth)
    {
        this.setStudentId(studentId);
        this.hostelName=hostelName;
        this.roomNumber=roomNumber;
        this.setFeesPerMonth(feesPerMonth);
        this.setStudentType(studentType);
        this.studentName=firstName+" "+lastName;

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
}