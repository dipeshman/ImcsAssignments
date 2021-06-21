package AdvanceLab.Day1.Assignment6;

import java.lang.reflect.AnnotatedArrayType;

public class Main
{
    public static void main(String[] args)
    {
        AccountDetails Employee1=new AccountDetails("Paul",'J',"Anderson","Paul@Wellsfargo.com","Salary","01/03/1985",'M',"Single");
        AccountDetails Employee2=new AccountDetails("John",' ',"Jacob","John@Wellsfargo.com","Non-Salary","03/06/1985",'M',"Married");

        System.out.println("Employee 1 Details");

        System.out.println("Name: "+Employee1.getFirstName()+" "+Employee1.getMiddleName()+" "+Employee1.getLastName());
        System.out.println("Date of Birth: "+Employee1.getDateOfBirth());
        System.out.println("Email ID: "+Employee1.getEmailId());
        System.out.println("Account Type: "+Employee1.getAccountType());
        System.out.println("Gender: "+Employee1.getGender());
        System.out.println("Marital Status: "+Employee1.getMaritalStatus());

        System.out.println("- - - - - - - - - - - - -");

        System.out.println("Employee 2 Details");

        System.out.println("Full Name: "+Employee2.getFirstName()+" "+Employee2.getMiddleName()+" "+Employee2.getLastName());
        System.out.println("Date of Birth: "+Employee2.getDateOfBirth());
        System.out.println("Email ID: "+Employee2.getEmailId());
        System.out.println("Account Type: "+Employee2.getAccountType());
        System.out.println("Gender: "+Employee2.getGender());
        System.out.println("Marital Status: "+Employee2.getMaritalStatus());
    }
}