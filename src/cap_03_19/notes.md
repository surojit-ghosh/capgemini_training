# Spring Boot

## `@Controller` vs `@RestController`

| Feature | `@Controller` | `@RestController` |
|---|---|---|
| Return type | View name (`String`) | Any object (JSON, XML, etc.) |
| Use case | Rendering views (`.html`, `.jsp`) | Building RESTful APIs |
| Serialization | Manual (needs `@ResponseBody`) | Automatic |

### Key Points

- **`@RestController`** = `@Controller` + `@ResponseBody`
- **`@ResponseBody`** tells Spring to serialize the return value and write it directly to the HTTP response
- **`@Controller`** is for MVC view rendering only — not for REST APIs

---

## Sending Data to the Server

There are 3 ways to send data to a Spring Boot server:

| Annotation | How Data is Sent | Example |
|---|---|---|
| `@RequestBody` | Inside the request body (JSON) | `POST /users` with JSON payload |
| `@RequestParam` | As query parameters in the URL | `/users?name=John` |
| `@PathVariable` | As part of the URL path | `/users/42` |

> **Note:** `@RequestBody` converts incoming JSON → Java object (deserialization).
> `@ResponseBody` converts Java object → JSON for the response (serialization).

---

## Marshalling vs Unmarshalling

| Term | Meaning | Spring Annotation |
|---|---|---|
| **Marshalling** | Java object → JSON (serialization) | `@ResponseBody` |
| **Unmarshalling** | JSON → Java object (deserialization) | `@RequestBody` |