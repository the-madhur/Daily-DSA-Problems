import java.util.Scanner;

public class Pattern5
{
    public static void Pattern(int n )
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);    // Row value print in loop 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        Pattern(n);
    
}
