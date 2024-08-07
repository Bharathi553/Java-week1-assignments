package Task3;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of even numbers to sum: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 0;
        int currentNumber = 2;

        while (count < n) {
            sum += currentNumber;
            currentNumber += 2;
            count++;
        }
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);

        sc.close();
    }
}
