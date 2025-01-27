import java.util.Scanner;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        
        int arr[] =new int[size];
        for(int i =0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        // print original elements of the array
        System.out.println("Original Elements of the array are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();   // for next line

        int start =0;
        int end = size-1;

        System.out.println("Reverse array are: ");
        while(start<=end)
        {
            int temp =arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
        
        // printing reverse elements of array
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
