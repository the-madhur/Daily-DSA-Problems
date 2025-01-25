/* 1. When we pass an array to a function, we are passing the reference of the array to the function. 
So, any changes made in the array in the function will be reflected in the original array. 

2. When we pass an array to a function, so it is necessary to pass the size of the array as well. 
*/


public class ArraysAndFunctions 
{
    public static void printArray(int arr[], int size)
    {
        for(int i =0; i<size; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void inc(int arr[], int size)
    {
        arr[0] = arr[0] +10;
        printArray(arr, size);
    }
    public static void main(String[] args) 
    {
        int arr[] ={5,6};
        int size = 2;
        inc(arr, size);

        printArray(arr, size);
        
    }
    
}
