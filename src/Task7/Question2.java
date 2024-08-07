package Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersectionList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !intersectionList.contains(arr1[i])) {
                    intersectionList.add(arr1[i]);
                    break;
                }
            }
        }
        int[] result = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            result[i] = intersectionList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of array2: ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of array1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of 2 arrays: ");
        for (int j : intersection) {
            System.out.print(j + " ");
        }
    }
}
