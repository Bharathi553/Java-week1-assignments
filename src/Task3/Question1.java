package Task3;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of terms in the Fibanocci series: ");
        int terms=sc.nextInt();
        int firstTerm=0, secondTerm=1;
        System.out.print("Fibonocci series: "+ firstTerm+" "+ secondTerm);
        for(int i=3; i<=terms;i++){
            int nextTerm= firstTerm+secondTerm;
            System.out.print(" " +nextTerm);
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
