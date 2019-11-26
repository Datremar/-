package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        int n = scanner.nextInt();

        System.out.println(binToDec(str));

    }

    private static String binToDec(String string) {
        String result = "";
        int pow = 0, tempResult = 0;
        char[] arr = string.toCharArray();

        for (int i = string.length() - 1; i >= 0; i--) {
            tempResult += toNum(arr[i]) * Math.pow(2, pow);
            pow++;
        }

        result = intToStr(tempResult);

        return result;
    }

    private static int strToInt(String string) {
        int result = 0;
        char[] arr = string.toCharArray();
        byte pow = 0;

        for (int i = string.length() - 1; i >= 1; i--) {
            result += toNum(arr[i]) * Math.pow(10, pow);
            pow++;
        }

        if (arr[0] == '-') {
            result *= -1;
        }

        return result;
    }

    private static String intToStr(int number) {
        String result = "";
        byte k = 0, temp;
        char sign = '+';
        int num;
        byte tempK;

        if (number < 0) {
            sign = '-';
            number = Math.abs(number);
        }

        num = number;
        while (num > 0) {
            k++;
            num /= 10;
        }

        tempK = (byte) (k + 1);

        char[] arr = new char[k + 1];

        arr[0] = sign;

        while (number > 0) {
            temp = (byte) (number % 10);
            k--;
            arr[k + 1] = toStr(temp);
            number /= 10;
        }

        for (int i = 0; i < tempK; i++) {
            result += arr[i];
        }

        return result;
    }

    private static String toUpperString(String str) {
        String result = "";
        char[] arr;
        arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            result = result + toUpperCase(arr[i]);
        }

        return result;
    }

    private static char toStr(byte n) {
        char result = '_';

        switch (n){
            case 0:
                result = '0';
                break;
            case 1:
                result = '1';
                break;
            case 2:
                result = '2';
                break;
            case 3:
                result = '3';
                break;
            case 4:
                result = '4';
                break;
            case 5:
                result = '5';
                break;
            case 6:
                result = '6';
                break;
            case 7:
                result = '7';
                break;
            case 8:
                result = '8';
                break;
            case 9:
                result = '9';
                break;
        }

        return result;
    }

    private static byte toNum(char c) {
        byte result = -1;

        switch (c){
            case '0':
                result = 0;
                break;
            case '1':
                result = 1;
                break;
            case '2':
                result = 2;
                break;
            case '3':
                result = 3;
                break;
            case '4':
                result = 4;
                break;
            case '5':
                result = 5;
                break;
            case '6':
                result = 6;
                break;
            case '7':
                result = 7;
                break;
            case '8':
                result = 8;
                break;
            case '9':
                result = 9;
                break;
        }

        return result;
    }

    private static char toUpperCase(char c) {
        switch (c) {
            case 'a':
                c = 'A';
                break;
            case 'b':
                c = 'B';
                break;
            case 'c':
                c = 'C';
                break;
            case 'd':
                c = 'D';
                break;
            case 'e':
                c = 'E';
                break;
            case 'f':
                c = 'F';
                break;
            case 'g':
                c = 'G';
                break;
            case 'h':
                c = 'H';
                break;
            case 'i':
                c = 'I';
                break;
            case 'j':
                c = 'J';
                break;
            case 'k':
                c = 'K';
                break;
            case 'l':
                c = 'L';
                break;
            case 'm':
                c = 'M';
                break;
            case 'n':
                c = 'N';
                break;
            case 'o':
                c = 'O';
                break;
            case 'p':
                c = 'P';
                break;
            case 'q':
                c = 'Q';
                break;
            case 'r':
                c = 'R';
                break;
            case 's':
                c = 'S';
                break;
            case 't':
                c = 'T';
                break;
            case 'u':
                c = 'U';
                break;
            case 'v':
                c = 'V';
                break;
            case 'w':
                c = 'W';
                break;
            case 'x':
                c = 'X';
                break;
            case 'y':
                c = 'Y';
                break;
            case 'z':
                c = 'Z';
                break;
            case 'а':
                c = 'А';
                break;
            case 'б':
                c = 'Б';
                break;
            case 'в':
                c = 'В';
                break;
            case 'г':
                c = 'Г';
                break;
            case 'д':
                c = 'Д';
                break;
            case 'е':
                c = 'Е';
                break;
            case 'ё':
                c = 'Ё';
                break;
            case 'ж':
                c = 'Ж';
                break;
            case 'з':
                c = 'З';
                break;
            case 'и':
                c = 'И';
                break;
            case 'й':
                c = 'Й';
                break;
            case 'к':
                c = 'К';
                break;
            case 'л':
                c = 'Л';
                break;
            case 'м':
                c = 'М';
                break;
            case 'н':
                c = 'Н';
                break;
            case 'о':
                c = 'О';
                break;
            case 'п':
                c = 'П';
                break;
            case 'р':
                c = 'Р';
                break;
            case 'с':
                c = 'С';
                break;
            case 'т':
                c = 'Т';
                break;
            case 'у':
                c = 'У';
                break;
            case 'ф':
                c = 'Ф';
                break;
            case 'х':
                c = 'Х';
                break;
            case 'ц':
                c = 'Ц';
                break;
            case 'ч':
                c = 'Ч';
                break;
            case 'ш':
                c = 'Ш';
                break;
            case 'щ':
                c = 'Щ';
                break;
            case 'ъ':
                c = 'Ъ';
                break;
            case 'ы':
                c = 'Ы';
                break;
            case 'ь':
                c = 'Ь';
                break;
            case 'э':
                c = 'Э';
                break;
            case 'ю':
                c = 'Ю';
                break;
            case 'я':
                c = 'Я';
                break;
        }
        return c;
    }
}
