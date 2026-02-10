package cap_18_02.fuctional;

class SampleClass {
    public static void staticMethod() {
        System.out.println("Static method in SampleClass");
    }
}

public class InheritStaticMethod extends SampleClass {

    public static void staticMethod() {
        System.out.println("Static method in InheritStaticMethod");
    }

    public static void main(String[] args) {
        staticMethod();
        SampleClass.staticMethod();
    }
}