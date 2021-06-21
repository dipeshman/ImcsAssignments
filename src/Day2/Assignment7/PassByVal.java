package Day2.Assignment7;

public class PassByVal
{
    public static void main(String[] args) {
        int sID=25;
        PassByVal val= new PassByVal();
        System.out.println(sID);
        val.passTheValueMethod(sID);
        System.out.println("The sID are " + sID);
    }


    public void passTheValueMethod(int sID)
    {
        sID=10;
        System.out.println("The sID are " + sID);
    }
}
/*
Since StudentId has a java primitive type variable to the method so the copy of the variable is stored
in the memory due to which the changes doesn't affect the other variable.
*/