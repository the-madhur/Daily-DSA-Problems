// Reverse an Integer

import java.util.Scanner;

public class ReverseInteger 
{
    public static void GetReverse(int num)
{
    while(num>0)
    {
        int lastDigit =num % 10;
        System.out.print(lastDigit);
        num=num/10;
    }

}
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        
        GetReverse(n);
        
    }
}
