package cap_18_02.lambda;

interface Consumer<T> {
    void accept(T t);
}

public class SampleConsumer {
    public static void main(String[] args) {
        Consumer<Integer> con = (x) -> System.out.println("Consumed: " + x);
        con.accept(42);
    }
}
