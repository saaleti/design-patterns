# 🛎️ Command Pattern in Java

## 📌 What is the Command Pattern?

The **Command Pattern** is a behavioral design pattern that turns a **request** into a **standalone object** (Remember?, In portal, we have converted HTTP requests in to Command Objects and queued them in KAFKA).  
This object contains all the information about the request, allowing you to **parameterize methods**, **queue or log requests**, and **support undoable operations**.

Instead of sending a direct request, the Command Pattern **encapsulates the action** inside a command object.

---

## 🚫 The Problem (Without Command Pattern)

Imagine a restaurant where:
- The **waiter** takes your order **and** goes to the kitchen **to cook**.
- If you change your mind, it's chaotic to cancel the order.
- If there are multiple orders, managing them manually becomes messy.

**Tight coupling** between who takes the request and who processes it creates inflexibility.

---

## ✅ The Solution (With Command Pattern)

Separate the roles clearly:

### Participants:
- **Client**: The customer who creates a command.
- **Command**: The order slip encapsulating the action.
- **Invoker**: The waiter who queues and passes the command.
- **Receiver**: The chef who executes the requested action.

You can now **create**, **queue**, **log**, **undo**, and **execute** commands independently!

---

## 🏗️ Structure

```plaintext
Client → Invoker → Command → Receiver

```


## 🏅 Benefits of the Command Pattern

### 1. **Decoupling of Sender and Receiver**
The Command Pattern decouples the sender (invoker) from the receiver (the object that performs the action). The sender doesn't need to know what the receiver is, how it works, or what specific action it performs. It just sends the command to be executed.
This improves flexibility in the system and allows for easier modification without changing the sender code.

### 2. **Support for Undo/Redo Operations**
The Command Pattern makes it easy to implement undo and redo functionality. By keeping a history of commands that have been executed, the system can revert to previous states by calling the undo method on commands.
This is especially useful in applications like text editors, graphics software, or configuration systems.

### 3. **Extensibility**
New commands can be easily added without changing existing code. This follows the **Open/Closed Principle**, which states that the system should be open for extension but closed for modification.
You can extend the set of commands without modifying the existing classes that invoke them.

### 4. **Simplified Complex Operations**
Complex operations that require multiple steps can be encapsulated in a command. This can simplify the calling code and encapsulate the complexity in the command object.
Example: A command could represent a series of actions like saving a file, generating a report, or processing a transaction.

### 5. **Queueing and Scheduling Commands**
The Command Pattern allows commands to be queued, scheduled, or logged for later execution. This can be useful in systems where tasks are deferred or need to be executed in a specific order or at a specific time.
Example: A batch processing system where commands are queued for execution at later times.

### 6. **Composite Commands**
You can combine multiple commands into a single "macro" command. This composite command can execute multiple individual commands as a group, offering a higher level of abstraction.
This is particularly useful when an action in a system requires the execution of multiple smaller actions.

### 7. **Flexible and Reusable Code**
Commands can be reused across different invokers or contexts. This encourages code reusability, as commands can be passed as objects between different parts of the system.
Example: A button click can execute different commands depending on the context.

### 8. **Centralized Control**
The Command Pattern provides centralized control over requests and their execution, making it easier to manage and monitor actions in a system, such as logging, authentication, or permission checking.
Example: All the actions are centralized, and logging or permission checks can be added to the command execution flow without changing the invokers.

##


## 🏅 Summary of SOLID Principles in the Command Pattern

### 1. **Single Responsibility Principle (SRP)**
Each command in the Command Pattern has a **single responsibility**. For example, a `StartACCommand` is responsible solely for starting the air conditioning system, and a `StopACCommand` is responsible solely for stopping it. Each command is focused on one action.

### 2. **Open/Closed Principle (OCP)**
The Command Pattern adheres to the **Open/Closed Principle**, allowing you to **easily extend** the system by adding new commands (new concrete command classes) without modifying the existing code. For example, you can add a `SetFanSpeedCommand` or any other command without changing the existing command invoker or receiver logic.

### 3. **Liskov Substitution Principle (LSP)**
The **Liskov Substitution Principle** is followed, as objects of a superclass can be replaced by objects of a subclass without affecting the correctness of the program. The **Command Interface** is implemented by all concrete commands (e.g., `StartACCommand`, `StopACCommand`), allowing substitution without disrupting the invoker's functionality.

### 4. **Interface Segregation Principle (ISP)**
In the Command Pattern, each command implements the `Command` interface, which only includes the methods necessary for executing and undoing actions (`execute()` and `undo()`). This ensures that clients are not forced to depend on methods they don't use, adhering to the **Interface Segregation Principle**.

### 5. **Dependency Inversion Principle (DIP)**
The **Dependency Inversion Principle** is upheld because the **Invoker** (the high-level module) depends on the **Command Interface** (the abstraction) rather than specific command classes. The command objects (low-level modules) depend on the **AirConditioner** or **Receiver**, but the invoker remains decoupled from them.

##
