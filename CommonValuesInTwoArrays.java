package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 11.Write a program to find the common values between two arrays
 */

import java.util.Arrays;

public class CommonValuesInTwoArrays {
    //method to find the common values between two arrays
    //creating a method which receives two arrays as parameters
    static void commonValues(int[] arr1, int[] arr2) {
        //outer loop
        for (int k : arr1) {
            //inner loop
            for (int i : arr2) {
                //checks if both array has same elements
                if (k == i) {
                    //prints common elements
                    System.out.println("Common values : " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        //declaring and initializing two arrays
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {66, 55, 77, 11, 88};
        System.out.println("arr1[] = " + Arrays.toString(arr1));
        System.out.println("arr2[] = " + Arrays.toString(arr2));
        //passing two arrays to method to get common values
        commonValues(arr1, arr2);
    }
}
