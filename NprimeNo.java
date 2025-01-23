// Print upto N Prime Numbers

import java.util.Scanner;

public class NprimeNo 
{
    public static void GetPrime(int n)
    {
        if (n <= 1) 
        {
            System.out.println("No prime numbers less than or equal to " + n);
        } 
        else 
        {
            System.out.println("Prime numbers are: ");
            for (int i = 2; i <= n; i++) 
            {
                if (isPrime(i)) 
                {
                    System.out.print(i + " "); // Print the prime number
                }
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int x)   // here this x represents i that we can initialize in isPrime(i)
    {
        for (int i = 2; i <= x / 2; i++) 
        {
            if (x % i == 0) 
            {
                return false; // If divisible, it's not prime
            }
        }
        return true; // Prime if no divisors found
    }

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (n): ");
        int n = sc.nextInt(); // Input the value of n

        GetPrime(n);
    }

    
}