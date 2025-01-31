// Purpose: To find all the four elements in an array whose sum is equal to a given Sum.

import java.util.Vector;
public class FourSumArray 
{
    public static void main(String[] args) 
    {
        int sum = 100;
        Vector<Integer> arr = new Vector<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        
        for(int i =0;i<arr.size();i++)
        {
            int element1 = arr.get(i);
            for(int j =i+1; j<arr.size();j++)
            {
                int element2 = arr.get(j);
                
                for(int k =j+1;k<arr.size();k++)
                {
                    int element3 = arr.get(k);
                    for(int l = k+1;l<arr.size();l++)
                    {
                        int element4 = arr.get(l);
                        if(element1+element2+element3+element4==sum)
                        {
                            System.out.println("{"+element1+","+element2+","+element3+","+element4+"}");
                        }
                    }
                    
                }
            }
        }
    }
    
}

