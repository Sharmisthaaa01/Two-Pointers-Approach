
/*
  For an array 'a' sorted in non-decreasing order,
   return an array of squares
   of each number sorted in non-decreasing order
 */

import java.util.Arrays;

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10}; // Example input

        int[] result = sortedSquares(a);

        System.out.println("Array of squares in non-decreasing order: " + Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] a) {
        int n = a.length;
        int[] result = new int[n];
        int left = 0; // Pointer starting from the beginning
        int right = n - 1; // Pointer starting from the end
        int index = n - 1; // Position to insert into the result array

        while (left <= right) {
            int leftSquare = a[left] * a[left];
            int rightSquare = a[right] * a[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }
}

