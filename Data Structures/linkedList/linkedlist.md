
# Linked List in Java

A linked list is a linear data structure where each element is a separate object called a node. Each node contains data and a reference (link) to the next node in the sequence. Linked lists are dynamic in size and allow efficient insertion and deletion of elements.

## Table of Contents

- [Introduction](#introduction)
- [Node Class](#node-class)
- [Initializing a Linked List](#initializing-a-linked-list)
- [Insertion Operations](#insertion-operations)
  - [Inserting at the Beginning](#inserting-at-the-beginning)
  - [Inserting at the End](#inserting-at-the-end)
  - [Inserting at a Specific Position](#inserting-at-a-specific-position)
- [Deletion Operations](#deletion-operations)
  - [Deleting from the Beginning](#deleting-from-the-beginning)
  - [Deleting from the End](#deleting-from-the-end)
  - [Deleting at a Specific Position](#deleting-at-a-specific-position)
- [Traversal](#traversal)
- [Searching](#searching)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

A linked list is a collection of nodes, where each node contains data and a reference (link) to the next node in the sequence. The first node is called the head, and the last node has a reference to null.

## Node Class

In Java, we define a `Node` class to represent each element of the linked list:

```java
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

## Initializing a Linked List

A linked list is initialized by creating a head node:

```java
class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }
}
```

## Insertion Operations

### Inserting at the Beginning

```java
public void insertAtBeginning(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}
```

### Inserting at the End

```java
public void insertAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
        return;
    }
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = newNode;
}
```

### Inserting at a Specific Position

```java
public void insertAtPosition(int data, int position) {
    Node newNode = new Node(data);
    if (position == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node current = head;
    int index = 0;
    while (current != null && index < position - 1) {
        current = current.next;
        index++;
    }
    if (current == null) {
        return;
    }
    newNode.next = current.next;
    current.next = newNode;
}
```

## Deletion Operations

### Deleting from the Beginning

```java
public void deleteFromBeginning() {
    if (head == null) {
        return;
    }
    head = head.next;
}
```

### Deleting from the End

```java
public void deleteFromEnd() {
    if (head == null || head.next == null) {
        head = null;
        return;
    }
    Node current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
}
```

### Deleting at a Specific Position

```java
public void deleteAtPosition(int position) {
    if (head == null) {
        return;
    }
    if (position == 0) {
        head = head.next;
        return;
    }
    Node current = head;
    int index = 0;
    while (current != null && index < position - 1) {
        current = current.next;
        index++;
    }
    if (current == null || current.next == null) {
        return;
    }
    current.next = current.next.next;
}
```

## Traversal

```java
public void traverse() {
    Node current = head;
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}
```

## Searching

```java
public boolean search(int key) {
    Node current = head;
    while (current != null) {
        if (current.data == key) {
            return true;
        }
        current = current.next;
    }
    return false;
}
```

## Examples

Here are some examples illustrating different operations on linked lists:

### Example 1: Inserting and Traversing

```java
LinkedList list = new LinkedList();
list.insertAtEnd(1);
list.insertAtEnd(2);
list.insertAtEnd(3);
list.traverse(); // Output: 1 2 3
```

### Example 2: Deleting and Searching

```java
LinkedList list = new LinkedList();
list.insertAtEnd(1);
list.insertAtEnd(2);
list.insertAtEnd(3);
list.deleteFromBeginning();
list.deleteFromEnd();
list.traverse(); // Output: 2
System.out.println("Is 3 present? " + list.search(3)); // Output: Is 3 present? false
```

## Resources

- [Java LinkedList Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) - Official Oracle documentation on LinkedList in Java.
- [GeeksforGeeks Java LinkedList](https://www.geeksforgeeks.org/linked-list-in-java/) - Comprehensive tutorials and examples for LinkedList in Java.
