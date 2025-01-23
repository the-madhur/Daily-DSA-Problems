// Find Number is Even or Odd

import java.util.Scanner;

public class EvenOdd 
{
    public static String GetEvenOdd(int n)
    {
        if(n==0 || n==1)   // The number 1 is neither even nor odd. It is also not considered a prime number. By definition, a prime number has exactly two distinct positive divisors, but since 1 only has one divisor (itself), it does not meet the criteria for being prime.
        {
            return "Not Defined";
        }
        else if(n%2==0)
        {
            return "Even";
        }
        else{
            return "Odd";
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        
        String EvenOdd = GetEvenOdd(n);
        System.out.println(EvenOdd);
    }
    
}
