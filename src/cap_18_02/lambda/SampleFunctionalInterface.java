package cap_18_02.lambda;

@FunctionalInterface
interface Supplier<T> {
    T get();
}

public class SampleFunctionalInterface {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello, World!";
        System.out.println(stringSupplier.get());
    }
}
