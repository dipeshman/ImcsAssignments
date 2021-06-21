package AdvanceLab.Day1.Assignment9;

public class Wells
{
    public static void main(String[] args)
    {
        EmployeeGrade elvis=new EmployeeGrade();
        elvis.initializeEmployee(1,"Elvis",4.1f,3.9f,4.2f);

        elvis.calculateAverageFeedback();
        elvis.calculateGrade();
        elvis.displayInfo();

        System.out.println();


        EmployeeGrade martha=new EmployeeGrade();
        martha.initializeEmployee(2,"Martha",2.2f,3.2f);

        martha.calculateAverageFeedback();
        martha.calculateGrade();
        martha.displayInfo();



    }
}