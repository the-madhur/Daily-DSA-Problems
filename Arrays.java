public class Arrays
{
    public static void main(String[] args) 
    {
        int a[] = {4,3,2,5,2}; // declaring and initializing an array of 5 elements in java
        System.out.println(a[0]);
        System.out.println(a);  // prints the address of the array
        System.out.println("Length of the array is: " + a.length); // prints the length of the array
        
        int arr[] = new int[4]; // declaring and initializing an array of 20 elements in java
        // initializing the array with some values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        
        // printing the elements of the array
        for(int i =0; i<=3; i++)
        {
            System.out.print(arr[i] +" ");
        }

        
    }
}