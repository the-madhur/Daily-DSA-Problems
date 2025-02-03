import java.util.Scanner;

public class RowWiseSum2Darray 
{
    public static void printRowWise(int arr[][], int rows, int cols)
    {
        for(int i =0;i<rows;i++)
        {
            int sum =0;
            for(int j =0;j<cols;j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.print(sum);
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][3];
        int rows = 3;
        int cols = 3;
    
        for(int i =0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        printRowWise(arr, rows, cols);
        
    }   
}
