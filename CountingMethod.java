// Print counting from 1 to N

import java.util.Scanner;

public class CountingMethod 
{
    // here n is parameter 
    public static void printCounting(int num)
    {
        for(int i=1;i<=num;i++)
        {
            System.out.print(i+" ");
        }
    }
     public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();

        // here n is argument
        printCounting(n);
    }    
}
