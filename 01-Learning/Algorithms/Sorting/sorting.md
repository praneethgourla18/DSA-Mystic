
# Sorting Algorithms in Java

This file contains implementations of various sorting algorithms in Java.

## Table of Contents

- [Introduction](#introduction)
- [Types of Sorting Algorithms](#types-of-sorting-algorithms)
- [Sorting Algorithms Implementations](#sorting-algorithms-implementations)
  - [Bubble Sort](#bubble-sort)
  - [Selection Sort](#selection-sort)
  - [Insertion Sort](#insertion-sort)
  - [Merge Sort](#merge-sort)
  - [Quick Sort](#quick-sort)
  - [Heap Sort](#heap-sort)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

Sorting algorithms are used to arrange elements of a collection in a specific order. Common orders include numerical (ascending or descending) and lexicographical (alphabetical) sequences.

## Types of Sorting Algorithms

Common types of sorting algorithms include:

- **Comparison-Based Sorting Algorithms**:
  - Bubble Sort
  - Selection Sort
  - Insertion Sort
  - Merge Sort
  - Quick Sort
  - Heap Sort
- **Non-Comparison-Based Sorting Algorithms**:
  - Counting Sort
  - Radix Sort
  - Bucket Sort

## Sorting Algorithms Implementations

### Bubble Sort

```java
class BubbleSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
```

### Selection Sort

```java
class SelectionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
```

### Insertion Sort

```java
class InsertionSort {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
```

### Merge Sort

```java
class MergeSort {
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
```

### Quick Sort

```java
class QuickSort {
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
```

### Heap Sort

```java
class HeapSort {
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}
```

## Examples

Here are examples demonstrating different sorting algorithms in Java:

```java
int[] arr = {64, 25, 12, 22, 11};

BubbleSort bubbleSort = new BubbleSort();
bubbleSort.sort(arr);
System.out.println("Bubble Sort: " + Arrays.toString(arr)); // Output: Bubble Sort: [11, 12, 22, 25, 64]

SelectionSort selectionSort = new SelectionSort();
selectionSort.sort(arr);
System.out.println("Selection Sort: " + Arrays.toString(arr)); // Output: Selection Sort: [11, 12, 22, 25, 64]

InsertionSort insertionSort = new InsertionSort();
insertionSort.sort(arr);
System.out.println("Insertion Sort: " + Arrays.toString(arr)); // Output: Insertion Sort: [11, 12, 22, 25, 64]

MergeSort mergeSort = new MergeSort();
mergeSort.sort(arr);
System.out.println("Merge Sort: " + Arrays.toString(arr)); // Output: Merge Sort: [11, 12, 22, 25, 64]

QuickSort quickSort = new QuickSort();
quickSort.sort(arr);
System.out.println("Quick Sort: " + Arrays.toString(arr)); // Output: Quick Sort: [11, 12, 22, 25, 64]

HeapSort heapSort = new HeapSort();
heapSort.sort(arr);
System.out.println("Heap Sort: " + Arrays.toString(arr)); // Output: Heap Sort: [11, 12, 22, 25, 64]
```

## Resources

- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/) - Official Oracle documentation for Java.
- [GeeksforGeeks Sorting Algorithms](https://www.geeksforgeeks.org/sorting-algorithms/) - Comprehensive tutorials and examples for Sorting Algorithms.
