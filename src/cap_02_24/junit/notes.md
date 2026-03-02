### JUnit 
- JUnit is a popular testing framework for Java that allows developers to write and run tests for their code
- unit testing is testing a single unit of code, such as a method or class, in isolation from the rest of the application
- framework testing: testing the framework itself, such as JUnit, to ensure that it is working correctly
- **JAR File**: Java ARchive file, a package file format used to aggregate many Java class files and associated metadata and resources into one file for distribution
- JAR file will have only all the compiled classes and resources, but not the source code
- **WAR File**: Web Application Archive file, a package file format used to distribute a collection of JavaServer Pages, servlets, Java classes, XML files, tag libraries, and static web pages (HTML and related files) that together constitute a web application
- **Mock Unit Testing**: a testing technique where you create mock objects to simulate the behavior of real objects in a controlled way, allowing you to test the functionality of a unit of code without relying on external dependencies
- **Annotations**: special markers in Java that provide metadata about the code, such as @Test, @Before, @After, etc., which are used in JUnit to indicate test methods and setup/teardown methods
- **Library**: a collection of precompiled classes and resources that can be used by other programs, such as JUnit, which provides a library of classes for writing and running tests
- **Framework**: a set of tools and libraries that provide a structure for developing software applications, such as JUnit, which provides a framework for writing and running tests
- **Library vs Framework**: a library is a collection of precompiled classes and resources that can be used by other programs, while a framework provides a structure for developing software applications and often includes a library of classes and resources
- for each test case the code creates a new object.
--- 
### Maven
- Maven is a build automation tool used primarily for Java projects
- To use foreign libraries in a Java project, you can use Maven to manage dependencies and automatically download the required JAR files from a central repository
- To convert our code into a jar file, we will use plugins in Maven, such as the maven-jar-plugin, which allows us to package our compiled classes and resources into a JAR file
- Plugins are required in the build and deployment phase.

#### Steps To Create Maven Project
1. Open Eclipse IDE and select "File" > "New" > "Maven Project"
2. In the "New Maven Project" dialog, select "Create a simple project (skip archetype selection)" and click "Next"
3. Select Archetype: "maven-archetype-quickstart" and click "Next"
4. Enter Group Id (e.g., com.example), Artifact Id (e.g., my-app), and Version (e.g., 1.0-SNAPSHOT) and click "Finish"

#### Folder Structure of a Maven Project
- All the logic goes in the src/main/java folder, and all the test cases go in the src/test/java folder. This is the standard directory structure for a Maven project.
- JRE System Library: This is the Java Runtime Environment (JRE) that provides the necessary libraries and resources to run Java applications. It includes the core Java classes and APIs that are required for Java development.
- Maven Dependencies: These are the external libraries and dependencies that your project requires. Maven manages these dependencies and automatically downloads them from a central repository when you build your project. You can specify the dependencies in the pom.xml file, and Maven will handle the rest.
- target folder: This is the default output directory for compiled classes and resources in a Maven project. When you build your project, Maven compiles your source code and places the compiled classes and resources in the target folder. This folder is typically not included in version control systems, as it is generated during the build process.
- pom.xml: project object model (pom) file is  the core of a Maven Projects. It is an XML file that contains information about the project and configuration details used by Maven to build the project. The pom.xml file includes information such as the project name, version, dependencies, build plugins, and other configuration settings that are necessary for building and managing the project. It serves as a central point of configuration for the Maven build process.

#### Annotations in JUnit
- @Test: This annotation is used to indicate that a method is a test method. It
- @BeforeEach: This annotation is used to indicate that a method should be executed before each test method in the class. It is typically used for setup tasks that need to be performed before each test, such as initializing objects or setting up test data.
- @RepeatedTest: This annotation is used to indicate that a test method should be executed multiple times. It allows you to specify the number of repetitions for the test method, which can be useful for testing code that may have non-deterministic behavior or for running the same test with different inputs.
- @ParameterizedTest: This annotation is used to indicate that a test method should be executed with different sets of parameters. It allows you to specify a source of parameters, such as a method or a CSV file, and the test method will be executed once for each set of parameters provided by the source. This is useful for testing code that needs to be tested with multiple input values or configurations.
- @ValueSource: This annotation is used in conjunction with @ParameterizedTest to provide a source of parameters for the test method. It allows you to specify an array of values that will be passed as arguments to the test method during each execution. This is useful for testing code that needs to be tested with a specific set of input values.
- @AfterEach: This annotation is used to indicate that a method should be executed after each test method in the class. It is typically used for cleanup tasks that need to be performed after each test, such as releasing resources or resetting test data.
- @MethodSource: This annotation is used in conjunction with @ParameterizedTest to provide a source of parameters for the test method. It allows you to specify a method that will generate the parameters for the test method. The specified method should return a Stream, Collection, Iterable, or an array of arguments that will be passed to the test method during each execution. This is useful for testing code that needs to be tested with dynamically generated input values or configurations.
- @CsvSource: This annotation is used in conjunction with @ParameterizedTest to provide a source of parameters for the test method. It allows you to specify a comma-separated list of values that will be passed as arguments to the test method during each execution. Each line in the list represents a set of parameters for a single execution of the test method. This is useful for testing code that needs to be tested with multiple sets of input values or configurations in a concise and readable format.
- @CsvFileSource: This annotation is used in conjunction with @ParameterizedTest to provide a source of parameters for the test method. It allows you to specify a CSV file that contains the parameters for the test method. Each line in the CSV file represents a set of parameters for a single execution of the test method. This is useful for testing code that needs to be tested with multiple sets of input values or configurations stored in an external file, making it easier to manage and maintain test data.
- @AfterAll: This annotation is used to indicate that a method should be executed after all test methods in the class have been executed. It is typically used for cleanup tasks that need to be performed after all tests have been run, such as releasing shared resources or performing final assertions.
- @BeforeAll: This annotation is used to indicate that a method should be executed before all test methods in the class are executed. It is typically used for setup tasks that need to be performed once before any tests are run, such as initializing shared resources or performing initial assertions.
- @NullSource: This annotation is used in conjunction with @ParameterizedTest to provide a source of parameters for the test method. It allows you to specify that null values should be included as parameters for the test method during each execution. This is useful for testing code that needs to handle null input values or configurations.
- @EmptySource: This annotation is used in conjunction with @ParameterizedTest to provide a source of parameters for the test method. It allows you to specify that empty values (such as an empty string or an empty collection) should be included as parameters for the test method during each execution. This is useful for testing code that needs to handle empty input values or configurations.