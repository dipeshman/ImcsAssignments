package DefaultAndParameterizedConstructors;

public class UserType
{
    String name;

    UserType(String parameterVal)
    {
        name=parameterVal;
    }
    UserType()
    {
        this("student");
    }

    public static void main(String[] args)
    {
        UserType usertype1 = new UserType ("Faculty");
        UserType usertype2 = new UserType();

        System.out.println("It is parameterized constructor: " + usertype1.name);
        System.out.println("It is default constructor: " + usertype2.name);
    }
}