package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        Person[] people = new Person[k];

        for (int i = 0; i < k; i++) {
            people[i] = new Person();
//            people[i].setCode(scanner.nextInt());
            people[i].setGender(scanner.nextBoolean());
            people[i].setHeight(scanner.nextFloat());
//            people[i].setName(scanner.nextLine());
        }

        System.out.println(Person.avgHeight(people));

    }
}
