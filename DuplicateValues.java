package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 10.Write a function to find the duplicate values of an array
 */

import java.util.Arrays;

public class DuplicateValues {
    //function to find the duplicate values of an array
    //creating a method which receives an array as parameter
    static void duplicateValues(int[] arr) {
        //outer loop
        System.out.println("Duplicate values : ");
        for (int i = 0; i < arr.length - 1; i++) {
            //inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j] && (i != j))) {
                    //prints the duplicate element
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        //declaring and initializing an array
        int[] my_arr = {11, 22, 33, 44, 55, 22, 44, 33};
        //printing array as string
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        //passing array to method to get duplicate values
        duplicateValues(my_arr);
    }
}
