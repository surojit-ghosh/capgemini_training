### Agenda for 05-03-2026

---
### Mapping in Hibernate
- Unidirectional : In a unidirectional mapping, one entity has a reference to another entity, but the other entity does not have a reference back to the first entity. For example, if you have an `Employee` entity that has a reference to a `Department` entity, but the `Department` entity does not have a reference back to the `Employee`, this would be a unidirectional mapping.


- Bidirectional : In a bidirectional mapping, both entities have references to each other. For example, if you have an `Employee` entity that has a reference to a `Department` entity, and the `Department` entity also has a reference back to the `Employee`, this would be a bidirectional mapping. This allows for easier navigation between the entities and can be useful in certain scenarios where you need to access related data from both sides of the relationship.

Query Language: JPQL (Java Persistence Query Language) is a query language used in Java Persistence API (JPA) to perform database operations on entities. It is similar to SQL but operates on the entity objects rather than directly on the database tables. JPQL allows you to write queries that are independent of the underlying database, making it easier to switch between different database systems without changing your query code. It supports various operations such as selecting, updating, and deleting entities, as well as performing joins and aggregations.
Example of a JPQL query:
```
java
String jpql = "SELECT e FROM Employee e WHERE e.department = :dept";
TypedQuery<Employee> query = entityManager.createQuery(jpql, Employee.class);
query.setParameter("dept", "Sales");
List<Employee> employees = query.getResultList();
```

---
### Ownership Table:

In the context of database relationships, an ownership table is a table that represents the relationship between two entities. It is used to manage the association between the entities and typically contains foreign keys that reference the primary keys of the related entities.
Ownership table always have foreign key. In a bidirectional relationship, the owning side is the entity that contains the foreign key. The non-owning side is the entity that does not contain the foreign key. The owning side is responsible for managing the relationship and updating the foreign key when necessary. In a unidirectional relationship, there is only one side that contains the foreign key, and it is considered the owning side.


### Members Table:

In a database, a members table is a table that contains information about the members of a particular group or organization. It typically includes fields such as member ID, name, contact information, and any other relevant details about the members. The members table can be used to store and manage information about individuals who are part of a specific group or organization, such as employees in a company, students in a school, or customers in a business.

---
### Association:
An association is a relationship between two or more entities in a database. It represents how the entities are related to each other and can be categorized into different types, such as one-to-one, one-to-many, and many-to-many.

Associations are typically implemented using foreign keys in the database tables to establish the connection between the related entities.

In global scope we have two types of association: unidirectional and bidirectional. In a unidirectional association, one entity has a reference to another entity, but the other entity does not have a reference back to the first entity. In a bidirectional association, both entities have references to each other, allowing for easier navigation between the entities. Associations are an important aspect of database design and are used to model real-world relationships between entities in a structured manner.

---
### Contained Object and Container Object:
- Contained Object: A contained object is an object that is contained within another object. It is typically a part of the larger object and is dependent on it for its existence. For example, in a class representing a car, the engine can be considered a contained object because it is a part of the car and cannot exist independently.
- Container Object: A container object is an object that contains other objects. It is responsible for managing the contained objects and providing access to them. For example, in a class representing a car, the car itself can be considered a container object because it contains various components such as the engine, wheels, and seats.

---
### Composition and Aggregation:
Composition and aggregation are two types of relationships between objects in object-oriented programming.

- Composition: Composition is a strong relationship where one object is composed of one or more other objects. The contained objects are typically created and destroyed along with the container object. For example, a car is composed of an engine, wheels, and seats. If the car is destroyed, the engine, wheels, and seats are also destroyed.

- Aggregation: Aggregation is a weaker relationship where one object is associated with one or more other objects, but the contained objects can exist independently of the container object. For example, a university is associated with multiple departments, but the departments can exist independently of the university. If the university is destroyed, the departments can still exist.

---

### Example:

- One to One Mapping example: One employee can have one department entity (one-to-one relationship).

- One to Many Mapping example: One employee can have multiple phone numbers (one-to-many relationship)

- One to One Unidirectional example: Employee has a reference to Department, but Department does not have a reference back to Employee.

- One to One Bidirectional example: Employee has a reference to ComputerID, and ComputerID has a reference back to Employee.

- Many to many example: An employee can have multiple projects, and a project can have multiple employees working on it (many-to-many relationship).

---

### JPQL vs SQL:
- JPQL (Java Persistence Query Language) is a query language used in Java Persistence API (JPA) to perform database operations on entities. It operates on the entity objects rather than directly on the database tables. JPQL allows you to write queries that are independent of the underlying database, making it easier to switch between different database systems without changing your query code. It supports various operations such as selecting, updating, and deleting entities, as well as performing joins and aggregations.
- SQL (Structured Query Language) is a standard language used for managing and manipulating relational databases. It operates directly on the database tables and is specific to the database system being used. SQL allows you to perform various operations such as creating, updating, and deleting tables, as well as querying data using SELECT statements. SQL is widely used in database management systems and is essential for working with relational databases.
- HQL (Hibernate Query Language) is a query language used in the Hibernate framework to perform database operations on entities. It is similar to JPQL but is specific to Hibernate and provides additional features and capabilities for working with Hibernate entities. HQL allows you to write queries that are independent of the underlying database, making it easier to switch between different database systems without changing your query code. It supports various operations such as selecting, updating, and deleting entities, as well as performing joins and aggregations.

Syntax of JPQL:
```
SELECT e FROM Employee e WHERE e.department = :dept
```
Syntax of SQL:
```
SELECT * FROM Employee WHERE department = 'Sales'
```
Syntax of HQL:
```
FROM Employee e WHERE e.department = :dept
```

Hibernate can have cache but JDBC does not have cache. Hibernate provides a caching mechanism that allows you to store frequently accessed data in memory, which can improve performance by reducing the number of database queries. JDBC, on the other hand, does not have built-in caching capabilities and relies on the underlying database for data retrieval. Caching in Hibernate can be configured at different levels, such as first-level cache (session cache) and second-level cache (shared cache), to optimize data access and improve application performance.
1st Level Cache: The first-level cache, also known as the session cache, is a cache that is associated with a specific Hibernate session. It stores entities that have been loaded or saved within that session. The first-level cache is automatically enabled and is used to optimize database access by reducing the number of queries executed for the same entity within a session. 
2nd Level Cache: The second-level cache, also known as the shared cache, is a cache that is shared across multiple Hibernate sessions. It allows you to store entities that can be accessed by multiple sessions, improving performance by reducing the number of database queries for frequently accessed data. The second-level cache is optional and can be configured using various caching providers such as Ehcache or Infinispan.

