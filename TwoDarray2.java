import java.util.Scanner;

public class TwoDarray2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3];
        int rows = 3;
        int cols =3;

        // System.out.println("Taek input Rows wise");
        // System.out.println("Enter the elements of array");
        // for(int i =0; i<rows;i++)
        // {
        //     for(int j =0;j<cols;j++)
        //     {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        
        // // print row wise array
        // for(int i =0;i<rows;i++)
        // {
        //     for(int j =0;j<cols;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        System.out.println("Take input Column wise");
        // here we take input as column wise so we only modify this input taking loop only and print normal 
        System.out.println("Enter the elements of array");
        for(int i =0; i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                arr[j][i] = sc.nextInt();
            }
        }
        
        // print Column wise array    
        for(int i =0;i<rows;i++)
        {
            for(int j =0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
