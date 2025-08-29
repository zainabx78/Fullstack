
# PROJECT --> HOW IT ALL COMES TOGETHER: ZOO PROJECT

## Overview:

### App.java:

- The entry point containing main method.
- Creates animals --> Lion. 
- Creates staff --> Zookeeper.
- Adds them to an ArrayList<Speakable> zooThings.
- Loops through them and calls talk() on each. 


### Speakable Interface file:

- An interface that enforces the talk () method.
- Implemented by all animals and staff. 


### Animal class file:

- An abstract class --> means that it's implemented by other derived classes. 
- Implements Speakable interface.
- Provides constructor, getters and setters. 
- Leaves talk () abstracted so each animal can implement it differently. 


### Lion subclass file:

- Extends from the Animal file. 
- Provides implementation of talk () e.g. the string the lion will contain. 

### Staff class file:

- Includes fields --> name, dateofEmployment etc.
- Implements Speakable --> default intro speech.


### Zookeeper subclass file:
- Extends from the staff file. 
- Methods --> feedanimals, cleanenclosure etc. 
- Overrides the talk () interface. 


## **🔄 How It All Works Together**
Speakable defines a common contract → everyone must talk().

Animal hierarchy → different animals have different ways of talking.

Staff hierarchy → staff also talk(), but with human messages.

Zookeeper has special methods tied to their role (feeding, cleaning, etc.).

App brings them together into one collection (ArrayList<Speakable>) and runs the zoo simulation.

Tests ensure each class behaves correctly.

## **✅ Summary:**

App.java → Runs everything.

Speakable → Interface (forces talk() on all).

Animal.java → Abstract parent for animals.

Lion/Zebra → Example concrete animals.

Staff.java → Parent for staff roles.

Zookeeper.java → Specialized staff with zoo-related tasks.

Tests → Ensure correctness of methods.



OUTPUT = A zoo with animals , with staff. 
