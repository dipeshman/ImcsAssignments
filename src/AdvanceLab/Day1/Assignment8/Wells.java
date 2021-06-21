package AdvanceLab.Day1.Assignment8;

public class Wells
{
    public static void main(String[] args)
    {
        EmployeeGrade elvis=new EmployeeGrade();
        elvis.initializeEmployee(1,"Elvis",2.2f,3.2f,4.2f);



        elvis.calculateAverageFeedback();
        elvis.calculateGrade();
        elvis.displayInfo();

    }
}