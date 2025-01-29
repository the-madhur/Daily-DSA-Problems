import java.util.Vector;

public class UnionArraysVector 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        int sizea = 5;
        int brr[] = {9,5,1,2};
        int sizeb = 4;

        Vector<Integer> ans = new Vector();

        // Adding the elements of the first array arr to the vector array ans
        for(int i =0;i<sizea;i++)
        {
            ans.add(arr[i]);
        }
        
        // Adding the elements of the second array brr to the vector array ans
        for(int i =0;i<sizeb;i++)
        {
            ans.add(brr[i]);
        }

        System.out.println("The union of the arrays is: ");
        //printing the elements of the vector array ans
        for(int i =0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
    
}
