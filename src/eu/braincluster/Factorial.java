package eu.braincluster;

public class Factorial
{
    /**
     * Calculate the factorial of a given number using for loop
     *
     * @param n
     * @return The factorial of n
     */
    public static long factorialUsingForLoop(int n)
    {
        long fact = 1;

        for (int i = 2; i <= n; i++)
        {
            fact *= i;
        }

        return fact;
    }

    /**
     * Calculate the factorial of a given number using while loop
     *
     * @param n
     * @return The factorial of n
     */
    public static long factorialUsingWhileLoop(int n)
    {
        long fact = 1;

        while (n > 1)
        {
            fact *= n--;
        }

        return fact;
    }

    /**
     * Calculate the factorial of a given number using recursion
     *
     * @param n
     * @return The factorial of n
     */
    public static long factorialUsingRecursion(int n)
    {
        if (n == 0)
        {
            return 1;
        }

        return n * factorialUsingRecursion(n - 1);
    }

    /**
     * Calculate the factorial of a given number using tail recursion
     *
     * @param n
     * @param acc
     * @return The factorial of n
     */
    private static long factorialUsingTailRecursion(int n, int acc)
    {
        if (n == 0)
        {
            return acc;
        }

        return factorialUsingTailRecursion(n - 1, n * acc);
    }

    /**
     * Calculate the factorial of a given number with tail recursion
     *
     * @param n
     * @return The factorial of n
     */
    public static long factorialUsingTailRecursion(int n)
    {
        return factorialUsingTailRecursion(n, 1);
    }
}
