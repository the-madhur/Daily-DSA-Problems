import java.util.Scanner;
import java.util.Vector;
public class FindUniqueElementVector 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the vector: ");
        int size = sc.nextInt();

        Vector<Integer> arr = new Vector<>(size);
        for(int i =0;i<size;i++)  // here we pass size instead of arr.size() 
        {
            arr.add(sc.nextInt());
        }

        int findelement = findUnique(arr);
        System.out.println("The unique element is: "+findelement); 
    }

    public static int findUnique(Vector<Integer> arr)
    {
        int ans =0;
        for(int i =0;i<arr.size();i++) // here we pass arr.size() instead of size
        {
            ans = ans^arr.get(i);
        }
        return ans;
    }
    
}
