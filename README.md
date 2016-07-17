# Assignment2--DataStructure
Prototype login system with self implemented data structures

Modify the application from assignment1 to create and use our own list (data structure)  instead of using Java Collection API (such as ArrayList, Set, LinkedList, etc.). You are required to create an interface for Stack, Queue, Ordered List, and Indexed List. For ordered list, you will need to implement an equal method and compareTo method for the object that you want to insert into this list. (For example, User class is required to implement equal method and compareTo method ordered by Username.

Operations:

Stack: Push, pop, top, isEmpty, isFull (array), size, toString
Queue: Enqueue, Dequeue, isEmpty, isFull(array), size, toString
Ordered List (More Details can be found on Chapter 6 slide Page 16): add, remove, contains, isEmpty, size, get, toString, reset, getNext
Indexed List (More Details can be found on Chapter 6 slide Page 17): add, set, remove, IndexOf, contains, isEmpty, size, get, toString, reset, getNext

Requirements
  1.	OrderedList and IndexedList are unbounded
  2.	Do not allow duplicate elements on our lists
  3.	Handle exceptions for isEmpty, isFull, and add (for indexed list and the index is invalid)
  4.	Test using each operation from stack, queue, ordered list, indexed list by using Junit and you will choose one of the data structure type to store user information when creating new user account from assignment1 application and printout the screen shot to prove that the application still function and explain why you pick this type of data structure.
  5.	Include JavaDoc and UML diagram

Extra Credit
  1.	(5%) Sort by multiple fields ordered by Gender, DOB, and UserName. You may use the following resource:
    http://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
