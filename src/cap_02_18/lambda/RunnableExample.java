package cap_02_18.lambda;

interface Runnable {
    void run();
}

public class RunnableExample {


    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running...");
        r.run();
    }
}
