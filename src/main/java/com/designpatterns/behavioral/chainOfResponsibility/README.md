# Chain of Responsibility Pattern

The **Chain of Responsibility** pattern allows multiple handlers to process a request, with each handler either processing it or passing it along the chain. It’s useful in scenarios where requests need to be handled by a series of objects.

## Key Elements:
- **Handler**: Defines the `handleRequest` method and the next handler.
- **Concrete Handler**: Implements the handling logic for specific requests.
- **Request**: The input that is processed through the chain.
- **Client**: Initiates the request.

## ATM Example:
This example demonstrates a chain of handlers for an ATM withdrawal:
- **$100 Handler**
- **$50 Handler**
- **$20 Handler**

The client requests a withdrawal, and the handlers process the request based on bill denominations.

### Code Example:

```java
public abstract class WithDrawlRequestHandler {

    public abstract WithDrawlRequestHandler getNextHandler();
    public void handleRequest(WithDrawlRequest request, WithDrawlResponse response){
        if(getNextHandler() != null) {
            getNextHandler().handleRequest(request, response);
        }
    }
}

```

```java
@Slf4j
public class WithDrawlRequestHandlerFor2000Notes extends WithDrawlRequestHandler {

    @Override
    public WithDrawlRequestHandler getNextHandler() {
        return new WithDrawlRequestHandlerFor1000Notes();
    }

    @Override
    public void handleRequest(WithDrawlRequest request, WithDrawlResponse response) {
        log.info("Inside handleRequest method");
        if (request.getRemainingAmountToWithDraw() >= 2000) {
            response.setNoOf2000Notes(request.getRemainingAmountToWithDraw() / 2000);
            request.setRemainingAmountToWithDraw(request.getRemainingAmountToWithDraw() % 2000);
        }
        if(request.getRemainingAmountToWithDraw() > 0) {
            log.info("Skipping the calling of super.handleRequest");
            super.handleRequest(request, response);
        }
    }
}
```

## 📌 Use Cases Beyond ATM

The Chain of Responsibility pattern is versatile and widely applicable in real-world software systems. Below are some common scenarios:

### 1. 🖱️ Event Handling
Used in GUI frameworks to pass user events (like mouse clicks or key presses) through a series of potential handlers.

### 2. 📋 Logging
Log messages can be passed through a chain of loggers to handle different severity levels (DEBUG, INFO, ERROR).

### 3. 🌐 Middleware in Web Frameworks
HTTP requests are processed step-by-step by middleware functions such as authentication, logging, validation, etc.

### 4. ✅ Process Workflows
Approval systems route tasks or documents through multiple stages of review or authorization.

---

## ✅ Benefits

- **Loose Coupling**: Decouples request senders and receivers.
- **Extensibility**: Easily add new handlers without changing existing code.
- **Modular Code**: Keeps logic organized, clean, and easier to maintain.

