### Agenda
1. JDBC
2. Architecture of JDBC
3. Drive Manager and Driver
4. Connection step(Sample Grid)

### JDBC (Java Database Connectivity)
- JDBC is a Java API that allows Java applications to interact with databases
- It provides a standard set of interfaces and classes for connecting to databases, executing SQL queries, and processing the results
- JDBC is part of the Java Standard Edition (Java SE) platform and is included in the Java Development Kit (JDK)
- JDBC is designed to be database-agnostic, meaning that it can work with any database that has a JDBC driver, allowing developers to write database code that is portable across different database systems
- JDBC provides a way to connect to databases, execute SQL statements, and retrieve results in a standardized way, making it easier for developers to work with databases in Java applications


#### JDBC API Components
1. **DriverManager**
2. **Connection**
3. **Statement**
4. **ResultSet**
5. **PreparedStatement**

### Interfaces and Classes in JDBC
1. **Connection [I]**: createStatement(), prepareStatement()
2. **Statement [I]**: executeQuery(), executeUpdate(), execute()
3. **PreparedStatement [I]**: executeQuery(), executeUpdate(), setString(), setInt(), etc.
4. **ResultSet [I]**: next(), getString(), getInt(), getDouble(), etc.
5. **DriverManager [C]**: getConnection()

- `Connection` is the return type of  `getConnection()` method.

#### Steps to Connect to a Database using JDBC
1. Load & Register the JDBC Driver
2. getConnection() method of DriverManager class
3. Create a Statement or PreparedStatement object
4. Execute SQL query using executeQuery() or executeUpdate() method
5. Process the ResultSet (if applicable)
6. Close the Connection, Statement, and ResultSet objects to free up resources