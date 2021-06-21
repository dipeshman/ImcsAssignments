package AdvanceLab.Day1.Assignment10.D;

public class Wells
{
    public static void main(String[] args)
    {
        EmployeeGrade ram=new EmployeeGrade();
        EmployeeGrade james=new EmployeeGrade(102,"James",4.2f,4.4f,4.1f);
        System.out.println("Display for Ram");

        ram.calculateAverageFeedback();
        ram.calculateGrade();
        ram.displayInfo();

        System.out.println();

        System.out.println("Display for James");

        james.calculateAverageFeedback();
        james.calculateGrade();
        james.displayInfo();
    }
}