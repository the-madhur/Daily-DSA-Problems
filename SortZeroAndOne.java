import java.util.Vector;
public class SortZeroAndOne 
{
    public static void swap(Vector<Integer> arr, int i, int j) 
    {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<>();
        arr.add(0);
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(0);
    

        int start = 0;
        int end = arr.size() - 1;

        while (start < end) {
            while (start < end && arr.get(start) == 0) 
            {
                start++;
            }
            while (start < end && arr.get(end) == 1) {
                end--;
            }
            if (start < end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }

        System.out.println("After sorting 0 and 1: " + arr);
    }
}
