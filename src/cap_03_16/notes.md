# Spring & Spring MVC Notes

---

## 1. Spring Core — Bean Annotations

### `@Bean`
- Placed on a **method** inside a `@Configuration` class.
- Tells Spring to manage the return value of that method as a bean.
- **Use when:** explicitly configuring a bean with specific properties, or when the class cannot be annotated directly (e.g., third-party libraries).

### `@Component`
- Placed on a **class**.
- Marks the class for automatic detection via Spring's **component scanning**.
- **Use when:** you own the class and want it auto-registered without manual configuration.

| | `@Bean` | `@Component` |
|---|---|---|
| Placed on | Method | Class |
| Registration | Explicit (config class) | Automatic (component scan) |
| Best for | Third-party / complex setup | Your own classes |

---

## 2. Spring MVC

### Overview
Spring MVC is a web framework built on the **Model-View-Controller** design pattern. It separates an application into three distinct layers:

| Layer | Role |
|---|---|
| **Model** | Represents application data (POJOs, DB entities) |
| **View** | Renders the UI (JSP, Thymeleaf, FreeMarker, etc.) |
| **Controller** | Handles requests, applies business logic, returns a view |

**Key features:**
- Flexible configuration
- Data binding & validation
- Built-in support for RESTful web services

---

## 3. Front Controller Design Pattern

- A **single controller** intercepts *all* incoming requests and routes them to the correct handler or view.
- Centralises cross-cutting concerns: authentication, logging, error handling.
- Result: cleaner separation of concerns and easier maintenance.

---

## 4. DispatcherServlet

> Spring MVC's implementation of the Front Controller pattern.

**Responsibilities:**
1. Receives every incoming HTTP request.
2. Dispatches it to the appropriate **Controller** based on URL mapping.
3. The controller processes the request and interacts with the **Model**.
4. Returns the resolved **View** (rendered response) to the client.

**Additional features provided:**
- Request mapping
- View resolution
- Exception handling

### Request Lifecycle

```
                               ┌───────────────────┐
                               │  Handler Mapping  │
                               └────────┬──────────┘
                                   ▲    │ (resolves which controller to use)
                                   │    ▼
┌─────────┐  Req  ┌────────────────┴────────────┐  DTO  ┌────────────┐  DTO  ┌─────────┐  Req  ┌────────────┐
│         │ ────► │                             │ ────► │            │ ────► │         │ ────► │            │
│ Browser │       │      DispatcherServlet      │       │ Controller │       │ Service │       │ Repository │──► DB
│         │ ◄──── │                             │ ◄──── │            │ ◄──── │         │ ◄──── │            │
└─────────┘  Resp └──────────────┬──────────────┘  DTO  └────────────┘  DTO  └─────────┘  Resp └────────────┘
                            ▲    │
                            │    ▼
                     ┌──────┴─┐ ┌────────────────┐
                     │  View  │ │  View Resolver │
                     └────────┘ └────────────────┘
```

**Step-by-step flow:**
1. **Browser** sends an HTTP request to the `DispatcherServlet`.
2. **Handler Mapping** tells the `DispatcherServlet` which Controller handles the request.
3. **DispatcherServlet** forwards the request to the appropriate **Controller**.
4. **Controller** maps the request data into a **DTO** and passes it to the **Service** layer.
5. **Service** processes the DTO and interacts with the **Repository** to read/write data from the **DB**.
6. Response travels back as a **DTO**: `Repository → Service → Controller → DispatcherServlet`.
7. **View Resolver** determines which View template to use.
8. **View** is rendered and the final HTML response is sent back to the **Browser**.

---

## 5. DTO (Data Transfer Object)

- A **DTO** is a simple object used to carry data between layers of the application.
- It contains only fields and getters/setters — **no business logic**.
- Used between the **Controller ↔ Service** layers to decouple the internal domain model from what is exposed to/received from the client.

**Why use DTOs?**
- Prevents exposing internal entity/model structure directly to the client.
- Allows shaping the data (include/exclude fields) per use case.
- Improves security and maintainability.

```
Client  ──► Controller (maps to DTO) ──► Service (uses DTO) ──► Repository (maps to Entity) ──► DB
```

---

## 6. JSP (Java Server Pages)

- A server-side technology for rendering **dynamic web content**.
- Allows embedding Java code directly into HTML pages.
- The server processes the JSP and sends fully rendered HTML to the client.

---

## 6. Rendering Approaches

### Server-Side Rendering (SSR)
- The **complete HTML** is generated on the server before being sent to the client.
- JSP is an example of SSR.

### Client-Side Rendering (CSR)
- The browser receives raw data from the server and generates HTML using **JavaScript**.
- Can lead to faster subsequent interactions and a more dynamic UX.
- Trade-off: more complex client-side code and potentially slower initial load.

| | SSR | CSR |
|---|---|---|
| HTML generated by | Server | Browser (JS) |
| Initial load | Slower | Faster |
| Complexity | Server-side | Client-side |
| Example | JSP, Thymeleaf | React, Angular |

---

## 7. Servlet

- A **Java class** responsible for handling HTTP requests and producing HTTP responses.
- The foundational building block of Java web applications.
- Spring MVC's `DispatcherServlet` is itself a servlet.

---

## 8. Traditional Servlet vs Spring MVC

| | Traditional Servlet | Spring MVC |
|---|---|---|
| Servlet per request? | ✅ Yes — each URL needs its own servlet class | ❌ No — one `DispatcherServlet` handles all |
| Boilerplate | High | Low |
| Scalability | Hard to manage as app grows | Clean and maintainable |

- **Traditional Servlet:** every URL must map to a dedicated servlet class — leading to an explosion of servlet classes as the app grows.
- **Spring MVC:** a single `DispatcherServlet` receives all requests and delegates them to the right controller, eliminating the need for multiple servlet classes.

---

## 9. Apache Tomcat

- Apache Tomcat is a **web server and servlet container** used to run Java web applications.
- It implements the Java Servlet and JSP specifications, making it capable of executing servlet classes and rendering JSP pages.
- Spring MVC applications are deployed on Tomcat, which listens for incoming HTTP requests and forwards them to the `DispatcherServlet`.

### How it fits in the stack

````
Client (Browser)
       │  HTTP Request
       ▼
 Apache Tomcat (servlet container)
       │
       ▼
 DispatcherServlet  ──►  (see §4 for full request lifecycle)
```

> **Note:** Spring Boot embeds Tomcat by default, so no separate installation is needed when using Spring Boot.

---