package AdvanceLab.Day1.Assignment6;

public class AccountDetails
{
    String firstName, lastName;
    char middleName;
    String emailId;
    String accountType;
    String dateOfBirth;
    char gender;
    String maritalStatus;

    AccountDetails(String firstName, char middleName, String lastName, String emailId, String accountType, String dateOfBirth, char gender, String maritalStatus)
    {
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.accountType=accountType;
        this.dateOfBirth=dateOfBirth;
        this.gender=gender;
        this.maritalStatus=maritalStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}