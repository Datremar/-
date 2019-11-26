package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt(), n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int sum = 0, max = Integer.MIN_VALUE, num = -1;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
            if (max <= sum) {
                max = sum;
                num = i;
            }
            sum = 0;
        }

        num++;

        System.out.println("Num'o'maxline = " + num);
        System.out.println("Value'o'maxline = " + max);

    }
}
