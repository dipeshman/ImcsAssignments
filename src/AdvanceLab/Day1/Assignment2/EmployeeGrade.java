package AdvanceLab.Day1.Assignment2;

public class EmployeeGrade
{
    public static void main(String[] args)
    {
        int employeeId[]={1001,1002,1003,1004,1005};
        float customer1Feedback[]={4.1f,3.8f,4.5f,4.9f,3.9f};


        float sum = 0;


        for(int i=0;i<employeeId.length;i++)
        {
            for (int j=0;j< customer1Feedback.length;j++) {
                System.out.print(employeeId[i]+" "+ customer1Feedback[j]);
            }
            //System.out.println();
        }


//        for(int i=0;i<customer1Feedback.length;i++)
//        {
//            sum+=customer1Feedback[i];
//        }
//        System.out.println("The average feedback of all the employee: "+sum/5);
//
    }
}
