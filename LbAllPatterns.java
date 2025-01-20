import java.util.Scanner;

public class LbAllPatterns 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // // Rectangle Pattern

        // System.out.println("RECTANGLE PATTERN ");
        // for (int row = 0; row < 3; row++) {
        //     for (int col = 0; col < 5; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Square Pattern 

        // System.out.println("SQUARE PATTERN ");
        // for (int row = 0; row < 4; row++) {
        //     for (int col = 0; col < 4; col++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Hollow Rectangle 

        // System.out.println("HOLLOW RECTANGLE");
        // for(int row = 0; row<3; row++)
        // {
        //     if(row ==0 || row ==2)
        //     {
        //         for(int col =0;col<5;col++)
        //         {
        //             System.out.print("* ");
        //         }
        //     }
        //     else{
        //         // remaining rows (miidle)
                
        //         System.out.print("* ");      // middle row 1st star

        //         for(int i =0;i<3;i++)
        //         {
        //             System.out.print("  ");
        //         }

        //         System.out.print("* ");      // middle row last star
        //     }

        //     System.out.println();
        // }


        // // Hollow Rectangle  with user inputs rows and columns values

        // System.out.println("HOLLOW RECTANGLE with user inputs rows and columns values");
        
        // System.out.println("Enter value of row count");
        // int rowcount = sc.nextInt();

        // System.out.println("Enter value of col count");
        // int colcount = sc.nextInt();

        // for(int row = 0; row<rowcount; row++)
        // {
        //     if(row ==0 || row ==rowcount-1)
        //     {
        //         for(int col =0;col<colcount;col++)
        //         {
        //             System.out.print("* ");
        //         }
        //     }
        //     else{
        //         // remaining rows (miidle)
                
        //         System.out.print("* ");      // middle row 1st star

        //         for(int i =0;i<colcount-2;i++)
        //         {
        //             System.out.print("  ");
        //         }

        //         System.out.print("* ");      // middle row last star
        //     }

        //     System.out.println();
        // }

        // // Half Pyramid

        // System.out.println("Half Pyramid");
        // System.out.println("Enter value of n for Half Pyramid");
        // int n = sc.nextInt();
        // for(int row = 0; row<n; row++)
        // {
        //     for(int col =0; col<row+1; col++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

         // Inverted Half Pyramid

        //  System.out.println("Half Pyramid");
        //  System.out.println("Enter value of n1 for Inverted Half Pyramid");
        //  int n1 = sc.nextInt();
        //  for(int row = 0; row<n1; row++)
        //  {
        //      for(int col =0; col<n1-row; col++)
        //      {
        //          System.out.print("* ");
        //      }
        //      System.out.println();
        //  }
        //  System.out.println("Half Pyramid");
        // //  System.out.println("Enter value of n1 for Inverted Half Pyramid");
        // //  int n1 = sc.nextInt();
        //  for(int row = 0; row<5; row++)
        //  {
        //      for(int col =0; col<5-row; col++)
        //      {
        //          System.out.print("* ");
        //      }
        //      System.out.println();
        //  }

        // Numeric Half Pyramid
        
        // System.out.println("Numeric Half Pyramid");
        // System.out.println("Enter value of n2 for Numeric half Pyramid");
        // int n2 = sc.nextInt();
        // for(int row = 0; row<n2; row++)
        // {
        //     for(int col =0;col<row +1;col++)
        //     {
        //         System.out.print(col + 1);
        //     }
        //     System.out.println();
        // }

        // // Numeric Inverted Half Pyramid
        
        // System.out.println("Numeric Half Pyramid");
        // System.out.println("Enter value of n3 for Inverted Numeric half Pyramid");
        // int n3 = sc.nextInt();
        // for(int row = 0; row<n2; row++)
        // {
        //     for(int col =0;col<n3-row;col++)
        //     {
        //         System.out.print(col + 1);
        //     }
        //     System.out.println();
        // }

        // FULL PYRAMID 
        // System.out.println("Enter value of n4 for Full Pyramid");
        // int n4 = sc.nextInt();
        // for (int row = 0;row<n4;row++)
        // {
        //     // space 
        //     for(int col = 0; col<n4-(row+1);col++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // star 
        //     for(int col = 0; col<row+1;col++)
        //     {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        // INVERTED FULL PYRAMID
        // System.out.println("Enter value of n5 for Inverted Full Pyramid");
        // int n5 = sc.nextInt();
        // for (int row = 0;row<n5;row++)
        // {
        //     // space 
        //     for(int col = 0; col<row;col++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // star 
        //     for(int col = 0; col<n5-row;col++)
        //     {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }
        
        // Solid Pyramid   - Full Pyramid + Inverted Full Pyramid
        System.out.println("Enter value of n5 for Solid Pyramid");
        int n6 = sc.nextInt();

        // Full Pyramid 
        for(int row = 0;row<n6;row++)
        {
            // space
            for(int col =0;col<n6-(row + 1);col++)
            {
                System.out.print(" ");
            }

            // star 
            for(int col =0;col<row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Inverted Full Pyramid 
        for(int row = 0;row<n6;row++)
        {
            // space
            for(int col =0;col<row;col++)
            {
                System.out.print(" ");
            }

            // star 
            for(int col =0;col<n6-row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
