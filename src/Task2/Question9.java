package Task2;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units");
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 60) {
            bill = units * 0.30;
        } else if (units <= 150) {
            bill = (60 * 0.30) + ((units - 60) * 0.75);
        } else if (units <= 270) {
            bill = (60 * 0.30) + (90 * 0.75) + ((units - 150) * 1.10);
        } else {
            bill = (60 * 0.30) + (90 * 0.75) + (120 * 1.10) + ((units - 270) * 2.50);
        }

        // Add a surcharge of 20% to the bill
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        // Print the total bill
        System.out.println("The total electricity bill is: Rs. " + totalBill);
    }
}