package Task2;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       while(true){
           System.out.println("Enter a number: ");
           int num=sc.nextInt();
           if(num<0){
               System.out.println("it's over");
               break;
           }
           if(num>0){
               System.out.println("Good going");
               continue;
           }

        }
    }
}
