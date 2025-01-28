import java.util.Vector;

public class Vector1
{
    public static void main(String args[])
    {
        Vector<Integer> vector = new Vector<>(5); // Creating a vector of initial capacity of 5
        //vector.ensureCapacity(10);  // increasing the capacity of the vector to 10
        vector.add(12);
        vector.add(13);  // adding(insert) elements to the vector
        vector.add(14);
        vector.add(10);
        vector.add(33);

        System.out.println("Size of the vector: "+vector.size()); // printing the size of the vector
        System.out.println("Capacity of the vector: "+vector.capacity()); // printing the capacity of the vector
        // vector.remove(0); // removing element at index 0
        vector.get(1); // accessing element at index 1
        System.out.println("Element at index 1: "+vector.get(1)); // printing the element at index 1
        vector.set(2, 100); // setting element at index 2 to 100
        
        // iteration for printing the vector elements
        System.out.print("Vector elements: ");
        for(int i=0;i<5;i++)
        {
            System.out.print(vector.get(i)+" ");
        }
    }
}