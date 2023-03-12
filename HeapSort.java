
/*
To convert an array into a Heap, we can follow the following steps:

Build a complete binary tree from the array.
Starting from the last non-leaf node (i.e., the parent of the last element), 
heapify the subtree rooted at that node by comparing it with its children and 
swapping if necessary. Repeat this step for all non-leaf nodes in reverse level 
order.

To implement both min and max heaps, we need to modify the heapify procedure 
based on whether we want a min or max heap.
 */

import java.util.Scanner;

public class HeapSort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        System.out.println("Min heap:");
        int[] minHeap = buildMinHeap(arr);
        printArray(minHeap);

        System.out.println("Max heap:");
        int[] maxHeap = buildMaxHeap(arr);
        printArray(maxHeap);

        sc.close();
    }

    public static int[] buildMinHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            minHeapify(arr, i, n);
        }
        return arr;
    }

    public static int[] buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            maxHeapify(arr, i, n);
        }
        return arr;
    }

    public static void minHeapify(int[] arr, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int smallest = i;
        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(arr, i, smallest);
            minHeapify(arr, smallest, n);
        }
    }

    public static void maxHeapify(int[] arr, int i, int n) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            maxHeapify(arr, largest, n);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
