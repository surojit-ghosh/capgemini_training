### Lambda Expressions

- we can declare main `main()` method inside interface just like another function
- Anonymous class: here we declare and instantiate a class at the same time, without giving it a name.
```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running...");
    }
};

r.run(); // Output: Running...
```
- lambda function cant declare one method
- lambda function with arguments:
```java
InterfaceName instance = (arg1, arg2) -> {
    int result = arg1 + arg2;
    return result;
};
```
- lambda function can be only used with functional interface and anonymous class can be used with any interface, class or abstract class.


