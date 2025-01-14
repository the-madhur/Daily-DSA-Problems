import java.util.Scanner;

public class AllPatterns 
{
    public static void Pattern1(int n )
    {
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern2(int n )
    {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*" +" ");   
            }
            System.out.println();
        }
    }
    public static void Pattern3(int n )
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern4(int n )
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern5(int n )
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Pattern6(int n )
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern7(int n )
    {
        for(int i=0;i<n;i++)
        {
            // space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            // space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Pattern8(int n )
    {
        for(int i=0;i<n;i++)
        {
            // space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }
            // space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Pattern9(int n)
    {
        // Actually Pattern 9 is a combination of both pattern 7 and 8 so if you need to print this pattern print both 7 and 8 so it easily prints
    }
    public static void Pattern10(int n)
    {
        for(int i=1;i<=2*n-1;i++)
        {
            int stars = i;
            if(i>n)
            {
                stars = 2*n - i;
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern13(int n)
    {
        int num =1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num +" ");
                num =num+1;
            }
            System.out.println();
        }
    }
    public static void Pattern14(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(char ch ='A';ch <= 'A' + i;ch++)
            {
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern15(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(char ch ='A';ch<='A'+(n-i-1);ch++)
            {
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void Pattern16(int n)
    {
        for(int i=0;i<n;i++)
        {
            char ch = (char) ('A' + i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();
        // Pattern1(n);
        // Pattern2(n);
        // Pattern3(n);
        // Pattern4(n);
        // Pattern5(n);
        // Pattern6(n);
        // Pattern7(n);
        // Pattern8(n);
        // Pattern9(n); // Actually Pattern 9 is a combination of both pattern 7 and 8 so if you need to print this pattern print both 7 and 8 so it easily prints 
        // Pattern10(n);
        // Pattern13(n);
        // Pattern14(n);
        // Pattern15(n);
        Pattern16(n);
    }
    
    
}
