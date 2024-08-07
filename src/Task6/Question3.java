package Task6;

class Employee{
    String name;
    int yearOfJoining;
    String address;

    Employee(String name, int yearOfBirth, String address){
        this.name=name;
        this.yearOfJoining =yearOfBirth;
        this.address=address;
    }
    public void printDetails(){
        System.out.printf("%-10s %-10d %-20s%n", name, yearOfJoining,address);
    }
}
public class Question3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C- Walls Street");
        Employee emp2 = new Employee("Sam", 2000, "68D- Walls Street");
        Employee emp3 = new Employee("John", 1999, "26B- Walls Street");
        System.out.printf("%-10s %-10s %-20s%n", "Name","Year Of Joining","Address");
        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
    }
}
