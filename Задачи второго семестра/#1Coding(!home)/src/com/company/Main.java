package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        arr = new int[m][n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][i] = scanner.nextInt();
            }
        }

        int[] multitudeMain = extractMultitude(m, 0);

        for (int i = 1; i < n; i++) {
            if (isEqual(multitudeMain, extractMultitude(m, i), m)) {
                k++;
            }
        }

        System.out.println("Amount of alike arrays: " + k);

    }

    private static int[] extractMultitude(int m, int n) {
        int[] multitude = new int[m];
        multitude[0] = arr[0][n];
        int k = 1;

        for (int i = 1; i < m; i++) {
            if(!doesBelong(arr[i][n], multitude, k)) {
                multitude[k] = arr[i][n];
                k++;
            }
        }

        return multitude;
    }

    private static boolean doesBelong(int num, int[] multitude, int k) {
        boolean result = false;

        for (int i = 0; i < k; i++) {
            if (num == multitude[i]) {
                result = true;
            }
        }
        return result;
    }

    private static boolean isEqual(int[] multitude1, int[] multitude2, int m) {
        boolean result = false;

        Arrays.sort(multitude1);
        Arrays.sort(multitude2);

        for (int i = 0; i < m; i++) {
            if (multitude1[i] == multitude2[i]) {
                result = true;
            }else {
                result = false;
                break;
            }
        }
        return result;
    }
}
