package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goodiesAmount = scanner.nextInt();
        Goodie[] goodies = new Goodie[goodiesAmount];
        String[] names = new String[goodiesAmount];

        for (int i = 0; i < goodiesAmount; i++) {
            names[i] = scanner.nextLine();
        }

        for (int i = 0; i < goodiesAmount; i++) {
            goodies[i] = new Goodie();
            goodies[i].setName(names[i]);
            System.out.println("Enter the code: ");
            goodies[i].setCode(scanner.nextInt());
            System.out.println("Enter the amount: ");
            goodies[i].setAmount(scanner.nextInt());
            System.out.println("Enter the price: ");
            goodies[i].setPrice(scanner.nextInt());
            System.out.print("Price = ");
            System.out.println(goodies[i].calculatePrice());
        }

        System.out.println();

        for (int i = 0; i < goodiesAmount; i++) {
            System.out.println(goodies[i].getName());
            System.out.println(goodies[i].getCode());
            System.out.println(goodies[i].getAmount());
            System.out.println(goodies[i].getPrice());
        }

        System.out.println();

        int code;
        int amount;
        System.out.println("Enter the code of goodie to change it's properties: ");
        code = scanner.nextInt();

        for (int i = 0; i < goodiesAmount; i++) {
            if (goodies[i].getCode() == code) {
                System.out.println(goodies[i].getName());
                System.out.println("New amount: ");
                amount = scanner.nextInt();
                goodies[i].setAmount(amount);
                System.out.println(goodies[i].calculatePrice());
            }
        }
    }
}
