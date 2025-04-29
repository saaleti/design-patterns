# Visitor Design Pattern in Java

The **Visitor Design Pattern** is a behavioral design pattern that allows you to add new operations to a group of objects without modifying their classes. It promotes clean separation between data structures and the operations performed on them, enabling better modularity and maintainability.

## 🔍 Why Visitor patten is named so?

The **Visitor Design Pattern** is named after the concept of a "visitor" traveling through a set of objects (like Circle, Square) and performing specific operations (like Area, Perimeter) on each. Just like a guest might visit different rooms in a house and interact with each differently, the visitor "visits" each element and applies behavior that is defined outside of the element's own class. This allows adding new behaviors without modifying the existing object structure.

## 🧱 Key Components

- **Visitor Interface** – Declares a visit method for each type of element.
````java
public interface Visitor {
    void visit(Element element);
}

````
- **Concrete Visitor** – Implements operations for each element type.
````java
public class AreaCalculator implements Visitor {
    @Override
    public void visit(Element element) {
        if (element instanceof Circle circle) {
            System.out.println("Area of Circle is " + (Math.PI * circle.getRadius() * circle.getRadius()));
        }
    }
}

````
- **Element Interface** – Declares an `accept(visitor)` method.
````java
public interface Element {
    void accept(Visitor visitor);
}

````
- **Concrete Elements** – Implement the `accept` method and call back into the visitor.
````java
public class Circle implements Element {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

````

## 🧮 Real-World Example: Shape Area Calculation

Imagine a drawing tool with different shapes like `Circle` and `Rectangle`. Rather than putting area calculation logic inside each shape class, we can use a `AreaCalculator` that performs this logic externally.

This way:
- You can add more operations (like calculating perimeter or exporting shapes) without changing the `Shape` classes.
- The pattern adheres to the **Open/Closed Principle**.

## ✅ Benefits

- Add new operations without modifying existing classes.
- Promotes cleaner and more maintainable code.
- Keeps responsibilities separated.

## ⚠️ Trade-offs

- Adding new element types (like a new shape) requires updating all visitors.
- Slightly more complex due to double dispatch.

## 📖 Reference

See the full example on GeeksforGeeks: [Visitor Design Pattern](https://www.geeksforgeeks.org/visitor-design-pattern/)


# Strategy vs Visitor Design Patterns in Java

Both Strategy and Visitor are behavioral design patterns, but they address different problems in software design. This guide outlines their core differences, use cases, and benefits.

---

## 🎯 Strategy Pattern

**Intent**: Define a family of interchangeable algorithms and let the client choose one at runtime.

### Use Case:
- Switch sorting algorithms dynamically.
- Choose between different payment methods.

### Key Characteristics:
- Client selects the strategy.
- Promotes flexibility by encapsulating behavior.
- Easier to add new algorithms without changing the context.

---

## 🧭 Visitor Pattern

**Intent**: Separate operations from object structures to add new behavior without changing the objects.

### Use Case:
- Add operations like `renderHTML`, `calculateArea`, `exportPDF` to shape or document element structures.

### Key Characteristics:
- Objects accept a visitor which executes the operation.
- Promotes open/closed principle for operations.
- Requires changing visitors when adding new element types.

---

## 🔍 Key Differences

| Feature               | Strategy Pattern                        | Visitor Pattern                              |
|-----------------------|------------------------------------------|----------------------------------------------|
| **Focus**             | Encapsulating interchangeable behaviors | Adding new operations to a stable structure  |
| **Open for Extension**| New algorithms                          | New operations                               |
| **Structure**         | One interface with multiple implementations | Visitor interface with methods per element |
| **Control**           | Client chooses behavior                 | Object accepts visitor                       |
| **Dispatch Type**     | Single dispatch                         | Double dispatch                              |

---

## ✅ When to Use

- Use **Strategy** when you need **dynamic algorithm swapping**.
- Use **Visitor** when you need to **apply multiple operations to a fixed object structure**.

---

Happy coding! 💻
