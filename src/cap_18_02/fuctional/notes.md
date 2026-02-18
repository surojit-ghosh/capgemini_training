### Functional Programming

- default method in interface:
    - allows us to add new methods to interfaces without breaking existing implementations.
    - This is useful for functional interfaces, which are interfaces with a single abstract method (SAM). 
    - default cant be used in classes, only in interfaces.
- call parent interface default method:
    - use `InterfaceName.super.methodName()` to call the default method from the parent interface.
