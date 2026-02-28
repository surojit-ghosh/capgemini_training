### Hibernate
- Hibernate is a ORM tool/frameework that is used to map Java objects to database tables and vice versa. It provides a way to interact with databases using Java objects, allowing developers to work with databases in an object-oriented manner.
- Collection Pooling: Hibernate provides a feature called collection pooling, which allows you to reuse collections of objects that are frequently accessed in your application. This can help improve performance by reducing the number of database queries and object creations.
- In hibernate @Entity annotation will map the class to a database table
```java
@Entity
public class User {
    int id;
    String name;
    String email;
}
```
- Alternative: Ibatis, MyBatis;
- Hibernate uses JDBC internally to save the data into the database

#### Important API components of Hibernate
1. **EntityManagerFactory / SessionFactory**: This is the main entry point for working with Hibernate. It is responsible for creating and managing EntityManager instances, which are used to interact with the database.
2. **EntityManager / Session**: This is the primary interface for interacting with the database in Hibernate. It provides methods for performing CRUD (Create, Read, Update, Delete) operations on entities, as well as managing transactions and executing queries.
3. **Entity / Transient**: An entity is a Java class that is mapped to a database table. It represents a persistent object that can be stored in the database. A transient object, on the other hand, is an instance of an entity class that has not yet been persisted to the database.
4. **Persistence / Configuration**: This is the process of saving an entity to the database. When an entity is persisted, it is assigned a unique identifier (primary key) and stored in the corresponding database table.

#### Hibernate JPA vs Hibernate Core:
- Hibernate JPA is a specification that defines a standard set of APIs for working with databases in Java applications. It provides a standardized way to interact with databases using Java objects, and it is implemented by various ORM frameworks, including Hibernate Core.
- Hibernate Core, on the other hand, is the actual implementation of the Hibernate framework.

#### JPA (Java Persistence API)
- Hibertenate, Ibatis, MyBatis
- **Annotations in JPA**:


- persistance.xml: 