package com.company;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        selectionSort(intArray);

        for (int i : intArray) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] intArray) {
        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 0; j <= i; j++) {
                if (intArray[j] > intArray[largest]) {
                    largest = j;
                }
            }

            swap(intArray, largest, i);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
