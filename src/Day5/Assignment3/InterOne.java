package Day5.Assignment3;

interface InterOne
{
    int varOne=1;
    int varTwo=100;

    void methodOne();
    void methodTwo();
}

class Example implements InterOne
{
    public void methodOne() {
        //varTwo = varTwo + 10; the variable declared in interace InterOne is final so it cannot be changed, so I commented it.
        System.out.println("Value of varTwo: " + varTwo);
        System.out.println("Good Morning");
    }
    public void methodTwo()
    {
        System.out.println("Good Afternoon");
    }
}

class DemoInterface
{
    public static void main(String[] args)
    {
        Example obj=new Example();
        obj.methodOne();
        obj.methodTwo();
    }
}