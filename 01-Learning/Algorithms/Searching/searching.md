
# Searching Algorithms in Java

This file contains implementations of various searching algorithms in Java.

## Table of Contents

- [Introduction](#introduction)
- [Types of Searching Algorithms](#types-of-searching-algorithms)
- [Searching Algorithms Implementations](#searching-algorithms-implementations)
  - [Linear Search](#linear-search)
  - [Binary Search](#binary-search)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

Searching algorithms are used to find an element or a group of elements from a collection.

## Types of Searching Algorithms

Common types of searching algorithms include:

- **Linear Search**: Sequentially checks each element in the collection.
- **Binary Search**: Efficiently searches in a sorted collection by repeatedly dividing the search interval in half.

## Searching Algorithms Implementations

### Linear Search

```java
class LinearSearch {
    public int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1; // Element not found
    }
}
```

### Binary Search

```java
class BinarySearch {
    public int search(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                return mid; // Element found
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; // Element not found
    }
}
```

## Examples

Here are examples demonstrating different searching algorithms in Java:

```java
int[] arr = {10, 20, 30, 40, 50};
int key = 30;

LinearSearch linearSearch = new LinearSearch();
int linearResult = linearSearch.search(arr, key);
System.out.println("Linear Search:");
if (linearResult != -1) {
    System.out.println("Element found at index " + linearResult); // Output: Element found at index 2
} else {
    System.out.println("Element not found");
}

BinarySearch binarySearch = new BinarySearch();
int binaryResult = binarySearch.search(arr, key);
System.out.println("Binary Search:");
if (binaryResult != -1) {
    System.out.println("Element found at index " + binaryResult); // Output: Element found at index 2
} else {
    System.out.println("Element not found");
}
```

## Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/) - Official Oracle documentation for Java.
- [GeeksforGeeks Searching Algorithms](https://www.geeksforgeeks.org/searching-algorithms/) - Comprehensive tutorials and examples for Searching Algorithms.
