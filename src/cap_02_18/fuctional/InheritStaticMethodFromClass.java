package cap_02_18.fuctional;

class SampleClass {
    static int staticVariable = 10;

    public static void staticMethod() {
        System.out.println("Static method in SampleClass");
    }
}

public class InheritStaticMethodFromClass extends SampleClass {

    public static void staticMethod() {
        System.out.println("Static method in InheritStaticMethod");
    }

    public static void main(String[] args) {
        int staticVariable = 20; // Local variable with the same name as the static variable
        System.out.println("Local variable: " + staticVariable); // Refers to the local
        System.out.println("Static variable from SampleClass: " + SampleClass.staticVariable); // Refers to the static variable in SampleClass
        staticMethod();
        SampleClass.staticMethod();
    }
}