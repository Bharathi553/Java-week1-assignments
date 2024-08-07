package Task2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Annual Income: ");
        double income=sc.nextDouble();
        double tax=0;
        if (income > 1200000) {
            tax = (income - 1200000) * 0.25 + (600000 * 0.18) + (350000 * 0.10);
        } else if (income > 600000) {
            tax = (income - 600000) * 0.18 + (350000 * 0.10);
        } else if (income > 250000) {
            tax = (income - 250000) * 0.10;
        }
        else{
            System.out.println("There is no income tax for the income below 250000");
        }
        System.out.println("Income tax paid by an employee to the governament is: "+ tax);
    }
}
