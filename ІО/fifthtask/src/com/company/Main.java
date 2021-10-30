package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // The first comment. Reading file.
        FileReader fileReader = new FileReader("src/com/company/Main.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        int firstSlashPosition = -1;
        String lineWithComment = null;
        while (line != null) {
            firstSlashPosition = line.indexOf(47); // The second comment. While
            if (firstSlashPosition != -1 && line.charAt(firstSlashPosition + 1) == 47) {
                lineWithComment = line.substring(firstSlashPosition);
            }

            if (lineWithComment != null) {
                System.out.println(lineWithComment); // The third comment. If
            }
            line = bufferedReader.readLine();
            firstSlashPosition = -1;
            lineWithComment = null;
        }

    }
}