package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 4. Write a function to test if array contains a specific value
 */

import java.util.*;

public class ContainsSpecificValue {
    //method to test if array contains a specific value
    //creating a method which receives an array and integer as parameters
    static boolean contains(int[] arr, int n) {
        //using for-each loop
        for (int i : arr) {
            //returns if given n value is in index
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n;
        //declaring and initializing an array
        int[] arr = {11, 22, 33, 44, 55};
        System.out.print("Enter the value which should be searched : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //passing array and user input to method
        boolean hasValue = contains(arr, n);
        //Executes if(true)
        if (hasValue) {
            System.out.println("Contains " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Does not Contains " + n + " in the array");
            System.out.println(Arrays.toString(arr));
        }
    }
}
