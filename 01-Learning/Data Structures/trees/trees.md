
# Trees in Java

Trees are hierarchical data structures that consist of nodes connected by edges. Each node contains a value and may have a number of child nodes, forming a parent-child relationship. Trees are used for organizing hierarchical data like file systems, representing relationships in organizations, and implementing efficient searching algorithms.

## Table of Contents

- [Introduction](#introduction)
- [Types of Trees](#types-of-trees)
- [Tree Traversal](#tree-traversal)
  - [Inorder Traversal](#inorder-traversal)
  - [Preorder Traversal](#preorder-traversal)
  - [Postorder Traversal](#postorder-traversal)
- [Tree Operations](#tree-operations)
  - [Insertion](#insertion)
  - [Deletion](#deletion)
  - [Searching](#searching)
- [Examples](#examples)
- [Resources](#resources)

## Introduction

A tree is a collection of nodes where each node has a value and a list of references to its child nodes. The topmost node is called the root. Trees provide an efficient way to store and retrieve data in hierarchical order.

## Types of Trees

There are several types of trees, including:

- **Binary Tree**: Each node has at most two children.
- **Binary Search Tree (BST)**: A binary tree where the left child is smaller and the right child is greater than the parent.
- **AVL Tree**: A self-balancing BST where the heights of the two child subtrees of any node differ by at most one.
- **Red-Black Tree**: A self-balancing BST with additional properties ensuring balance during insertions and deletions.

## Tree Traversal

Traversal refers to visiting all nodes of the tree in a specific order. Three common traversal methods are:

### Inorder Traversal

Inorder traversal visits the left subtree, then the root, and finally the right subtree.

### Preorder Traversal

Preorder traversal visits the root, then the left subtree, and finally the right subtree.

### Postorder Traversal

Postorder traversal visits the left subtree, then the right subtree, and finally the root.

## Tree Operations

### Insertion

Insertion involves adding a new node to the tree while maintaining the tree properties.

### Deletion

Deletion removes a node from the tree while ensuring the tree remains valid.

### Searching

Searching involves finding a node with a specific value in the tree.

## Examples

Here are some examples illustrating different operations on trees:

```java
// Example of Binary Search Tree (BST) implementation in Java
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Inorder traversal:");
        bst.inorderTraversal(bst.root); // Output: 20 30 40 50 60 70 80
    }
}
```

## Resources

- [Java Trees Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Tree.html) - Official Oracle documentation on Tree in Java.
- [GeeksforGeeks Java Trees](https://www.geeksforgeeks.org/binary-tree-set-1-introduction/) - Comprehensive tutorials and examples for Trees in Java.
