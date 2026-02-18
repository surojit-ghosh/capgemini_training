package cap_18_02.lambda;

interface LambdaSample1 {
    void abstractMethod();
//    void abstractMethod2();
}

class LambdaSampleClass implements LambdaSample1 {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method in LambdaSampleClass");
    }

//    @Override
//    public void abstractMethod2() {
//        System.out.println("Implementation of abstract method2 in LambdaSampleClass");
//    }


}

public class LambdaSample {
    public static void main(String[] args) {
        class LocalClass implements LambdaSample1 {
            @Override
            public void abstractMethod() {
                System.out.println("Implementation of abstract method in LocalClass");
            }

//            @Override
//            public void abstractMethod2() {
//                System.out.println("Implementation of abstract method2 in LocalClass");
//            }
        }

        LambdaSample1 lambdaSample1 = new LambdaSampleClass(){
            @Override
            public void abstractMethod() {
                System.out.println("Implementation of abstract method in anonymous class");
            }
        };

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running...");
            }
        };

        r.run();

        LambdaSample1 lambdaSample2  = () -> {
            System.out.println("Implementation of abstract method in lambda expression");
        };

        lambdaSample2.abstractMethod();

        lambdaSample1.abstractMethod();

//        LambdaSample1.main();
    }

}
