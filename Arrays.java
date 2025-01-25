import java.util.Scanner;

public class Arrays
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        // int a[] = {4,3,2,5,2}; // declaring and initializing an array of 5 elements in java
        // System.out.println(a[0]);
        // System.out.println(a);  // prints the address of the array
        // System.out.println("Length of the array is: " + a.length); // prints the length of the array
        
        // int arr[] = new int[4]; // declaring and initializing an array of 20 elements in java
        // // initializing the array with some values
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;
        // arr[3] = 40;
        
        // // printing the elements of the array
        // for(int i =0; i<=3; i++)
        // {
        //     System.out.print(arr[i] +" ");
        // }
        
        // initializing an array of custom size
        // int arr[] = new int[5];
        // // taking elements input in array
        // System.out.println("Enter the elements of the array: ");
        // for(int i =0;i<5; i++)
        // {
        //     arr[i] =sc.nextInt();
        // } 
        
        // // print elements of the array
        // System.out.println("Elements of the array are: ");
        // for(int i=0; i<5; i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }

        // taking size of array as input
        // System.out.println("Enter the size of the array: ");
        // int n = sc.nextInt();

        // // initializing an array for n size in java
        // int arr[] = new int[n];

        // // taking elements input in array
        // System.out.println("Enter the elements of the array: ");
        // for(int i =0;i<n; i++)
        // {
        //     arr[i] =sc.nextInt();
        // } 
        
        // // print elemnts of the array
        // System.out.println("Elements of the array are: ");
        // for(int i=0; i<n; i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }
        

        // taking 5 inputs in array and print their doubles
        int arr[] = new int[5];
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<5;i++)
        {
            arr[i] = sc.nextInt();     
        }

        // print Doubles of the elements of array
        for(int i =0; i<5; i++)
        {
            System.out.println(arr[i]*2);  // this arr[i]*2 will print the double of the elements of the array
        }
    }
}