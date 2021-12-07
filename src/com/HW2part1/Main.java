package com.HW2part1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 22, 1, 13, 4, 6, 16, 5};
        // 1.Напишите программу, которая выводит (через пробел) те элементы массива, которые являются чётными числами.
        System.out.print("1: ");
        for (int item: arr) {
            if (item % 2 == 0) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
        // 2.Напишите программу, которая выводит все двузначные числа массива.
        System.out.print("2: ");
        for (int item: arr) {
            if (item >= 10 && item <= 99) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
        // 3.Напишите программу, которая выводит на экран наибольшее целое число этого массива.
        System.out.print("3: ");
        int acc = arr[0];
        for (int i : arr) {
            if (i > acc) {
                acc = i;
            }
        }
        System.out.print(acc + "\n");
        // 4.Напишите программу, которая считает сумму элементов массива и выводит её на экран.
        System.out.print("4: ");
        int count = 0;
        for (int i : arr) {
            count = count + i;
        }
        System.out.print(count + "\n");
        // 5.***Напишите программу, которая переворачивает массив в обратном порядке.
        System.out.print("5: ");
        int[] reverseArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j++;
        }
        System.out.print(Arrays.toString(reverseArr));
    }
}
