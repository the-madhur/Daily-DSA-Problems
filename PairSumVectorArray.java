// Purpose: To find all pairs of elements in a given array whose sum is equal to a given number.

import java.util.Vector;

public class PairSumVectorArray
{
    public static void main(String[] args) 
    {
        Vector<Integer> arr = new Vector<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        for(int i =0;i<arr.size();i++)
        {
            // System.out.println("We are at element: "+arr.get(i));  // for understanding flow of code
            int element = arr.get(i);

            for(int j =i+1;j<arr.size();j++)
            {
                // System.out.println("pair "+element+" with "+arr.get(j));  // for understanding flow of code
                System.out.println("{"+element+","+arr.get(j)+"}");
            }
        }
        
    }
    
}
