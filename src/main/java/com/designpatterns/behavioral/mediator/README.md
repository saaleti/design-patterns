# Mediator Pattern in Java

## 📌 What is the Mediator Pattern?

The **Mediator Pattern** is a **behavioral design pattern** that defines an object that centralizes communication between different objects. Instead of objects communicating directly with each other, they send all their messages through the mediator, which facilitates interaction. This pattern reduces the dependencies between objects and promotes loose coupling, making systems easier to manage and extend.

## 🚫 Problem (Without Mediator Pattern)

In a system with many objects that need to communicate, direct communication between every pair of objects can become complex. Each object must know about other objects, which creates tight coupling. This can lead to difficulty in maintaining or extending the system as new functionality is added.

For example, imagine a **group of airplanes** trying to communicate with each other to avoid collisions and manage landing/takeoff schedules. Direct communication between planes would be chaotic and error-prone.

For example, in an **online bidding system**, bidders, auction items, and the auctioneer need to communicate. If each bidder communicates directly with the auctioneer or each other, this would result in complexity. 
This direct communication between all entities would make the system difficult to manage and extend.

## ✅ Solution (With Mediator Pattern)

The **Mediator Pattern** solves this problem by introducing a **mediator** that coordinates communication between objects. In this case, the **control tower** (mediator) manages the communication between **airplanes** and ensures smooth operations like landing and takeoff.

### Components:
1. **Mediator**: Centralizes communication and coordinates interactions.
2. **Colleague**: Objects that need to interact with each other but communicate only through the mediator.

## 🚀 Example: Air Traffic Control System

Imagine an **Air Traffic Control System** where planes communicate with a control tower for permission to land or take off. Instead of communicating directly with each other, the planes send their requests to the control tower (mediator).

