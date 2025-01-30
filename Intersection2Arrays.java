import java.util.Vector;
public class Intersection2Arrays 
{
    public static void main(String[] args) 
    {
        
        Vector<Integer> arr = new Vector<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        
        Vector<Integer> brr = new Vector<>();
        brr.add(3);
        brr.add(3);
        brr.add(4);
        brr.add(9);
        brr.add(10);

        Vector<Integer> ans = new Vector<>();

        for(int i =0;i<arr.size();i++)
        {
            int element = arr.get(i);
            for(int j =0;j<brr.size();j++)
            {
                if(element == brr.get(j))
                {
                    // marking the element as visited
                    brr.set(j, Integer.MIN_VALUE);   //set j to minimum possible value of Integer
                    ans.add(element);
                    break;
                }
            }
        }

        // printing the elements of the vector array ans
        System.out.print("The intersection of two arrays is: ");
        for(int i =0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
    
}
