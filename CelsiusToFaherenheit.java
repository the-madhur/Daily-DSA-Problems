// Celsius to Faherenheit

import java.util.Scanner;

public class CelsiusToFaherenheit
{
    public static float GetF(float num) // static is used here because it can invoked or called easily without creating an object in main method
    {
        
        float result =(float) ((num * 1.8) + 32); // formula to convert Celsius to Faherenheit
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature value in Celsius: ");
        float n = sc.nextFloat();

        float Faherenheit = GetF(n); // calling the method GetF
        System.out.println(Faherenheit +"F"); // printing the result
    }
    
}
 