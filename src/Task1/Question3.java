package Task1;

public class Question3 {
    void swapUsingThirdVariable(int a, int b){
        int result;  //using a third variable result
        result= a;
        a=b;
        b=result;
        System.out.println("With using a third variable");
        System.out.println("After swapping a= "+ a+", b = "+ b);
    }
    void swapWithoutThirdVariable(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Without using a third variable");
        System.out.println("After swapping a= "+ a+", b = "+ b);
    }

    public static void main(String[] args) {
        Question3 q3= new Question3();
        q3.swapUsingThirdVariable(  2,3);
        q3.swapWithoutThirdVariable(2,3);
    }
}
