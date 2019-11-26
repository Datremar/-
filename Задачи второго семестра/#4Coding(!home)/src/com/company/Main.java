package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        clear(string);
    }

    private static void amountOfWords(String str) {
        char[] arr = str.toCharArray();
        byte length = (byte) arr.length;
        boolean trigger = true;
        byte k = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != ' ' && trigger == true) {
                k++;
                trigger = false;
            }else if (arr[i] == ' ') {
                trigger = true;
            }
        }

        System.out.println(k);
    }

    private static int _amountOfWords(String str) {
        String[] words = str.split(" ");

        return words.length;
    }

    private static int amountOfSpecWords(String str) {
        int k = 0;
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(words[i].substring(0, 1))) {
                k++;
            }
        }
        return k;
    }

    private static int longestWordLength(String str) {
        int n = 0;
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > n) {
                n = words[i].length();
            }
        }

        return n;
    }

    private static void clear(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i].replace(" ", "");
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!words[i].isEmpty()) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println(words[words.length - 1]);
    }
}
