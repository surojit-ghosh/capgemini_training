package cap_02_18.fuctional;

interface SampleInterface {
    public static void staticMethod() {
        System.out.println("Static method in SampleClass");
    }
}

public class InheritStaticMethodFromInterface implements SampleInterface {
    public static void main(String[] args) { // Refers to the static variable in SampleClass
//        staticMethod();  // ERROR:  because we can use interface for multiple inheritance and there can be same method in multiple interface and the child class will get confused which method to call so this feature is restricted
        SampleClass.staticMethod();
    }
}