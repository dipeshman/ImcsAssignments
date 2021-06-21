package Day3.Assignment5;

import java.util.Scanner;

public class StringMethods
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Username: ");

        String username =in.nextLine();

        System.out.println("The length of the entered username: "+username.length());
        System.out.println("Hi "+username);
        System.out.println("Converting the entered username into upper case:"+ username.toUpperCase());
        System.out.println("Similarly, converting the entered username into lower case: "+username.toLowerCase());
        System.out.println("Checking USERNAME key phrase starts with alphabet 'a' or not: "+username.startsWith("a"));
        System.out.println("Now replacing the entered USERNAME to 'KRISHNA': "+username.replace(username,"KRISHNA"));
    }
}