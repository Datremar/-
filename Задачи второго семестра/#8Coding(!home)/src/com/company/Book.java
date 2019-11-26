package com.company;

import java.util.ArrayList;

public class Book {

    ArrayList<Page> pages = new ArrayList<>();
    private int numOPages;

    public Book(int n) {
        setNumOPages(n);

        initialize(numOPages);
    }

    public void findByName(String name) {
        for (int i = 0; i < getNumOPages(); i++) {
            for (int j = 0; j < 3; j++) {
                if (pages.get(i).getNoteByNum(j).getSecName().equals(name)) {
                    pages.get(i).getNoteByNum(j).showMeWatchaGot();
                }else {
                    System.out.println("NULL");
                }
            }
        }
    }

    public void _findByName(String[] strings, String name) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(name)) {
                pages.get(0).getNoteByNum(i).showMeWatchaGot();
            }
        }
    }

    public void findByNumber(String number) {
        for (int i = 0; i < getNumOPages(); i++) {
            for (int j = 0; j < 3; j++) {
                if (pages.get(i).getNoteByNum(j).getNumber().equals(number)) {
                    pages.get(i).getNoteByNum(j).showMeWatchaGot();
//                    System.out.println();
//                    System.out.println(pages[i].getNoteByNum(j));
                }else {
                    System.out.println("NULL");
                }
            }
        }
    }

    public void resetName(int nPage, int nNote, String name) {
        pages.get(nPage - 1).getNoteByNum(nNote - 1).setSecName(name);
    }

    public void resetNumber(int nPage, int nNote, String number) {
        pages.get(nPage - 1).getNoteByNum(nNote - 1).setNumber(number);
    }

    public void deleteNoteOnPage(int numOPage, int n) {
        pages.get(numOPage).getNoteByNum(n).delete();
    }

    private void initialize(int n) {
//        System.out.println("Initialing pages");
        for (int i = 0; i < n; i++) {
            pages.add(new Page());
        }
    }

    public String compose() {
        String result = "";

        for (int i = 0; i < numOPages; i++) {
            for (int j = 0; j < 3; j++) {
                result += pages.get(i).getNoteByNum(j).getSecName() + ", " + pages.get(i).getNoteByNum(j).getNumber() + " ";
            }
        }

        return result;
    }

    public void setNumOPages(int numOPages) {
        this.numOPages = numOPages;
    }

    public int getNumOPages() {
        return this.numOPages;
    }
}
