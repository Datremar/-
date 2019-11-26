package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String fileName = "C:\\Users\\User\\Desktop\\test.txt";
        
        String[] words = new String[10000];
        int k = 0;

        try{
            FileInputStream fileStream = new FileInputStream(fileName);
            BufferedReader bReader = new BufferedReader(new InputStreamReader(fileStream));
            String strLine;
            while ((strLine = bReader.readLine()) != null){
                words[k] = strLine;
                k++;
            }
        }catch (IOException e){
            System.out.println("IOException happened");
        }

        for (int i = 0; i < k; i++) {
            System.out.println("num'o'line = " + (i + 1));
            System.out.println("size'o'line = " + words[i].length());
            System.out.println();
        }
        
    }
}
