package Day4.Assignment8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student Residential Status as 1 or 2." + "\n1: For Day Scholar\n2: For Hostelite Student");
        int residentialStatus = in.nextInt();
        Integer.toString(residentialStatus);
        if (residentialStatus == 1) {
            student = new DayScholar(7, 'D', "Sandesh", "Pokhrel", "8033 MacArthur Blvd");
            System.out.println("Student Details:");
            student.displayStudentDetails();
            System.out.println("Monthly Fees for Day Scholar: "+student.calculateFees(6000));
        } else {
            student = new Hostelite(9, 'H', "Dipesh", "Manandhar", "IMCS Hostel", 21236);
            System.out.println("Student Details:");
            student.displayStudentDetails();
            System.out.println("Monthly Fees for Hostel Student: "+student.calculateFees(6000));
        }
    }
}