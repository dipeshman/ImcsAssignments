package AdvanceLab.Day2.Assignment18;

public interface PetAnimal
{
    public static void friendly()
    {
        System.out.println("Plays with human.");
    }
}

class Animal
{
    public static void breath()
    {
        System.out.println("All animal oxygen need oxygen to breath");
    }

}

class Hippo extends Animal{
    public static void wilds()
    {
        System.out.println("Hippo is a wild animal");
    }
 }

 class Dog extends Animal implements PetAnimal
 {
     public static void pet()
     {
         System.out.println("Dog is a pet");
     }
 }

 class Cat extends Animal implements PetAnimal{
     public static void pet()
     {
         System.out.println("Cat is a pet");
     }
 }