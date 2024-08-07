package Task4;

import java.util.Scanner;

public class Question10 {
    public static boolean areArraysEqual(int[]array1, int[]array2, int n1, int n2){
        if(n1!=n2){
            return false;
        }
        for(int i=0;i<n1;i++){
            if(array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array 1: ");
        int n1=sc.nextInt();
        System.out.println("Enter the size of array 2: ");
        int n2=sc.nextInt();
        int[] array1=new int[n1];
        int[] array2=new int[n2];
        System.out.println("Enter the elements of array 1");
        for(int i=0;i<n1;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of array 2");
        for(int i=0;i<n2;i++){
            array2[i]=sc.nextInt();
        }
        boolean areEqual=areArraysEqual(array1,array2,n1,n2);
        if(areEqual){
            System.out.println("Both arrays are equal");
        }
        else{
            System.out.println("Both arrays are not equal");
        }


    }
}
