// To find the triplet sum in a vector

import java.util.Vector;

public class TripletSumVector 
{
    public static void main(String[] args) 
    {

        int sum = 70;

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
                    if(element1+element2+element3==sum)
                    {
                        System.out.println("{"+element1+","+element2+","+element3+"}");
                    }
                    
                }
            }
        }
    }
    
}
