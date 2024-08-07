package Task2;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int percentage = sc.nextInt();
        if(percentage>90){
            System.out.println("The grade is A");
        }
        else if(percentage>75){
            System.out.println("The grade is B");
        }
        else if(percentage>65){
            System.out.println("The grade is C");
        }
    }
}
