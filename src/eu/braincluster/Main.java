package eu.braincluster;

import java.util.function.IntFunction;

public class Main
{
    private static void displayFactorials(String title, IntFunction<Long> factorial)
    {
        System.out.println(title + ":");

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i + "! = " + factorial.apply(i));
        }

        System.out.println();
    }

    public static void main(String[] args)
    {
        displayFactorials("For loop", Factorial::factorialUsingForLoop);
        displayFactorials("While loop", Factorial::factorialUsingWhileLoop);
        displayFactorials("Recursion", Factorial::factorialUsingRecursion);
        displayFactorials("Tail recursion", Factorial::factorialUsingTailRecursion);
    }
}
