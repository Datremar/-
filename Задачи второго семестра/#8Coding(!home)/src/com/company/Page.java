package com.company;

import java.util.Scanner;

public class Page {

    private Note[] notes;
    private Scanner scanner;

    public Page() {
        notes = new Note[3];
        scanner = new Scanner(System.in);

        intialize();
    }

    public Note getNoteByNum(int n) throws ArrayIndexOutOfBoundsException {
        return notes[n];
    }

    private void intialize() {
        for (int i = 0; i < 3; i++) {
            notes[i] = new Note(scanner.nextLine(), scanner.nextLine());
        }
    }


}
