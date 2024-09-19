package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 7. Write a function to insert an element at a specific position in the array.
 */

import java.util.*;

public class InsertAtSpecificPosition {
    //function to insert an element at a specific position in the array.
    //creating a method which receives an array and integers as parameters
    static void insertElement(int[] arr, int index, int v) {
        for (int i = arr.length; i <= index; i--) {
            arr[i] = arr[i - 1];
        }
        //assigns value at given index
        arr[index] = v;
    }

    public static void main(String[] args) {
        int index, v;
        //declaring and initializing an array
        int[] my_arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("original Array : my_arr = " + Arrays.toString(my_arr));

        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter the index number : ");
        index = sc.nextInt();
        System.out.printf("Enter the value to insert at index my_arr[%d] =  ", index);
        v = sc.nextInt();
        //passing array, index and value to method
        insertElement(my_arr, index, v);

        System.out.println("Array after Inserting Element : ");
        System.out.println("my_arr = " + Arrays.toString(my_arr));
    }
}