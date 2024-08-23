
/*
   In an array 'a' move all even integers at the beginning
    followed by all odd integers. The relative order of odd or even integers
    doesn't matter. Return an array that satisfies the condition.
 */

import java.util.Scanner;

public class OddIntMove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        //       move the even numbers to the beginning
        int [] result = new int[n];
        int count = 0;

//        store even numbers first
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                result[count++] = arr[i];
            }
        }

//        refill the other parts with odds after moving
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0){
                result[count++] = arr[i];
            }

        }
//        print the rearranged array

        System.out.println("sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
