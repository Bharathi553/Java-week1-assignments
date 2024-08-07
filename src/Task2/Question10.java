package Task2;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the basic salary: ");
        double basicSalary=sc.nextDouble();
        double hra=0;
        double da=0;
        if(basicSalary<=15000){
            hra=basicSalary*0.25;
            da=basicSalary*0.82;
        }
        else if(basicSalary<=20200){
            hra=basicSalary*0.27;
            da=basicSalary*0.90;
        }
        else if(basicSalary>20200){
            hra=basicSalary*0.36;
            da=basicSalary*0.95;
        }
         double grossSalary= basicSalary+hra+da;
        System.out.println("The gross salary is: "+ grossSalary);
    }
}
