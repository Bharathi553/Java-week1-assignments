package Task3;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continueOperation;
        do {
            System.out.println("Enter the two numbers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int sum = 0;
            sum = num1 + num2;
            System.out.println("sum of 2 numbers is: " + sum);
            System.out.println("Do you still want to continue(yes/no): ");
            continueOperation = sc.next();

        } while (continueOperation.equalsIgnoreCase("yes"));
        sc.close();
    }
}
