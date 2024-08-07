package Task2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        char c=sc.next().charAt(0);
        if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
            System.out.println(c+ " is an alphabet");
        }
        else {
            System.out.println(c+ " is not an alphabet");
        }
    }
}
