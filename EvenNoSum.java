// Method for Even no Sum 
import java.util.Scanner;

public class EvenNoSum 
{
    public static int getEvenSum(int n)
    {
        int sum = 0;
        for(int i =2;i<=n;i=i+2)   // here i start with 2 because 2 is first even no and increment with i = i+2 because in even increment with 2
        {
            sum = sum +i;
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = sc.nextInt();

        int sum = getEvenSum(n);
        System.out.println(sum);
    }
    
}
