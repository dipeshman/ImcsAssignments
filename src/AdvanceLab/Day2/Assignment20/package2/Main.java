package AdvanceLab.Day2.Assignment20.package2;

public class Main
{
    public static void main(String[] args) {
        Base base = new Base(1,2,3,4);
        System.out.println( base.getVariable1());
        base.getVariable1();
        base.getVariable2();
        System.out.println(base.variable1);
        System.out.println(base.variable2);
        System.out.println(base.variable3);
        System.out.println(base.variable4);

        System.out.println();

        Child1 child1=new Child1();
        child1.getValues();

        System.out.println();

        Child2 child2=new Child2();
        System.out.println(child2.variable1);
        System.out.println(child2.variable2);
        System.out.println(child2.variable3);
        System.out.println(child2.variable4);
    }
}
