package AdvanceLab.Day1.Assignment9;

public class EmployeeGrade
{
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    char grade;


    void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback)
    {
        this.employeeNo=employeeNo;
        this.employeeName=employeeName;
        this.customer1Feedback=customer1Feedback;
        this.customer2Feedback=customer2Feedback;
        this.customer3Feedback=customer3Feedback;
    }

    void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback)
    {
        this.employeeNo=employeeNo;
        this.employeeName=employeeName;
        this.customer1Feedback=customer1Feedback;
        this.customer2Feedback=customer2Feedback;
    }

    public void calculateAverageFeedback()
    {
        if (customer3Feedback==0)
        {
            averageFeedback=(customer1Feedback+customer2Feedback)/2;
        }
        else
        {
            averageFeedback=(customer1Feedback+customer2Feedback+customer3Feedback)/3;
        }
    }

    public void calculateGrade()
    {
        if (averageFeedback>4.00 && averageFeedback >=5)
        {
           grade='A';
        }
        else if (averageFeedback>3.00 && averageFeedback>=4)
        {
            grade='B';
        }
        else if (averageFeedback>2.00 && averageFeedback>=3)
        {
            grade='C';
            //System.out.println(grade);
        }
        else if (averageFeedback>1.00 && averageFeedback>=2)
        {
            grade='D';
        }
        else if (averageFeedback>0.00 && averageFeedback>=1)
        {
            grade='E';
        }
    }

    public void displayInfo()
    {
        System.out.println("Employee Name: "+employeeName+"\n"+"Employee Number: "+employeeNo+"\n"+"Average Customer Feedback: "+averageFeedback+"\n"+"Grade: "+grade);
    }
}