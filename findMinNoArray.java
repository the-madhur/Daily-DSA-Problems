public class findMinNoArray
{
    public static void main(String[] args) 
    {
        int mini =Integer.MAX_VALUE;
        int arr[] ={34,21,23,11,22,13,10,23};
        int size = 8;

        for(int i =0; i<size;i++)
        {
            if(arr[i]<mini)
            {
                mini = arr[i];
            }
        }

        System.out.println("Minimum value in the array is: "+mini);
        
    }
    
}
