package eu.braincluster;

import java.util.function.IntFunction;

public class Main
{
    private static void DisplayFactorials(String title, IntFunction<Long> factorial)
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
        DisplayFactorials("For loop", Factorial::factorialUsingForLoop);
        DisplayFactorials("While loop", Factorial::factorialUsingWhileLoop);
        DisplayFactorials("Recursion", Factorial::factorialUsingRecursion);
        DisplayFactorials("Tail recursion", Factorial::factorialUsingTailRecursion);
    }
}
