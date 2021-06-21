package Day4.Assignment4;

public class DayScholar extends Student {
    private String residentialAddress;

    DayScholar(int studentId){
        super(studentId);
    }

    DayScholar(int studentId, char studentType, String studName, int semFees, String residentialAddress, double feesPerMonth) {
        super(studentId, studentType, studName, semFees, feesPerMonth);
        this.residentialAddress = residentialAddress;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Residential Address: "+residentialAddress);
    }
}