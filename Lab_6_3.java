import java.util.Scanner;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Lab_6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();
        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        e1.name = sc.nextLine();
        System.out.print("Age: ");
        e1.age = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Phone Number: ");
        e1.phoneNumber = sc.nextLine();
        System.out.print("Address: ");
        e1.address = sc.nextLine();
        System.out.print("Salary: ");
        e1.salary = sc.nextDouble();
        sc.nextLine(); // Consume newline character
        System.out.print("Specialization: ");
        e1.specialization = sc.nextLine();

        Manager m1 = new Manager();
        System.out.println("\nEnter Manager details:");
        System.out.print("Name: ");
        m1.name = sc.nextLine();
        System.out.print("Age: ");
        m1.age = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Phone Number: ");
        m1.phoneNumber = sc.nextLine();
        System.out.print("Address: ");
        m1.address = sc.nextLine();
        System.out.print("Salary: ");
        m1.salary = sc.nextDouble();
        sc.nextLine(); // Consume newline character
        System.out.print("Department: ");
        m1.department = sc.nextLine();

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
        System.out.println("Phone Number: " + e1.phoneNumber);
        System.out.println("Address: " + e1.address);
        e1.printSalary();
        System.out.println("Specialization: " + e1.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + m1.name);
        System.out.println("Age: " + m1.age);
        System.out.println("Phone Number: " + m1.phoneNumber);
        System.out.println("Address: " + m1.address);
        m1.printSalary();
        System.out.println("Department: " + m1.department);

        sc.close();
    }
}
