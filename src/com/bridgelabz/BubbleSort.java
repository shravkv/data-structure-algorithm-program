package com.bridgelabz;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Welcome to BubbleSorting program");
        int[] data = {0, -1, 6, 9, 2, 0, 4};
        System.out.println("Before sorting Data  is :");
        System.out.println(Arrays.toString(data));
        bubbleSort(data);
        System.out.println("After sorting Data is :");
        System.out.println(Arrays.toString(data));

    }
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
    }
}
