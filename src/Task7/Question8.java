package Task7;

import java.util.Scanner;

public class Question8 {
    public static int findMaxValue(int[] arr, int n){
        if(arr==null){
            System.out.println("The array is empty!");
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=findMaxValue(arr,n);
        System.out.println("The maximum value in the array is: "+ max);
    }
}
