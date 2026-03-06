### Spring
- Spring is a lightweight framework
- there are 20 modules in spring framework

Spring Core/IOC -> Spring MVC -> Spring Rest -> Spring Boot -> Spring Boot + Data JPA  -> Spring Security -> Spring Cloud

- it consists of interfaces, abstract classes and implementation classes
- the main intention behind developers using spring framework is to develop web applications and microservices
- the first product of spring framework was Spring Core/IOC
- Through spring core/IOC we may not be able to develop anything but console based app. But as the name suggests it suggests the interface, abstract class and implementation class.
- Spring framework is designed to use a software development principal called as Inversion of Control (IOC) or Dependency Injection (DI) which says the framework itself will decide how the control of the program will flow through the program and how the objects will be created and how the objects will be injected into other objects. it also recommends using design pattern  n like dependency injection pattern to achieve the inversion of control.
- IOC and spring core is the first product that brings everything to its implementations.
- dependency injection is not the only way to achieve inversion of control.
- there are other design patterns such as service locator pattern, factory pattern, strategy pattern etc. that can be used to achieve inversion of control.
- As inversion of control is achieved through dependency injection and to achieve both of them we need inversion of control container
- IOC container is just an intelligently written code which created the required objects before its being used inside the application and these objects are supposed to be called as beans.
- IOC container/Spring container is suppose to call container because it stores all the beans in some data structure