// Print counting from 1 to N 

import java.util.Scanner;

public class CountingMethod 
{
    // here n is parameter 
    public static void printCounting(int num)  // static is used here because it can invoked or called easily without creating an object in main method
    {
        for(int i=1;i<=num;i++) // loop to print counting from 1 to n
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
