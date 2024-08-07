package Task6;

class Triangle {
    int side1;
    int side2;
    int side3;

    Triangle(){
       side1=3;
       side2=4;
       side3=5;
    }
    public int calculatePerimeter(){
        return side1+side2+side3;
    }
    public double calculateArea(){
        double semiPerimeter=calculatePerimeter()/2.0;
        return Math.sqrt(semiPerimeter*(semiPerimeter-side1)*(semiPerimeter-side2)*(semiPerimeter-side3));
    }
    public void printDetails(){
        System.out.println("Perimeter of the triangle: "+calculatePerimeter());
        System.out.println("Area of the triangle: "+calculateArea());
    }
}
public class Question2 {
    public static void main(String[] args) {
    Triangle t=new Triangle();
    t.printDetails();
    }
}
