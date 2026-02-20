package cap_19_02.stream_api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StreamEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 50000, 30, "alice@gmail.com",
                LocalDate.of(1990, 1, 1),
                LocalDate.of(2015, 1, 1),
                "1234567890", "123 Main St", "Female"));

        employees.add(new Employee("Bob", 70000, 35, "bob@gmail.com",
                LocalDate.of(1988, 5, 10),
                LocalDate.of(2013, 3, 15),
                "9876543210", "456 Elm St", "Male"));

        employees.add(new Employee("Charlie", 45000, 28, "charlie@gmail.com",
                LocalDate.of(1995, 7, 20),
                LocalDate.of(2020, 6, 1),
                "9123456780", "789 Oak St", "Male"));

        employees.add(new Employee("Diana", 90000, 40, "diana@gmail.com",
                LocalDate.of(1983, 2, 14),
                LocalDate.of(2010, 9, 10),
                "9988776655", "321 Pine St", "Female"));

        employees.add(new Employee("Eve", 60000, 32, "eve@gmail.com",
                LocalDate.of(1992, 11, 5),
                LocalDate.of(2018, 4, 20),
                "8877665544", "654 Cedar St", "Female"));

        employees.stream().filter(emp-> emp.getSalary() > 60000)
                .sorted((e1, e2)-> e1.getName().compareTo(e2.getName()))
                .map(Employee::getSalary
                )
                .forEach(System.out::println);
    }
}