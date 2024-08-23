
// Sort an array consisting of only 0s and 1s

import java.util.Scanner;

public class ZeroOnePointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

//        count no of zeroes first
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

//        refill the other parts after finding out zeroes
        for (int i = 0; i < n; i++) {
            if(i < count){
               arr[i] = 0;
            }else{
                arr[i] = 1;

            }
        }
        System.out.println("sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
