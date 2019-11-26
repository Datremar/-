package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(1);
        System.out.println();
        String path = "C:\\Users\\User\\Desktop\\Book.txt";


        File file = new File(path);
        if (file.exists()) {
            file.delete();
            file.createNewFile();
        }

        FileWriter writer = new FileWriter(path);
        BufferedWriter out = new BufferedWriter(writer);
        out.write(book.compose());
        out.flush();


        book.findByName(scanner.nextLine());
        book.findByNumber(scanner.nextLine());
        book.resetName(1, 1, scanner.nextLine());
        book.resetNumber(1, 1, scanner.nextLine());
        book.deleteNoteOnPage(0, 1);

        File file1 = new File("C:\\Users\\User\\Desktop\\book.txt");

        if (file.exists()) {
            file.delete();
            file1.createNewFile();
        }

        FileWriter writer1 = new FileWriter("C:\\Users\\User\\Desktop\\book.txt");
        BufferedWriter out1 = new BufferedWriter(writer1);

        FileReader rd = new FileReader(path);
        BufferedReader reader = new BufferedReader(rd);

        String line = reader.readLine();
        System.out.println(line);
        String[] words = line.split(";");

        book._findByName(words, scanner.nextLine());


        out1.write(book.compose());
        out1.flush();
        writer.close();
        out.close();

        out1.close();
        writer1.close();
    }
}
