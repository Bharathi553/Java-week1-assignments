package Task6;

class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        this.length=0;
        this.breadth=0;
    }
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Rectangle(int number){
        this.length=number;
        this.breadth=number;
    }
    public void printArea(){
        System.out.println("Area of rectangle: "+(length*breadth));
    }
}
public class Question5 {
    public static void main(String[] args) {
    Rectangle r1=new Rectangle();
    Rectangle r2=new Rectangle(3,4);
    Rectangle r3=new Rectangle(3);

    r1.printArea();
    r2.printArea();
    r3.printArea();
    }
}
