package Task3;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of given number is: " + fact);
    }
}