package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(), s0 = scanner.nextLine();

        System.out.println(exclusion(s, s0));
    }

    private static String exclusion(String str, String subStr) {
        String result = "";
        boolean trigger = false;
        boolean check = true;
        int pos = -1;
        char[] strChars = str.toCharArray();
        char[] subChars = subStr.toCharArray();

        for (int i = 0; i < (str.length() - subStr.length() - 1); i++) {
            if (strChars[i] == subChars[0]) {
                pos = i;
                for (int j = 0; j < subStr.length(); j++) {
                    for (int k = pos; k < (i + subStr.length()); k++) {
                        if (check && strChars[i] == subChars[j]) {
                            trigger = true;
                        } else {
                            check = false;
                        }
                    }
                    check = true;
                }
            }
        }

        if (trigger) {
            for (int i = pos; i < pos + subStr.length(); i++) {
                strChars[i] = '~';
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (strChars[i] != '~') {
                result += strChars[i];
            }
        }

        return result;
    }

    private static int doesContainOnPos(String s, String s0) {
        int result = -1;
        char[] strChars = s.toCharArray();
        char[] subChars = s0.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (true) {

            }
        }

        return result;
    }

}
