package com.bridgelabz;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {14, 9, 8, 13, 15, 16, 4, 17, 11};

        int lenght = arr.length;
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortRecursion(arr, 0, lenght - 1);
        quickSort.printArray(arr);
    }
    int partition(int[] array, int low, int high) {
        int pivot = array[(low + high) / 2];
        while (low <= high) {
            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }
    void quickSortRecursion(int[] array, int low, int high) {
        int pivot = partition(array, low, high);
        if (low < pivot - 1) {
            quickSortRecursion(array, low, pivot - 1);
        }
        if (pivot < high) {
            quickSortRecursion(array, pivot, high);
        }
    }

    void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + "");
        }
    }
}
