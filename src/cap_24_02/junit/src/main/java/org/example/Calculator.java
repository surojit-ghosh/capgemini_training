package cap_24_02.junit.src.src.main.java.org.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition (int): " + calculator.add(5, 3));
        System.out.println("Addition (double): " + calculator.add(5.5, 3.2));
        System.out.println("Subtraction (int): " + calculator.subtract(5, 3));
        System.out.println("Subtraction (double): " + calculator.subtract(5.5, 3.2));
        System.out.println("Multiplication (int): " + calculator.multiply(5, 3));
        System.out.println("Multiplication (double): " + calculator.multiply(5.5, 3.2));
        System.out.println("Division (int): " + calculator.divide(5, 3));
        System.out.println("Division (double): " + calculator.divide(5.5, 3.2));

    }
}
