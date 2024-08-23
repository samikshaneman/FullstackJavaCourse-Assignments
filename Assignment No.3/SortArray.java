import java.util.Arrays;

public class ArraySortingExample {

    public static void main(String[] args) {
        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
        
       
        // Sort the array in ascending order
        Arrays.sort(array);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}