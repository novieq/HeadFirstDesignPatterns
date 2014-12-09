Head First Design Patterns
=====================
Strategy Pattern
---------------------
1. Coded the client, the abstract duck class. The swim behavior is constant and all ducks can swim.
2. The display behavior is overridden by each class implementing the duck abstract class.
3. The fly behavior and the quack behavior are changing and are removed from the duck implementation. They are coded as an interface.

=====================
Simple Factory Pattern
---------------------
1. Adding code for the simple factory design pattern 
2. Added Pizza class and two subclasses Cheese and Peperoni implementing the Pizza class 
3. The PizzaStore uses the Pizza class and its subclass 
4. Moved the object creation code from PizzaStore to the SimpleFactory so that the PizzaStore is closed for modification. If any new objects are to be created, only the SimpleFactory code will have to change

=====================
Command Pattern
---------------------
1. Command Pattern with Queues
2. Command Pattern with Logging
3. Added Vendor Class Light, GarageDoor, Command interface, implemented the interface with vendor class commands and executed the commands from the remote control


