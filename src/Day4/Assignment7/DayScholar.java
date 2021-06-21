package Day4.Assignment7;

final class DayScholar extends Student
{
    private String residentialAddress;
    DayScholar(){}

    DayScholar(int studentId, char studentType, String studentName, double semesterFees, String residentialAddress)
    {
        this.studentId=studentId;
        this.studentType=studentType;
        this.studentName=studentName;
        //this.semesterFees=semesterFees;
        this.residentialAddress=residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress)
    {
        this.residentialAddress = residentialAddress;
    }

    public void displayDaySDetails()
    {
        super.displayDetail();
        System.out.println("Student ID: "+studentId+"\n"+"Student Name: "+studentName+"\n"+"Student Type: "+studentType+"\n"+"Residential Address: "+residentialAddress);
    }
}