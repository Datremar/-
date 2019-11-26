package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] words = string.split(" ");

        int size = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                if (words[i].length() < size) {
                    size = words[i].length();
                }
            }
        }

        System.out.println(size);
    }
}
