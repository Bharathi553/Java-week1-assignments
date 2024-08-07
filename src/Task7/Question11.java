package Task7;

import java.util.*;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int targetSum=sc.nextInt();
        findSubarraysWithSum(arr, targetSum);
    }

    public static void findSubarraysWithSum(int[] arr, int targetSum) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int currentSum = 0;

            for (int end = start; end < n; end++) {
                currentSum += arr[end];

                if (currentSum == targetSum) {
                    printSubarray(arr, start, end);
                }
            }
        }
    }

    private static void printSubarray(int[] arr, int start, int end) {
        System.out.print("Subarray with sum found: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}