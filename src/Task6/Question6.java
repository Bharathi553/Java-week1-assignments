package Task6;

import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.real - other.real;
        double imaginaryPart = this.imaginary - other.imaginary;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public void display() {
        if (imaginary >= 0) {
            System.out.printf("%.2f + %.2fi%n", real, imaginary);
        } else {
            System.out.printf("%.2f - %.2fi%n", real, imaginary);
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary parts of first complex number");
        double real1 = sc.nextDouble();
        double imaginary1 = sc.nextDouble();

        System.out.println("Enter real and imaginary parts of second complex number");
        double real2 = sc.nextDouble();
        double imaginary2 = sc.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);
        System.out.println("Sum: ");
        sum.display();
        System.out.println("Difference: ");
        difference.display();
        System.out.println("Product: ");
        product.display();
    }
}
