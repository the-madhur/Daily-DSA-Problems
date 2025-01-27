import java.util.Scanner;

public class ExtremeArrayPrint 
{
    public static void main(String[] args) 
    {
        // case 1 When Size is Even

        // int arr[] ={10,20,30,40,50,60,70,80};  o/p: 10 80 20 70 30 60 40 50
        // int size = 8;
        // int start =0;
        // int end = size-1;

        // while(true)
        // {
        //     if(start>end)
        //     {
        //         break;
        //     }
        //     System.out.print(arr[start]+" ");
        //     System.out.print(arr[end]+" ");
        //     start++;
        //     end--;

        // }

        // case 2 When Size is Odd   o/p: 10 70 20 60 30 50 40

        // int arr[] ={10,20,30,40,50,60,70};    
        // int size = 7;
        // int start =0;
        // int end = size-1;

        // while(true)
        // {
        //     if(start>end)
        //     {
        //         break;
        //     }
        //     if(start ==end)
        //     {
        //         System.out.print(arr[start]+" ");
        //     }
        //     else{
        //         System.out.print(arr[start]+" ");
        //         System.out.print(arr[end]+" ");
        //     }
            
        //     start++;
        //     end--;

        // }

        // case 3 for both Even and Odd Size of Array input by user 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        
        int arr[] =new int[size];
        for(int i =0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        // print elements of the array
        System.out.println("Elements of the array are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();   // for next line

        int start =0;
        int end = size-1;

        System.out.println("Extreme elements of the array are: ");
        while(start<=end)
        {
            if(start ==end)
            {
                System.out.print(arr[start]+" ");
            }
            else{
                System.out.print(arr[start]+" ");
                System.out.print(arr[end]+" ");
            }
            
            start++;
            end--;

        }
    }
    
}
