package AdvanceLab.Day3.Assignment25;

public class CheckedExceptionDemo
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.exception.ExceptionDemo");
        }
        catch (ClassNotFoundException exception)
        {
            System.out.println("Exception Type/Reason: "+ exception);
        }
    }
}
