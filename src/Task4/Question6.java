package Task4;

import java.util.*;

public class Question6 {

    public static void findTwoElementsWithSum(int[] arr, int target) {
        Set<Integer> seenNumbers = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (seenNumbers.contains(complement)) {
                System.out.println("Elements found " + arr[i] + " and " + complement);
                found = true;
            }
            seenNumbers.add(arr[i]);
        }

        if (!found) {
            System.out.println("No two elements found in the array that sum to" + target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Print the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        findTwoElementsWithSum(arr, target);
    }
}
