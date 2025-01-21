/** 
Problem statement
Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.

For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.

Example:
Input:  ‘N’ = 3

Output: 
* 
* *
* * *
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= N <= 25
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
* 
* *
* * *
Explanation Of Sample Input 1 :
For N = 3, fill all the rows and columns in the lower triangle of 3x3 matrix with ‘*’.
Sample Input 2 :
1
Sample Output 2 :
* 

**/

import java.util.Scanner;
public class Pattern2 
{
    public static void Pattern(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n = sc.nextInt();
        Pattern(n);
        
    }
    
}
