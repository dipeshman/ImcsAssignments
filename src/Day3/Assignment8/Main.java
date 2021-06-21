package Day3.Assignment8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(7,'D',"Dipesh","Manandhar");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Residential Status as 1 or 2."+ "\n1: For Day Scholar\n2: For Hostelite Student");
        int residentialStatus=in.nextInt();
        //if (residentialStatus=1)
        student.setResidentialStatus(Integer.toString(residentialStatus));
        if (residentialStatus==1)
        {
            System.out.println("Enter Semester Fees: ");
            double semesterFees=in.nextDouble();
            student.calculateFees(semesterFees);
            System.out.println("The total monthly fee of Day Scholar: "+student.feesPerMonth);
        }
        else
        {
            System.out.println("Enter Semester Fees: ");
            double semesterFees=in.nextDouble();

            System.out.println("Enter hostel Fees: ");
            double hostelFees=in.nextDouble();
            student.calculateFees(semesterFees,hostelFees);
            System.out.println("The total monthly Fee for Hostelite Student: "+student.feesPerMonth);

        }



        

//        student.setStudentID(studentId);
//        student.setStudentName;
//        student.setResidentialStatus(residentialStatus);
//        student.feesPerMonth = fees;
//
//        System.out.println(student.getStudentID());
//        System.out.println(student.getStudentName());
//        System.out.println(student.getResidentialStatus());
//        System.out.println();
//        System.out.println(student.feesPerMonth);
    }
}