// Factorial of a Number

import java.util.Scanner;
public class Factorial 
{
    public static int GetFactorial(int x)
    {
        int mul =1;
        for(int i = x; i>=1; i--)
        {
            mul =mul*i;
        }
        return mul;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter number: ");
            int n = sc.nextInt();

            int factorial =GetFactorial(n);
            System.out.println("Factorial of "+ n + " is: " + factorial);
        }
        
    }
    
}
