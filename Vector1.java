import java.util.Vector;

public class Vector1
{
    public static void main(String args[])
    {

        // Initializing the size and default value for the vector
        int size = 5; // Number of elements in the vector
        int defaultValue = -101; // Default value for each element

        // Creating a vector with a specific size (capacity)
        Vector<Integer> vrr = new Vector<>(size); 

        // Populating the vector with default values
        for (int i = 0; i < size; i++) {
            vrr.add(defaultValue); // Add default value to each position
        }

        // Output the vector
        System.out.println("Vector initialized with default values: " + vrr); 
        // Output: [-101, -101, -101, -101, -101]

        // Creating another vector with an initial capacity of 10
        Vector<Integer> arr = new Vector<>(10);
        System.out.println("Vector arr is empty or not: "+arr.isEmpty());  // Output: true  because arr is empty

        // Display the initial size (0 as no elements added yet)
        System.out.println("Size of arr: " + arr.size()); // Output: 0

        // Adding elements to the vector
        arr.add(10);
        arr.add(20);
        arr.add(30);

        System.out.println("Vector arr is empty or not: "+arr.isEmpty());  // Output: false  because arr is not empty
        // Display the size after adding elements
        System.out.println("Size of arr after adding elements: " + arr.size()); // Output: 3

        // Iterate over the vector and print its elements
        System.out.println("Elements in arr:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Element at index " + i + ": " + arr.get(i));
        }

        // Uncomment below lines for additional vector operations:
        
        // Example of removing an element from the vector
        // arr.remove(1); // Remove element at index 1

        // Example of ensuring capacity (increases the internal array size)
        // arr.ensureCapacity(10);  // Ensure the capacity of the vector is at least 10

        // Example of adding more elements after ensuring capacity
        // arr.add(12);
        // arr.add(13);  // Adding more elements to the vector

        // Example of printing the size and capacity of the vector
        // System.out.println("Size of arr: " + arr.size());
        // System.out.println("Capacity of arr: " + arr.capacity());

        // Example of accessing and modifying elements in the vector
        // System.out.println("Element at index 1: " + arr.get(1)); // Access element at index 1
        // arr.set(2, 100); // Set element at index 2 to 100
    }
}
