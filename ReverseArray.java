package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 9. Write a function to reverse an array of integer values
 */

import java.util.Arrays;

public class ReverseArray {
    //function to reverse an array of integer values
    //creating a method which receives an array as a parameter
    static void reverseArray(int[] arr) {
        //creating new array to store reversed array
        int[] r_arr = new int[arr.length];
        //
        int j = arr.length;
        for (int i : arr) {
            r_arr[j - 1] = i;
            j = j - 1;
        }
        System.out.println("Reversed Array  : r_arr = " + Arrays.toString(r_arr));
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {11, 22, 33, 44, 55};
        //printing array as string
        System.out.println("Original Array : my_arr = " + Arrays.toString(my_arr));
        //passing array to method to reverse an array
        reverseArray(my_arr);
    }
}
