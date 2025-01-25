import java.util.Scanner;
public class LinearSearchArray 
{

    public static Boolean isFind(int arr[], int size, int key)
    {
        for(int i =0;i<size;i++)
        {
            if(arr[i]==key)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size of the array: ");
        //int n = sc.nextInt();

        // System.out.println("Enter the elements of the arary:");
        // int arr[] = new int[5];

        // for(int i =0;i<5;i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        // // printing the array
        // System.out.println("The array is: ");
        // for(int i =0; i<5;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // // Linear Search
        // System.out.println("Enter the element to be searched: ");
        // int value = sc.nextInt();
        // for(int i =0; i<5;i++)
        // {
        //     if(arr[i] == value)
        // {
        //     System.out.println("Element: "+ arr[i] +" found at index: "+i);
        // }

        // by method

        int arr[] = {1,23,38,89,6,8,68,99};
        int size = 8;
        System.out.println("Enter the key value you find: ");
        int key = sc.nextInt();

        if(isFind(arr,size,key))
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not found");
        }
        
    }
    
}
