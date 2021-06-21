package AdvanceLab.Day2.Assignment20.package2;

public class Base
{
    protected int variable1;
    protected int variable2;
    protected int variable3;
    protected int variable4;

    Base(){}
    Base(int variable1, int variable2, int  variable3, int variable4)
    {
        this.variable1=variable1;
        this.variable2=variable2;
        this.variable3=variable3;
        this.variable4=variable4;
    }

    public int getVariable1()
    {
        return variable1;
    }
    public int getVariable2()
    {
        return variable2;
    }
}