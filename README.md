# Java Design Patterns

A collection of **Design Patterns implemented in Java**, based on the classic **Gang of Four (GoF)** design patterns.

The project contains Java implementations and examples of the three main categories of design patterns:

* Creational Patterns
* Structural Patterns
* Behavioral Patterns

---

## 1. Creational Patterns

Creational patterns focus on **object creation mechanisms**, providing flexible ways to create objects while reducing dependencies on specific concrete classes.

### Singleton

Ensures that a class has only one instance and provides a global point of access to it.

### Factory Method

Defines an interface for creating an object, but lets subclasses decide which concrete type of object will be created.

**Java Library Example:**

`java.util.Calendar#getInstance()`

### Abstract Factory

Provides an interface for creating **families of related or dependent objects** without specifying their concrete classes.

### Builder

Separates the construction of a complex object from its representation, allowing the object to be constructed step by step.

**Java Library Example:**

`java.lang.StringBuilder#append()`

### Prototype

Creates new objects by **copying an existing instance** instead of creating a new object from scratch.

**Java Library Example:**

`java.lang.Object#clone()`

---

## 2. Structural Patterns

Structural patterns focus on **how classes and objects are composed** to form larger structures while keeping the system flexible and maintainable.

### Adapter

Converts the interface of one class into another interface expected by the client, allowing otherwise incompatible classes to work together.

**Java Library Example:**

`java.util.Arrays#asList()`

### Bridge

Separates an abstraction from its implementation so that both can evolve independently.

### Composite

Composes objects into **tree structures** and allows individual objects and compositions of objects to be treated uniformly.

### Decorator

Dynamically adds new behavior or responsibilities to an object without modifying its underlying structure.

**Java Library Example:**

`java.io.BufferedReader`

### Facade

Provides a simplified interface to a complex subsystem, making the subsystem easier to use.

### Flyweight

Shares common data between similar objects to reduce memory consumption and improve resource efficiency.

**Java Library Example:**

`java.lang.Integer#valueOf(int)`

### Proxy

Provides a substitute or placeholder for another object and can be used to control or regulate access to that object.

---

## 3. Behavioral Patterns

Behavioral patterns focus on **communication between objects and the assignment of responsibilities** among them.

### Chain of Responsibility

Passes a request through a sequence of handlers until one of them handles the request.

### Command

Encapsulates a request as an object, allowing it to be parameterized, stored, queued, or executed later.

### Interpreter

Defines a representation for a grammar and provides an interpreter for evaluating sentences in that language.

### Iterator

Provides sequential access to the elements of a collection without exposing its underlying representation.

**Java Library Example:**

`java.util.Iterator`

### Mediator

Encapsulates how a set of objects interact by introducing a central mediator that manages their communication.

### Memento

Captures and externalizes an object's internal state so that it can be restored later without violating encapsulation.

### Observer

Defines a subscription mechanism that allows objects to be notified when the state of another object changes.

### State

Allows an object to change its behavior when its internal state changes.

### Strategy

Encapsulates a family of interchangeable algorithms and allows the appropriate algorithm to be selected at runtime.

### Template Method

Defines the skeleton of an algorithm in a base class while allowing subclasses to override specific steps without changing the overall algorithm structure.

### Visitor

Separates an operation from the object structure on which it operates, allowing new operations to be added without modifying the classes of the objects being visited.

---

## Pattern Categories

| Category       | Patterns                                                                                                                        |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------- |
| **Creational** | Singleton, Factory Method, Abstract Factory, Builder, Prototype                                                                 |
| **Structural** | Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy                                                                 |
| **Behavioral** | Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor |

---

## Goal

The goal of this project is to provide **simple and practical Java implementations** of the classic GoF Design Patterns, making it easier to understand their structure, purpose, and typical use cases.

Each pattern can be studied independently and used as a reference for learning **Object-Oriented Design** and **Software Design Principles**.

</div>
