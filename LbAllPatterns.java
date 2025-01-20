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
        // System.out.println("Enter value of n5 for Solid Pyramid");
        // int n6 = sc.nextInt();

        // Full Pyramid 
        // for(int row = 0;row<n6;row++)
        // {
        //     // space
        //     for(int col =0;col<n6-(row + 1);col++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // star 
        //     for(int col =0;col<row+1;col++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // Inverted Full Pyramid 
        // for(int row = 0;row<n6;row++)
        // {
        //     // space
        //     for(int col =0;col<row;col++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // star 
        //     for(int col =0;col<n6-row;col++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // HOLLOW DIAMOND 
        // System.out.println("Enter value of n7 for Hollow  Diamond");
        // int n7 = sc.nextInt();

        // // Hollow Diamond - for this we broke in two parts upper part an down part

        // // upper part
        // for(int row = 0; row<n7; row++)
        // {
        //     // space 
        //     for(int col = 0;col<n7-1-row;col++)
        //     {
        //             System.out.print(" ");
        //     }

        //     // star
        //     for(int col =0;col<2*row+1;col++)
        //     {
        //         // if first character or if last character 
        //         if(col==0)
        //         {
        //             System.out.print("*");
        //         }
        //         else if(col==2*row)
        //         {
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(); 
        // }

        // // down part
        // for(int row = 0;row<n7;row++)
        // {
        //     // space 
        //     for(int col =0;col<row;col++)
        //     {
        //             System.out.print(" ");
        //     }

        //     // star 
        //     for(int col = 0;col<2*n7-(2*row+1);col++)
        //     {
        //         // if first or last character
        //         if(col ==0 || col == 2*n7-2*row-2)
        //         {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Flipped Solid Diamond
        
        // Broke into two parts upper and down 
        // upper part - broke into 3 parts 
        // down part - broke into 3 parts 

        // System.out.println("Enter value of n8 for Flippd Solid Diamond");
        // int n8 = sc.nextInt();

        // // first part 
        // for(int row =0;row<n8;row++)
        // {
        //     // half pyramid
        //     for(int col =0; col<n8-row;col++)
        //     {
        //         System.out.print("*");
        //     }

        //     // space wala full pyramid 
        //     for(int col =0; col<2*row+1;col++)
        //     {
        //         System.out.print(" ");
        //     }

        //     // half pyramid 
        //     for(int col=0;col<n8-row;col++)
        //     {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // // second part 
        // for(int row =0; row<n8; row++)
        // {
        //     // Ist traingle
        //     for(int col=0;col<row+1;col++)
        //     {
        //         System.out.print("*");
        //     }

        //     // space wala full inverted pyramid 
        //     for(int col =0; col<2*n8-2*row - 1; col++)   // 2*n8-(2*row + 1) => 2*n8 - 2*row -1
        //     {
        //         System.out.print(" ");
        //     }

        //     // Last traingle
        //     for(int col=0;col<row+1;col++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Fancy Pattern #2

        // System.out.println("Enter value of n9 for fancy pattern #2");
        // int n9 = sc.nextInt();

        // // 1st part
        // for(int row =0; row<n9; row++)
        // {
        //     for(int col = 0; col<row+1;col++)
        //     {
        //         System.out.print(row+1);
        //         if(col != row)
        //         {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // // 2nd part
        // for(int row =0; row<n9; row++)
        // {
        //     for(int col = 0; col<n9-row;col++)
        //     {
        //         System.out.print(n9-row);
        //         if(col != n9-row-1)
        //         {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // Alphabet Palindrone Pyramid 

        System.out.println("Enetr value of n10");
        int n10 = sc.nextInt();

        for(int row =0; row<n10; row++)
        {
            for(int col =0; col<row+1;col++)
            {
                int ans = col + 1;
                char ch = (char) (ans + 'A' -1);
                System.out.print(ch);
            }

            // reverse counting 
            for(int col =row; col>=1;col--)
            {
                int ans = col;
                char ch = (char) (ans + 'A' -1);
                System.out.print(ch);
            }
            System.out.println();
        }

    }

}
