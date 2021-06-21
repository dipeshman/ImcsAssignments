package AdvanceLab.Day3.Assignment23;

public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
//        String name = null;
//        System.out.println(name.length());
//        name = "John";
//        System.out.println(name.length());

        String name=null;
        int total=100;
        int count=0;
        try
        {
            int average= total/count;
            System.out.println(average);
            System.out.println(name.length());
        }
        catch (ArithmeticException exception)
        {
            System.out.println("Arithmetic Exception: "+ exception.getMessage());
        }
        catch (NullPointerException exception)
        {
            System.out.println("Object is null.");
        }
        System.out.println("Continuing the execution...");
    }
}