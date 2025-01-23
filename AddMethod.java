// Write a Method for Adding two numbers  

import java.util.Scanner;

public class AddMethod 
{
    public static int Add(int a, int b)   // static is used here because it can invoked or called easily without creating an object in main method
    {
        int result = a+b;
        return result;
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int sum =Add(a,b);
        System.out.println("Addition of two no's is: "+sum);
    }
    
}
