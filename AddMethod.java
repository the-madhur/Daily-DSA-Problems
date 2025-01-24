// Write a Method for Adding two numbers  

import java.util.Scanner;

public class AddMethod   // class name should be same as the file name
{
    public static int Add(int a, int b)   // static is used here because it can invoked or called easily without creating an object in main method
    {
        int result = a+b;  // adding two numbers
        return result;
    }
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int sum =Add(a,b); // calling the method Add
        System.out.println("Addition of two no's is: "+sum); // printing the result
    }
    
}
