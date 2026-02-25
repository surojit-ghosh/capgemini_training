package cap_24_02.junit.src.src.main.java.org.example;

public class OddEven {
    public int oddEven(int num) {
        if (num % 2 == 0) {
            return 1; // Even
        } else {
            return 0; // Odd
        }
    }
    public static  void main(String[] args) {
        OddEven oddEven = new OddEven();
        int num1 = 4;
        int num2 = 7;
        System.out.println(num1 + " is " + (oddEven.oddEven(num1) == 1 ? "Even" : "Odd"));
        System.out.println(num2 + " is " + (oddEven.oddEven(num2) == 1 ? "Even" : "Odd"));
    }
}
