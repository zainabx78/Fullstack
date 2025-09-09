# SOLID principles

## 5 design guidelines in OOP:

- SRP → One class = One job

- OCP → Add features without modifying old code

- LSP → Subclasses should be usable as their parents

- ISP → Many small interfaces > one big one

- DIP → Rely on interfaces, not implementations



1. Single Responsibility Principle (SRP):
   - A class should have only one reason to change.
   - Each class should handle only one responsibility.
   - This makes the code easier to understand, test, and maintain.
   - **Example:** Instead of having a User class that both manages user data and sends emails, split it into a User class and an EmailService.


2. O — Open/Closed Principle (OCP)
   - Software entities should be open for extension but closed for modification.
   - You should be able to add new features without changing existing code.
   - Achieved via inheritance, interfaces, and polymorphism.
   - **Example:** Instead of modifying a Shape class every time you add a new shape, create an interface Shape and let Circle, Square, etc. implement it.
   - E.g. abstraction

3. L — Liskov Substitution Principle (LSP)
   - Objects of a superclass should be replaceable with objects of a subclass without breaking the application.
   - Subclasses must respect the behavior of the parent class.
   - **Example:** If Bird has a fly() method, then Penguin should not inherit from Bird (since penguins don’t fly). That would break expectations.
   - e.g. doing polymorphism correctly. 

4. I — Interface Segregation Principle (ISP)
   - No client should be forced to depend on methods it does not use.
   - Instead of one large, “fat” interface, split it into smaller, more specific ones.
   - **Example:** Instead of an interface IMachine with methods print(), scan(), and fax(), create separate interfaces IPrinter, IScanner, IFax.

5. D — Dependency Inversion Principle (DIP)
   - Depend on abstractions, not on concretions.
   - High-level modules should not depend on low-level modules; both should depend on abstractions (interfaces).
   - **Example:** Instead of a Report class directly creating a PDFExporter, make it depend on an IExporter interface. That way, you can swap in a CSVExporter without changing Report.
   - Decoupling code. 