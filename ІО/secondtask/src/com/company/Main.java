package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("resources//Biography.txt");

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(" ");
            writer.write("I am studying at the Ivan Franko National University of Lviv, Faculty of Finance and Business Management. ");
            writer.write("My specialty - 'IT in business' - involves studying such disciplines as math, programming, computer science, object-oriented programming.");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

