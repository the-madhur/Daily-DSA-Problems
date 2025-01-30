import java.util.Scanner;

public class PrimeNumber 
{
    public static String GetPrime(int x)  // static is used here because it can invoked or called easily without creating an object in main method
    {
        if(x<=1)
        {
            return "Not Prime";
        }
        for(int i =2; i<=Math.sqrt(x);i++)   //iterate from 2 to x/2 because any other divisor except from 1 and x found between this iteration
        {
            if(x%i==0)  // If x % i == 0, return "Not Prime" because we found a divisor other than 1 and x.
            {
                return "Not Prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter number: ");
            int n = sc.nextInt();

            String prime =GetPrime(n);
            System.out.println(prime);
        }
        
    }
    
}
