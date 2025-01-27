/* 
Swap two values using 3 methods
1. Using + - operator
2. Using third variable
3. Using XOR operator
*/

import java.util.Scanner;

public class SwapValuesMethods 
{
    public static void main(String[] args) 
    {
        // Method 1 using + - operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b  = sc.nextInt();
        System.out.println("Before Swapping: "+a+" "+b);
        
        UsingPlusMinus(a,b); // Method 1 using + -

        UsingTemp(a,b);  // Method 2 using third(temp) variable

        UsingXOR(a,b);  // Method 3 using XOR
        
    }

    // Method 1 using + - operator   if Interviewer asks no third var use so this approach
    public static void UsingPlusMinus(int a, int b) 
    {
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping using + - : "+a+" "+b);
    }
    
    // Method 2 using temp(third) variable
    public static void UsingTemp(int a, int b) 
    {
        int temp =a;
        a=b;
        b = temp;
        System.out.println("After Swapping using third variable(temp): "+a+" "+b);
    }

    // Method 3 using XOR
    public static void UsingXOR(int a, int b) 
    {
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After Swapping using XOR: "+a+" "+b);
    }
}
