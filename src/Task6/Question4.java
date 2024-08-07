package Task6;

 class StudentName{
    String name;

    StudentName(){
        this.name="Unknown";
    }
    StudentName(String name){
        this.name=name;
    }
    public void printName(){
        System.out.println("Name of the student: "+ name);
    }
}
public class Question4 {

    public static void main(String[] args) {
        StudentName st1=new StudentName();
        StudentName st2=new StudentName("Bharathi Kodavatikanti");
        st1.printName();
        st2.printName();
    }
}
