package Task2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=sc.nextInt();
        if((year%4==0)&&(year!=100)||(year%400==0)){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year+ " not a leap year");
        }
    }
}
