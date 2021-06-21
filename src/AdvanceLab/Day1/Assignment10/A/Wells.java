package AdvanceLab.Day1.Assignment10.A;

public class Wells
{
    public static void main(String[] args)
    {
        EmployeeGrade ram=new EmployeeGrade(101,"Ram", 4.1f,4.0f,4.3f);

        ram.calculateAverageFeedback();
        ram.calculateGrade();
        ram.displayInfo();
    }
}