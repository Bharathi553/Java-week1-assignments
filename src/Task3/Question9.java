package Task3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        int mid=n/2 +1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j==mid+1 || i-j==n/2 || j-i==n/2|| i+j==mid+n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
