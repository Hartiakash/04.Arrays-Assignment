package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 19. Write a function to find the missing number of sorted array of 1 to 100
 */

import java.util.Arrays;

public class MissingNumbers {
    //method to find the missing number of sorted array of 1 to 100
    //creating a method which receives an array as parameter
    static void missingNumber(int[] arr) {
        //Sorting Array
        Arrays.sort(arr);
        System.out.println("a[] = " + Arrays.toString(arr));
        int j = 0;
        for (int i = 1; i < 100; i++) {
            if (j < arr.length && i == arr[j])
                j++;
            else
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //passing array to method
        missingNumber(my_arr);
    }
}
