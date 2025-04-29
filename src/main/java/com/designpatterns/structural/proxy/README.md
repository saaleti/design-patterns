# Proxy Design Pattern

The **Proxy Design Pattern** is a structural design pattern that provides a surrogate or placeholder for another object to control access to it. It is often used to add additional functionality such as access control, lazy loading, logging, or remote access, without modifying the real object.

---

## 💡 Use Cases

- **Virtual Proxy**: Load heavy objects (e.g., images) only when needed.
- **Security Proxy**: Restrict access based on user roles or permissions.
- **Remote Proxy**: Represent an object in a different address space (used in RMI).
- **Logging Proxy**: Log requests made to an object.

---

## ✅ Example: Access Control Proxy

### `Internet` Interface
```java
public interface Internet {
    void connectTo(String site);
}
```