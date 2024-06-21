
# Arrays in Java

Arrays in Java are fundamental data structures that store elements of the same type in contiguous memory locations. They provide efficient random access and are commonly used for storing and manipulating collections of data.

## Table of Contents

- [Introduction](#introduction)
- [Initialization](#initialization)
- [Accessing Elements](#accessing-elements)
- [Modifying Elements](#modifying-elements)
- [Common Operations](#common-operations)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

An array in Java is a fixed-size data structure that stores elements of the same data type sequentially. Arrays offer O(1) time complexity for accessing elements by index, making them efficient for scenarios where direct access is required.

## Initialization

### Single-Dimensional Arrays

Arrays in Java can be initialized in several ways:

```java
// Declaring and initializing an array of integers
int[] numbers = new int[5]; // Creates an array of size 5

// Initializing an array with values
int[] primes = {2, 3, 5, 7, 11};

// Declaring and initializing an array separately
int[] fibonacci;
fibonacci = new int[]{1, 1, 2, 3, 5};
```

### Multi-Dimensional Arrays

Java also supports multi-dimensional arrays:

```java
// Two-dimensional array
int[][] matrix = new int[3][4]; // 3 rows and 4 columns

// Initializing a two-dimensional array
int[][] identityMatrix = {
    {1, 0, 0},
    {0, 1, 0},
    {0, 0, 1}
};
```

## Accessing Elements

Array elements are accessed using zero-based index:

```java
int[] numbers = {10, 20, 30, 40, 50};

// Accessing elements
int firstElement = numbers[0]; // 10
int thirdElement = numbers[2]; // 30
```

## Modifying Elements

Array elements can be modified directly:

```java
int[] numbers = {1, 2, 3, 4, 5};

// Modifying elements
numbers[2] = 30;
numbers[4] = 50;
```

## Common Operations

Arrays support various operations such as:

### Length

To retrieve the length of an array, use the `length` property:

```java
int[] numbers = {1, 2, 3, 4, 5};
int length = numbers.length;
System.out.println("Length of the array: " + length); // Output: Length of the array: 5
```

### Iteration

You can iterate through array elements using loops like `for` loop:

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.print("Array elements: ");
for (int num : numbers) {
    System.out.print(num + " ");
}
// Output: Array elements: 1 2 3 4 5
System.out.println();
```

### Sorting

Arrays can be sorted using the `Arrays.sort()` method:

```java
import java.util.Arrays;

int[] numbers = {5, 1, 4, 2, 3};
Arrays.sort(numbers);
System.out.println("Sorted array: " + Arrays.toString(numbers)); // Output: Sorted array: [1, 2, 3, 4, 5]
```

### Searching

You can perform linear search or binary search (after sorting) using methods like `Arrays.binarySearch()`:

```java
import java.util.Arrays;

int[] numbers = {10, 20, 30, 40, 50};
int key = 30;

// Linear search
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i] == key) {
        System.out.println("Linear search: Found " + key + " at index " + i); // Output: Linear search: Found 30 at index 2
        break;
    }
}

// Binary search (after sorting)
Arrays.sort(numbers);
int index = Arrays.binarySearch(numbers, key);
System.out.println("Binary search: Found " + key + " at index " + index); // Output: Binary search: Found 30 at index 3
```

## Examples

Here are some examples illustrating different operations on arrays:

### Example 1: Sum of Array Elements

```java
int[] numbers = {1, 2, 3, 4, 5};
int sum = 0;

for (int num : numbers) {
    sum += num;
}

System.out.println("Sum of array elements: " + sum); // Output: Sum of array elements: 15
```

### Example 2: Finding Maximum Element

```java
int[] numbers = {10, 4, 8, 15, 6};
int max = numbers[0];

for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}

System.out.println("Maximum element in the array: " + max); // Output: Maximum element in the array: 15
```

## Resources

- [Java Arrays Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html) - Official Oracle documentation on arrays in Java.
- [GeeksforGeeks Java Arrays](https://www.geeksforgeeks.org/java/) - Comprehensive tutorials and examples for Java arrays.
