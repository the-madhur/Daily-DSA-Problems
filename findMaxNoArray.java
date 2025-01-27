
public class findMaxNoArray 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,23,38,89,6,8,68,99};
        int size = 8;

        // initialize maxi with minimum possible value of Integer
        int maxi = Integer.MIN_VALUE;

        for(int i =0; i<size;i++)
        {
            if(arr[i] >maxi)
            {
                // if current element is greater than maxi then update maxi
                maxi = arr[i];
            }
        }
        
        System.out.println("Maximum number is: "+maxi);
    }
    
}
