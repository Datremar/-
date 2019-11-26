package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String sub = scanner.nextLine();
        String[] words = string.split("sub");
        for (int i = 0; i < words.length; i++) {
            words[i].replace(sub, "");
            if (!words[i].isEmpty()) {
                System.out.print(words[i]);
            }
        }
    }
}
