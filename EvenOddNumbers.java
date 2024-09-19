package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 15. Write a method to find number of even number and odd numbers in an array
 */

import java.util.Arrays;

public class EvenOddNumbers {
    //method to find number of even numbers in an array
    //creating a method which receives an array as parameter
    static void evenNumber(int[] arr) {
        System.out.print("Even numbers in array : ");
        //for each loop
        for (int i : arr) {
            //any numbers divided by 2 leaves remainder 0 is an even number
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
    //method to find number of odd numbers in an array
    //creating a method which receives an array as parameter
    static void oddNumber(int[] arr) {
        System.out.print("\nOdd numbers in array : ");
        //for each loop
        for (int j : arr) {
            //any numbers divided by 2 if doesn't leaves remainder 0 is an odd number
            if (j % 2 != 0) {
                System.out.print(j + "  ");
            }
        }
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("a[] = " + Arrays.toString(arr));
        //passing array to method to get even numbers
        evenNumber(arr);
        //passing array to method to get odd numbers
        oddNumber(arr);
    }
}
