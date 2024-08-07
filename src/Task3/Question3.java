package Task3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String input = sc.nextLine();
        String cleanedInput= input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalindrome = true;
        int length= cleanedInput.length();
        for (int i = 0; i < length/ 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The given input is a palindrome");
        } else {
            System.out.println("The given input is not a palindrome");
        }
    }


}
