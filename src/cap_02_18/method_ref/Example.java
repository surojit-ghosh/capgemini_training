package cap_02_18.method_ref;

class SampleClass {
    SampleClass(){
        System.out.println("From Constructor");
    }
    public static void staticMethod() {
        System.out.println("Static method in SampleClass");
    }
}

interface SampleInterface {
    void callStaticMethod();

}

public class Example {
    public static void main(String[] args) {
        SampleInterface sampleInterface = SampleClass::staticMethod;
        SampleInterface sampleInterface1 = SampleClass::new;

        sampleInterface1.callStaticMethod();

//        sampleInterface.callStaticMethod();
    }

}
