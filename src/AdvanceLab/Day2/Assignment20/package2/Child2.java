package AdvanceLab.Day2.Assignment20.package2;

import AdvanceLab.Day2.Assignment20.package2.Base;

public class Child2 extends Base
{
    public void getValues()
    {
        Base base=new Base(100,200,300,400);
        System.out.println(getVariable1());
        System.out.println(getVariable2());
        System.out.println(this.variable4);
    }


}
