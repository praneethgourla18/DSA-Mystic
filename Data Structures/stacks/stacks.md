
# Stacks in Java

A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. Elements are added (pushed) and removed (popped) from the top of the stack. Stacks are useful for implementing undo mechanisms, function call tracking, and parsing in compilers.

## Table of Contents

- [Introduction](#introduction)
- [Initializing a Stack](#initializing-a-stack)
- [Stack Operations](#stack-operations)
  - [Push Operation](#push-operation)
  - [Pop Operation](#pop-operation)
  - [Peek Operation](#peek-operation)
  - [isEmpty Operation](#isempty-operation)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

A stack is a collection of elements with two main operations: push, which adds an element to the top of the stack, and pop, which removes the top element. Additionally, peek allows you to view the top element without removing it, and isEmpty checks if the stack is empty.

## Initializing a Stack

In Java, we can implement a stack using arrays or linked lists. Here's an example of a stack implemented using arrays:

```java
class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
}
```

## Stack Operations

### Push Operation

```java
public void push(int data) {
    if (top < maxSize - 1) {
        stackArray[++top] = data;
    } else {
        System.out.println("Stack overflow");
    }
}
```

### Pop Operation

```java
public int pop() {
    if (top >= 0) {
        return stackArray[top--];
    } else {
        System.out.println("Stack underflow");
        return -1; // or throw an exception
    }
}
```

### Peek Operation

```java
public int peek() {
    if (top >= 0) {
        return stackArray[top];
    } else {
        System.out.println("Stack is empty");
        return -1; // or throw an exception
    }
}
```

### isEmpty Operation

```java
public boolean isEmpty() {
    return (top == -1);
}
```

## Examples

Here are some examples illustrating different operations on stacks:

```java
Stack stack = new Stack(5);
stack.push(1);
stack.push(2);
stack.push(3);

System.out.println(stack.pop()); // Output: 3
System.out.println(stack.peek()); // Output: 2
System.out.println(stack.isEmpty()); // Output: false
```

## Resources

- [Java Stack Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) - Official Oracle documentation on Stack in Java.
- [GeeksforGeeks Java Stack](https://www.geeksforgeeks.org/stack-class-in-java/) - Comprehensive tutorials and examples for Stack in Java.
