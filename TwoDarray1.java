// declaration , initialisation , printing of 2D arrays
// row wise printing
// column wise printing

public class TwoDarray1 
{
    public static void main(String[] args) 
    {
        int arr[][] = {{1,2,3}, 
                       {2,4,5}, 
                       {2,3,3}
                      };

        System.out.println(arr[2][2]);

        // printing row wise
        for(int i = 0;i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("printing Column Wise");
        // printing column wise
        for(int i =0; i<3;i++)
        {
            for(int j =0;j<3;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
