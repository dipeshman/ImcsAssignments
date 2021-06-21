package Day3.Assignment6;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        int number, iterations;

        Scanner in = new Scanner(System.in);

//        number = Integer.parseInt(args[0]);
//        iterations= Integer.parseInt(args[1]);

        System.out.println("Enter what number of Multiplication table you want to display: ");
        number=in.nextInt();
        System.out.println("Enter the iteration number of this Multiplication table:");
        iterations=in.nextInt();
        System.out.println("The Multiplication table of "+number);

        for(int  i=1;i<=iterations;i++)
        {
            System.out.println(+number+" x "+i +" = "+number * i   );
        }
    }
}