package Task2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1 and numb2: ");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Enter the operator +,-,*,/");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println("Addition of 2 number is: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction of 2 number is: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of 2 number is: "+(num1*num2));
                break;
            case '/':
                if(num2!=0){
                    System.out.println("Division of 2 number is: "+(num1/num2));
                }
                else{
                    System.out.println("Divison by zero is not possible");
                }
                break;
            default:
                System.out.println("Enter the valid operator +,-,*,/");
                break;
        }
    }
}
