package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static String removeDoubleSpaces(String line) {
        while (line.indexOf("  ") != -1) {
            line = line.replace("  ", " ");
        }
        return line;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("resources//Biography.txt"));
            List<String> listOfWords = new ArrayList<>();
            List<String> latWords = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.next();
                line = line.replace("-", "");
                line = line.replace(".", "");
                line = line.replace(",", "");
                line = line.replace("'", "");
                line = removeDoubleSpaces(line);
                String[] wordsInLine = line.split(" ");
                String[] lat = line.split("[^a-zA-Z]");
                List<String> lats = Arrays.asList(lat);
                List<String> lists = Arrays.asList(wordsInLine);
                listOfWords.addAll(lists);
                latWords.addAll(lats);
            }
            System.out.println("all words:" + listOfWords);
            System.out.println("lat words:" + latWords);
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}