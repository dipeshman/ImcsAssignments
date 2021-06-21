package Day3.Assignment7;

public class Main {
    public static void main(String[] args) {
        int studentId = Integer.parseInt(args[0]);
        String studentName = args[1];
        String residentialStatus = args[2];
        double fees = Double.parseDouble(args[3]);

        Student student = new Student();
        student.setStudentID(studentId);
        student.setStudentName(studentName);
        student.setResidentialStatus(residentialStatus);
        student.feesPerMonth = fees;

        System.out.println(student.getStudentID());
        System.out.println(student.getStudentName());
        System.out.println(student.getResidentialStatus());
        System.out.println(student.getFees());
        System.out.println(student.feesPerMonth);
    }
}