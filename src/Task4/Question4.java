package Task4;

import java.util.Scanner;

public class Question4 {

    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the integer to find: ");
        int target = sc.nextInt();
        boolean found = binarySearch(arr, target);
        if (found) {
            System.out.println("The integer " + target + " is present in the array");
        } else {
            System.out.println("The integer " + target + " is not present in the array");
        }
    }
}
