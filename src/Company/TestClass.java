package Company;


import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Company's Bank balance ! \n");

        Employee Employee1 = new Employee("Rachit", 19, 2000000);

        System.out.println(Employee1.getEmployeeDetails());

        Employee Employee2 = new Employee("Mohan", 18, 2000000);

        System.out.println(Employee2.getEmployeeDetails());

    }
}
