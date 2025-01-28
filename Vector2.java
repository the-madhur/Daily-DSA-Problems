import java.util.Scanner;
import java.util.Vector;

public class Vector2
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the vector: ");
        int size =sc.nextInt();

        Vector<Integer> vector = new Vector<>(size);
        System.out.println("Enter the elements of the vector: ");
        for(int i =0;i<size;i++)  // for adding elements to the vector use size as the limit
        {
            vector.add(sc.nextInt());
        }
        System.out.println("Elements of the vector are: "+vector);
        System.out.println("Size of the vector is: "+vector.size());
        System.out.println("Capacity of the vector is: "+vector.capacity());
    
    }
    
}
