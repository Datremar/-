package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(), n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int symmetry;

        if (n % 2 == 0) {
            symmetry = n / 2;
        }else {
            symmetry = (n - 1) / 2;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < symmetry; i++) {
            swap(arr, m, n - 1, i);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void swap(int[][] arr, int m, int n, int column) {
        int temp;

        for (int i = 0; i < m; i++) {
            for (int j = column; j < n - column; j++) {
                temp = arr[i][j];
                arr[i][j] = arr[i][n - j];
                arr[i][n - j] = temp;
            }
        }
    }
}
