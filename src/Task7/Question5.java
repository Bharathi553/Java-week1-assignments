package Task7;

import java.util.Scanner;

public class Question5 {
    public static boolean findArmstrong(int num){
        String str=Integer.toString(num);
        int numDigits=str.length();
        int sum=0;
        int temp=num;
        while(temp!=0){
            int digit=temp%10;
            sum+=Math.pow(digit, numDigits);
            temp=temp/10;
        }
        return sum==num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        boolean isArmstrong=findArmstrong(num);
        if(isArmstrong){
            System.out.println("The given number is Armstrong Number!");
        }
        else {
            System.out.println("The given number is not Armstrong Number!");
        }
    }
}
