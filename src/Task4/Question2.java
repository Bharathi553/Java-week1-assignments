package Task4;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Average is: ");
        double sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double avg=(double)sum/n;
        System.out.println("The Average is: "+ avg);
    }
}
