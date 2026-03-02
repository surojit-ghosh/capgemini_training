package cap_02_18.lambda;

interface Perform {
    String function(int a, int b);
}

public class PerformExample {
    public static void main(String[] args) {
        Perform p = (a, b) -> {

            return "Sum: " + (a + b);
        };
        System.out.println(p.function(5, 10));
    }
}
