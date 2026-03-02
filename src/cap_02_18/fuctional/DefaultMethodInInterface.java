package cap_02_18.fuctional;

interface SampleInterface2 {
    public default void defaultMethod() {
        System.out.println("Default method in SampleInterface");
    }
}

interface AnotherInterface {
    public default void defaultMethod() {
        System.out.println("Default method in AnotherInterface");
    }
}

interface InterfaceWithFunctionCall{
    public default void callDefaultMethod() {
//        defaultMethod(); // Calls the default method from AnotherInterface
    }

    public default void defaultMethod() {
        System.out.println("Default method in InterfaceWithFunctionCall");
    }
}

class ImplementingClass implements SampleInterface2, AnotherInterface {
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in ImplementingClass");
    }
}



public class DefaultMethodInInterface {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.defaultMethod(); // Calls the overridden method in ImplementingClass
    }
}