## CODE SMELLS

- Refactoring = modifying code without changing the behaviour of it. 
- Only refactor when code is under test. Don't over refactor. 
- Get code working first , refactor after.
- Just left click and refactor --> changes the code everywhere e.g. for a variable or method name.

Dispensibles:

- Dead code
- Unused code
- duplicate code

Bloaters --> code, method and classes that have built up over time. 


## Code smells:

- Inappropriate names --> names should explain what's happening in the code. e.g. no x, should be what the actual code is doing. 
- Dead code --> code that isn't being used. 
- Duplicate code. 
- Long methods --> keep methods small 2-20 lines --> Can use refactoring --> extract method:
  - highlight extra tasks in method (method should only do one thing not multiple) and then refactor --> generate method and it'll put extra code in a different method.