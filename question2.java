import java.nio.ReadOnlyBufferException;

public class question2 {

    public static void main(String args[]) {
        Employee employee1 = new Employee("Robert", 1994, "64C-WallsStreat", 0); // create the 3 employess of the
                                                                                 // emplyee class
        Employee employee2 = new Employee("Sam", 1994, "68D-WallsStreat", 0);
        Employee employee3 = new Employee("John", 1994, "26B-WallsStreat", 0);

        System.out.println("Name      Year of Joining      Address"); // print first row of output
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}

class Employee {
    String name;
    int salary;
    int year_of_joining;
    String address;

    Employee(String name, int year_of_joining, String address, int salary) { // constructor
        this.name = name;
        this.year_of_joining = year_of_joining;
        this.address = address;
        this.salary = salary;
    }

    public String toString() // define method for ptiniting an object of class
    {
        return String.format("%s     %s       %s", this.name, this.year_of_joining, this.address);
    }
}
