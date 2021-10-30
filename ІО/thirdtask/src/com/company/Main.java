package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> wordcount = new HashMap<String, Integer>();

        try {
            BufferedReader in = new BufferedReader(new FileReader("C://Biography.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                str = str.toLowerCase();
                int idx1 = -1;

                for (int i = 0; i < str.length(); i++) {
                    if ((!Character.isLetter(str.charAt(i))) || (i + 1 == str.length())) {
                        if (i - idx1 > 1) {
                            if (Character.isLetter(str.charAt(i)))
                                i++;
                            String word = str.substring(idx1 + 1, i);
                            if (wordcount.containsKey(word)) {
                                wordcount.put(word, wordcount.get(word) + 1);
                            } else {
                                wordcount.put(word, 1);
                            }
                        }
                        idx1 = i;
                    }
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        ArrayList<Integer> values = new ArrayList<Integer>();
        values.addAll(wordcount.values());
        Collections.sort(values, Collections.reverseOrder());

        int last_i = -1;
        for (Integer i : values) {
            if (last_i == i)
                continue;
            last_i = i;
            for (String s : wordcount.keySet()) {
                if (wordcount.get(s) == i)
                    System.out.println(s + ":" + i);
            }
        }
    }
}