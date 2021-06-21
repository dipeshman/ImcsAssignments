package Day4.Assignment1;

public class Main
{
    public static void main(String[] args)
    {
        Hostelite hostelite=new Hostelite(77,'F',"Dipesh","Manandhar",
                "8033 MacArthur Blvd",3136,6000);

        System.out.println("Student Details:");

        System.out.println("Student ID: " +hostelite.getStudentId());
        System.out.println("Student Type: " +hostelite.getStudentType());
        System.out.println("Student Full Name: " +hostelite.getStudentName());
        System.out.println("Student Hostel Name: " + hostelite.getHostelName());
        System.out.println("Student Hostel Room No: " +hostelite.getRoomNumber());
        System.out.println("Student Fees Per Month: " +hostelite.getFeesPerMonth());


    }
}
