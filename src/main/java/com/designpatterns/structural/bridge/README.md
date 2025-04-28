# 🌉 Bridge Pattern in Java

## 📌 What is the Bridge Pattern?

The **Bridge Pattern** is a structural design pattern that lets you **decouple an abstraction from its implementation**, so that both can vary independently.

Instead of having one large class hierarchy that combines both abstraction and implementation, the Bridge pattern suggests **splitting it into two hierarchies**:
- **Abstraction** (e.g., Shapes, Remotes)
- **Implementation** (e.g., Drawing APIs, Devices)

---

## 🚫 The Problem (Without Bridge Pattern)

Imagine you're building a drawing tool that supports different shapes and rendering technologies:

You might end up with classes like:
- `CircleWithOpenGL`
- `CircleWithDirectX`
- `SquareWithOpenGL`
- `SquareWithDirectX`

This results in a **class explosion** as new shapes and rendering technologies are added.

---

## ✅ The Solution (With Bridge Pattern)

Separate the shape and the rendering engine:

### Shape Hierarchy (Abstraction):
- `Shape`
    - `Circle`
    - `Square`

### Renderer Hierarchy (Implementation):
- `Renderer`
    - `OpenGLRenderer`
    - `DirectXRenderer`

You can now **combine them dynamically**:

```java
Renderer renderer = new OpenGLRenderer();
Shape circle = new Circle(renderer);
circle.draw();
