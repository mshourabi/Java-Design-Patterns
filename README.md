# Java Design Patterns
Implement Design Patterns in java.



## 1. Creational Patterns
These patterns concern class and object composition, ensuring that changes in one part do not require altering the entire system.

• Singleton: Ensures that a class has only one instance and provides a global point of access to it.
• Factory Method: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
	• Java Library Example: java.util.Calendar#getInstance()
• Abstract Factory: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
• Builder: Separates the construction of a complex object from its representation, allowing step-by-step construction.
	• Java Library Example: java.lang.StringBuilder#append()
• Prototype: Creates new objects by copying (cloning) an existing instance rather than creating from scratch.
	• Java Library Example: java.lang.Object#clone()


## 2. Structural Patterns
These patterns concern class and object composition, ensuring that changes in one part do not require altering the entire system.

• Adapter: Bridges incompatible interfaces to let them collaborate. Example: java.util.Arrays#asList().
• Bridge: Splits a large or related class hierarchy into separate abstraction and implementation parts.
• Composite: Composes objects into tree structures to treat individual items and compositions uniformly.
• Decorator: Dynamically attaches new behaviors to objects without modifying their structure. Example: java.io.BufferedReader.
• Facade: Offers a simplified interface to a complex subsystem or body of code.
• Flyweight: Shares data among similar objects to reduce memory overhead. Example: java.lang.Integer#valueOf(int).
• Proxy: Supplies a substitute or placeholder to regulate access to another object.


## 3. Behavioral Patterns
These patterns focus on communication and assignment of responsibilities between objects.

• Chain of Responsibility: Relays requests sequentially along a dynamic chain of handlers.
• Command: Turns a request into a standalone, parameterizable object.
• Interpreter: Implements grammar evaluation for specific language contexts.
• Iterator: Sequentially accesses collection elements without exposing internal representation. Example: java.util.Iterator.
• Mediator: Coordinates object communication strictly through a central mediator.
• Memento: Captures and externalizes an object's internal state for later restoration.
• Observer: Sets up a notification subscription for tracking state changes.
• State: Enables an object to modify its behavior dynamically when its state changes.
• Strategy: Encapsulates interchangeable algorithms that can be selected at runtime.
• Template Method: Outlines an algorithm framework in a base class, deferring steps to subclasses.
• Visitor: Separates operations from the object structures they operate on.
