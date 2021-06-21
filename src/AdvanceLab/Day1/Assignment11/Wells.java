package AdvanceLab.Day1.Assignment11;

public class Wells {
    public static void main(String[] args) {

        EmployeeGrade[] employee = new EmployeeGrade[5];
        employee[0] = new EmployeeGrade(102, "James", 3.2f, 2.4f, 3.1f);
        employee[1] = new EmployeeGrade(103, "Ram", 2.2f, 3.4f, 1.1f);
        employee[2] = new EmployeeGrade(104, "Krishna", 3.2f, 4.4f, 3.1f);
        employee[3] = new EmployeeGrade(105, "Govinda", 4.2f, 3.4f, 1.1f);
        employee[4] = new EmployeeGrade(106, "Gopal", 4.2f, 3.4f, 1.1f);

        for (int loop = 0; loop < employee.length; loop++) {

            employee[loop].calculateAverageFeedback();

            System.out.println();
            employee[loop].calculateGrade();

            System.out.println();
            employee[loop].displayInfo();
        }
    }
}