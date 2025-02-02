public class SortZerosAndOnesArrays 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,1,0,1,0};

        // print array Before Sorting
        System.out.print("Before Sorting: ");
        for(int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }

        int start =0;
        int end = arr.length-1;

        int i =0;
        while(i<end)
        {
            if(arr[i]==0)
            {
                int temp =arr[i];
                arr[i] =arr[start];
                arr[start]= temp;

                start++;
                i++;
            }

            if(arr[i]==1)
            {
                int temp =arr[i];
                arr[i] =arr[end];
                arr[end]= temp;

                end--;
            }
        }

        System.out.println();

        // print array After Sorting
        System.out.print("After Sorting: ");
        for(int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }

        
    }
    
}
