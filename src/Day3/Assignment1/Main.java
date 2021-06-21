package Day3.Assignment1;

public class Main {

    public static void main(String[] args)
    {
        //===========================================================================
        //=======Day 3 Assignment 1: Static variable, block and method===============
        Student studentOne=new Student('H',"Bony","Thomas");
        studentOne.displayDetails(studentOne);


        Student studentTwo=new Student('D',"Dinil","Bose");
        studentTwo.displayDetails(studentTwo);

        System.out.println("Total Number of Enrolled Student: "+Student.getStudentCount());

        //===========================================================================
        //===================Day 3 Assignment 2: 2D Arrays===========================






    }



}
