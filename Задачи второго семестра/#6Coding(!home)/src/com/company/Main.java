package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Ratio ratio = new Ratio(n, m);
        ratio.printRatio();

        n = scanner.nextInt();
        m = scanner.nextInt();

        Ratio ratio1 = new Ratio(n, m);
        ratio1.printRatio();

//        Ratio.compare(ratio, ratio1);
//        Ratio.summ(ratio, ratio1);
//        Ratio.subtract(ratio, ratio1);
//        Ratio.multiply(ratio, ratio1);
//        Ratio.divide(ratio, ratio1);
    }
}
