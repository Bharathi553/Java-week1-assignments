package Task4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the integer to find: ");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("The integer"+target+" is present in the array");
        }
        else{
            System.out.println("The integer"+target+" is not present in the array");
        }
    }
}
