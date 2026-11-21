package Streamsapi;


import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Manoj", "IT", 25000));
        employees.add(new Employee(2, "Rahul", "HR", 35000));
        employees.add(new Employee(3, "Arun", "IT", 40000));
        employees.add(new Employee(4, "Kiran", "HR", 28000));
        employees.add(new Employee(5, "Raj", "Sales", 50000));

        // 1. Filter employees with salary greater than 30000
        System.out.println("Salary greater than 30000:");

        employees.stream()
                 .filter(e -> e.salary > 30000)
                 .forEach(e -> System.out.println(e.name));

        // 2. Sort employees by salary
        System.out.println("\nSorted by Salary:");

        employees.stream()
                 .sorted(Comparator.comparingDouble(e -> e.salary))
                 .forEach(e -> System.out.println(e.name + " " + e.salary));

        // 3. Extract employee names using map()
        System.out.println("\nEmployee Names:");

        List<String> names = employees.stream()
                .map(e -> e.name)
                .collect(Collectors.toList());

        System.out.println(names);

        // 4. Group employees by department
        System.out.println("\nGroup By Department:");

        Map<String, List<Employee>> result =
                employees.stream()
                .collect(Collectors.groupingBy(e -> e.department));

        result.forEach((dept, empList) ->
                System.out.println(dept + " : " + empList));

        // 5. Calculate total salary using reduce()
        System.out.println("\nTotal Salary:");

        double totalSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0.0, (a, b) -> a + b);

        System.out.println(totalSalary);
    }
}
