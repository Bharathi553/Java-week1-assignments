package Task2;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("quotient: "+ (a/b)+ " Reminder: "+ (a%b));

    }
}
