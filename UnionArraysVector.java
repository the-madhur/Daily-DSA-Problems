import java.util.Vector;

public class UnionArraysVector {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4}; // First array
        int sizea = 5;
        int brr[] = {9, 5, 5, 1}; // Second array
        int sizeb = 4;

        Vector<Integer> ans = new Vector<>();

        // Adding the elements of the first array arr to the vector array ans
        for (int i = 0; i < sizea; i++) {
            if (!ans.contains(arr[i]))  // Check if the element is not already in the vector
            { 
                ans.add(arr[i]);
            }
        }

        // Adding the elements of the second array brr to the vector array ans
        for (int i = 0; i < sizeb; i++) {
            if (!ans.contains(brr[i])) // Check if the element is not already in the vector
            { 
                ans.add(brr[i]);
            }
        }

        // Printing the union of the arrays
        System.out.println("The union of the arrays is: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
