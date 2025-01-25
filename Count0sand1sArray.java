// count how many 0's and 1's are there in array
public class Count0sand1sArray 
{
    public static void main(String[] args) 
    {
        int arr[] = {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int size = 16;

        int numZero = 0;
        int numOne = 0;

        for(int i =0;i<size;i++)
        {
            if(arr[i]==0)
            {
                numZero++;
            }
            if(arr[i]==1)
            {
                numOne++;
            }
        }

        System.out.println("Number of 0's: "+numZero);
        System.out.println("Number of 1's: "+numOne);
    }
    
}
