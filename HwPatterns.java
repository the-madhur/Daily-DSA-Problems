import java.util.Scanner;

public class HwPatterns
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        
        // 1. Solid square pattern

        // for(int row =0; row<n;row++)
        // {
        //     for(int col =0; col<n; col++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 2. Hollow square pattern

        // for(int row = 0; row<n; row++)
        // {
        //     if(row ==0 || row ==n-1)
        //     {
        //         for(int col =0;col<n;col++)
        //         {
        //             System.out.print("* ");
        //         }
        //     }
        //     else{
        //         // remaining rows (middle)
                
        //         System.out.print("* ");      // middle row 1st star

        //         for(int i =0;i<n-2;i++)  // n-2 here because if last star of row 1 is placed to n-1 so previous one of n-1 is n-2 <-(n-1 -1) 
        //         {
        //             System.out.print("  ");
        //         }

        //         System.out.print("* ");      // middle row last star
        //     }

        //     System.out.println();
        // }

        // 3. Hollow Inverted half Pyramid 

        // for(int row = 0; row<n; row++)
        // {
        //     if(row ==0 || row ==n-1)
        //         {
        //             for(int col =0;col<n-row;col++)
        //             {
        //                 System.out.print("* ");
        //             }
        //         }
        //         else{
        //             // remaining rows (middle)
                    
        //             System.out.print("* ");      // middle row 1st star
    
        //             for(int i =0;i<n-row-2;i++)  // n-row-2 here because if last star of row 1 is placed to n-row so previous one of n-row is n-row-1 <-((n-row) -1) 
        //             {
        //                 System.out.print("  ");
        //             }
    
        //             System.out.print("* ");      // middle row last star
        //         }
    
        //         System.out.println();
        // }

        // 4. Hollow Full Pyramid

        // for(int row = 0; row <n; row++)
        // {
        //     // space 
        //     for(int col =0; col<n-row-1;col++)
        //     {
        //         System.out.print(" ");
        //     }
            
        //     if(row ==0 || row == n-1)
        //     {
        //         for(int col =0; col<row+1;col++)
        //         {
        //             System.out.print("* ");
        //         }
        //     }
        //     else 
        //     {
        //         // middle rows Ist star 
        //         System.out.print("*");

        //         // middle rows inside space between Ist star and last star
        //         for(int i =0; i<2*row-1; i++)   // fromula for midddle space between stars (2*row-1)
        //         {
        //             System.out.print(" ");
        //         }

        //         // middle rows last star 
        //         System.out.print("*");
            
        //     }
        //     System.out.println();
        // }

        // 5. Hollow half Pyramid 

        // for(int row =0; row <n; row++)
        // {
        //     if (row ==0 || row ==n-1)
        //     {
        //         for(int col =0; col<row+1;col++)
        //         {
        //             System.out.print("* ");
        //         }
        //     }
        //     else 
        //     {
        //         // middle row 1st star
        //         System.out.print("* ");

        //         // middle row hollow part spaces 
        //         for(int i =0; i<row-1; i++)
        //         {
        //             System.out.print("  ");
        //         }

        //         // middle row last star
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 5. Numeric Hollow Half Pyramid

        // for(int row =0; row <n; row++)
        // {
        //     if (row ==0 || row ==n-1)
        //     {
        //         for(int col =0; col<row+1;col++)
        //         {
        //             System.out.print(col+1 +" ");
        //         }
        //     }
        //     else 
        //     {
        //         // middle row 1st star
        //         System.out.print("1" +" ");

        //         // middle row hollow part spaces 
        //         for(int i =0; i<row-1; i++)
        //         {
        //             System.out.print("  ");
        //         }

        //         // middle row last star
        //         System.out.print(row +1 + " ");
        //     }
        //     System.out.println();
        // }

        // 6. Numeric Hollow Inverted Half Pyramid 

        // 7. Numeric Palindrone Equilateral Pyramid

        // for(int row = 0; row<n; row++)
        // {
        //     // spaces 
        //     for(int col =0; col<n-row-1; col++)
        //     {
        //         System.out.print("  ");
        //     }

        //     for(int col =0; col<row+1; col++)
        //     {
        //         System.out.print(col+1 +" ");
        //     }

        //     // reverse counting printing when = 1
        //     for(int col= row; col>=1; col--)
        //     {
        //         System.out.print(col +" ");    
        //     }

        //     System.out.println();
        // }

        // 8. fancy Pattern #1

        for(int row =0; row<n; row++)
        {
            // stars 
            for(int col =0; col<n+3-row; col++)
            {
                System.out.print("*");
            }

            // numeric
            for(int col =0; col<row+1;col++)
            {
                System.out.print(row+1);
                if(col!=row)
                {
                    System.out.print("*");
                }
            }

            // stars 
            for(int col =0; col<n+3-row; col++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
