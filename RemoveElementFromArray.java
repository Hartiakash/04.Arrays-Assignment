package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 5.Write a function to remove a specific element from an array
 */

import java.util.*;

public class RemoveElementFromArray {

    //function to remove a specific element from an array
    //creating a method which receives an array and integer as parameters
    public static int[] removeElement(int[] arr, int index)
    {
        /* If the array is empty or the index is not in array range return the original array */
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];
        // Copy the elements except the index from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {
            // if the index is the removal element index
            if (i == index) {
                continue;
            }
            // if the index is not the removal element index
            anotherArray[k++] = arr[i];
        }
        // return the resultant array
        return anotherArray;
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] arr = { 11, 22, 33, 44, 55 };
        // Print the resultant array
        System.out.print("Select an index to remove a value from arr = " + Arrays.toString(arr) + ": ");
        // Get the specific index
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        // Print the index at which value is removed
        System.out.println("Array after removing Element at index " + index );
        //passing array to method to Remove the element
        arr = removeElement(arr, index);
        // Print the resultant array
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
