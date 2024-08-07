package Task6;

class Student {
    String name;
    int enrollmentNo;

    Student(String name, int enrollmentNo ){
        this.name=name;
        this.enrollmentNo=enrollmentNo;
    }

    public void printDetils() {
        System.out.println("Name: " + name);
        System.out.println("EnrollmentNo: " + enrollmentNo);
    }
}
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Student details: ");
        Student st = new Student("Amy",132);
        st.printDetils();
    }
}
