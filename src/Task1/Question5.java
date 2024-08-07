package Task1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        double area= 3.14*radius*radius;
        System.out.println("Area of the circle is "+ area);
    }
}
