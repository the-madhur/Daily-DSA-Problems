import java.util.Scanner;
import java.util.Vector;
public class SortZeroAndOne 
{
    public static void swap(Vector<Integer> arr, int i, int j) 
    {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Vector<Integer> arr = new Vector<>();

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter elements (only 0 and 1):");
        for (int i = 0; i < n; i++) 
        {
            int num = scanner.nextInt();
            if (num == 0 || num == 1) 
            {
                arr.add(num);
            } 
            else 
            {
                System.out.println("Invalid input! Only 0 and 1 are allowed.");
                i--; // Re-enter the value
            }
        }
        int start = 0;
        int end = arr.size() - 1;
        int i =0;

        while (i<end) 
        {
            if(arr.get(i)==0)
            {
                swap(arr,i,start);
                start++;
                i++;
            }
            if(arr.get(i)==1) 
            {
                swap(arr, start, end);
                end--;
            }
        }

        System.out.println("After sorting 0 and 1: " + arr);
    }
}
