**Data Structures Implementation** 
This repository contains implementations of various data structures in Java.

**MyLinkedList**

Overview:
MyLinkedList is a generic linked list implementation. It allows dynamic addition, removal, and retrieval of elements. It also supports iterator functionality.

Usage:

`
// Example usage of MyLinkedList
MyLinkedList<Integer> list = new MyLinkedList<>();
list.add(1);
list.add(2);
list.add(3);
System.out.println("Size of list: " + list.size());
System.out.println("First element: " + list.getFirst());
System.out.println("Last element: " + list.getLast());
`


**MyList**

Overview:
MyList is an interface representing a list data structure. It defines common operations such as addition, removal, retrieval, and more.

Usage:

``
// Example usage of MyList
MyList<Integer> list = new MyLinkedList<>();
list.add(1);
list.add(2);
list.add(3);
System.out.println("Size of list: " + list.size());
System.out.println("First element: " + list.getFirst());
System.out.println("Last element: " + list.getLast());
``


**MyStack**

Overview:
MyStack is a generic stack implementation based on an ArrayList. It follows the Last In, First Out (LIFO) principle.

Usage:

`
// Example usage of MyStack
MyStack<Integer> stack = new MyStack<>();
stack.push(1);
stack.push(2);
stack.push(3);
System.out.println("Size of stack: " + stack.size());
System.out.println("Top element: " + stack.peek());
System.out.println("Popped element: " + stack.pop());
`
