package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        String third = scan.next();
        String fourth = scan.next();
        String fifth = scan.next();
        try {
            FileWriter writer = new FileWriter("resources//Info.txt");
            writer.write(first);
            writer.write(second);
            writer.write(third);
            writer.write(fourth);
            writer.write(fifth);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}

