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
---
# Spring BeanFactory Hierarchy

## Core Container

    +------------------+
    |    BeanFactory   |
    +------------------+
            |
            |-- XMLBeanFactory (Deprecated)
            |
            v
    +---------------------------------------------+
    | ApplicationContext (Advanced Container)     |
    +---------------------------------------------+
            |
            |---------------------------------------------------|
            |                     |                             |
            v                     v                             v
    +--------------------+  +---------------------------+  +----------------------------------+
    | ClassPathXml       |  | FileSystemXml             |  | AnnotationConfig                 |
    | ApplicationContext |  | ApplicationContext        |  | ApplicationContext               |
    +--------------------+  +---------------------------+  +----------------------------------+

## Explanation

### BeanFactory

-   Basic container provided by Spring.
-   Responsible for instantiating and managing beans.
-   Uses lazy loading by default.

### XMLBeanFactory (Deprecated)

-   Older implementation of BeanFactory.
-   Used XML configuration to define beans.
-   Deprecated in modern Spring versions.

### ApplicationContext

-   Advanced container built on top of BeanFactory.
-   Provides additional features:
    -   Event propagation
    -   Internationalization (i18n)
    -   AOP integration
    -   Easier bean management

### Implementations of ApplicationContext

  ------------------------------------------------------------------------
Implementation                       Description
  ------------------------------------ -----------------------------------
ClassPathXmlApplicationContext       Loads configuration file from the
classpath

FileSystemXmlApplicationContext      Loads configuration file from the
filesystem

AnnotationConfigApplicationContext   Loads configuration using Java
annotations and configuration
classes
  ------------------------------------------------------------------------

We will be using the containers to store beans and we shall create containers using XML configuration and Java-based configuration.

---
How many types of dependency injection are there in spring framework?
Constructor Injection, Setter Injection, Field Injection, and Interface Injection.

How many types of Container are there in spring framework?
There are two types of containers in the spring framework: BeanFactory and ApplicationContext.

- we can config to spring in two ways 
    - XML based configuration
    - Class based configuration