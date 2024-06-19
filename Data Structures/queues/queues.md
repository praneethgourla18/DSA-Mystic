
# Queues in Java

A queue is a linear data structure that follows the First In, First Out (FIFO) principle. Elements are added (enqueued) at the rear and removed (dequeued) from the front. Queues are useful for implementing algorithms like breadth-first search (BFS) and scheduling processes in operating systems.

## Table of Contents

- [Introduction](#introduction)
- [Initializing a Queue](#initializing-a-queue)
- [Queue Operations](#queue-operations)
  - [Enqueue Operation](#enqueue-operation)
  - [Dequeue Operation](#dequeue-operation)
  - [Front Operation](#front-operation)
  - [isEmpty Operation](#isempty-operation)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

A queue is a collection of elements with two main operations: enqueue, which adds an element to the rear of the queue, and dequeue, which removes an element from the front. Additionally, front allows you to view the front element without removing it, and isEmpty checks if the queue is empty.

## Initializing a Queue

In Java, we can implement a queue using arrays or linked lists. Here's an example of a queue implemented using arrays:

```java
class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
}
```

## Queue Operations

### Enqueue Operation

```java
public void enqueue(int data) {
    if (currentSize == maxSize) {
        System.out.println("Queue is full");
        return;
    }
    rear = (rear + 1) % maxSize;
    queueArray[rear] = data;
    currentSize++;
}
```

### Dequeue Operation

```java
public int dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1; // or throw an exception
    }
    int removed = queueArray[front];
    front = (front + 1) % maxSize;
    currentSize--;
    return removed;
}
```

### Front Operation

```java
public int front() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1; // or throw an exception
    }
    return queueArray[front];
}
```

### isEmpty Operation

```java
public boolean isEmpty() {
    return (currentSize == 0);
}
```

## Examples

Here are some examples illustrating different operations on queues:

```java
Queue queue = new Queue(5);
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);

System.out.println(queue.dequeue()); // Output: 1
System.out.println(queue.front()); // Output: 2
System.out.println(queue.isEmpty()); // Output: false
```

## Resources

- [Java Queue Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html) - Official Oracle documentation on Queue in Java.
- [GeeksforGeeks Java Queue](https://www.geeksforgeeks.org/queue-interface-java/) - Comprehensive tutorials and examples for Queue in Java.
