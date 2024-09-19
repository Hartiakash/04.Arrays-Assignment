package Arrays_Assignment;

/**
 * @author JALA Academy
 * Website Reference : https://java.jalaacademy.com/java/java_arrays.html
 *
 * 2. Write a function to calculate the average value of an array of integers
 */

public class CalculateAverageValue {
    //method to calculate the average value
    //creating a method which receives an array as parameter
    static void avgArray(int[] arr) {
        int sum = 0;
        //for-each loop
        for (int i : arr) {
            //first calculate the sum of all elements in the array and store in sum
            sum = sum + i;
        }
        //we calculate the average by the formula (avg = sum of numbers/total count)
        int average = sum / arr.length;
        //Prints the average number
        System.out.print("The Average value of array is " + average);
    }

    public static void main(String[] args) {
        //declaring and initializing an array
        int[] arr = {1, 2, 3, 4, 5};
        //passing array to method to get average value
        avgArray(arr);
    }
}
