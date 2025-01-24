// Celsius to Faherenheit

import java.util.Scanner;

public class CelsiusToFaherenheit
{
    public static float GetF(float num)
    {
        
        float result =(float) ((num * 1.8) + 32);
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature value in Celsius: ");
        float n = sc.nextFloat();

        float Faherenheit = GetF(n);
        System.out.println(Faherenheit +"F");
    }
    
}
 