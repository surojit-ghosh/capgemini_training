package cap_02_03.comparable;

import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    Integer age;
    Double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int compareTo(Student other) {
        return this.gpa.compareTo(other.gpa);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 20, 3.5),
                new Student("Bob", 22, 3.7),
                new Student("Charlie", 19, 3.9)
        };

        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
