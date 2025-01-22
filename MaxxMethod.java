// Find Maximum Number 

import java.util.Scanner;

public class MaxxMethod 
{
    public static int findMax(int num1, int num2, int num3)
    {
        if(num1>num2 && num1>num3)
        {
            return num1;
        }
        else if(num2>num1 && num2>num3)
        {
            return num2;
        }
        else
        {
            return num3;
        }
        
    }
    public static void main(String[] args) 
    {        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter value of c: ");
        int c =sc.nextInt();


        int maximumNumber =findMax(a,b,c);
        System.out.println(maximumNumber);
        
    }
    
}
