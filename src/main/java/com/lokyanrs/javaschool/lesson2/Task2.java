package com.lokyanrs.javaschool.lesson2;


import java.io.IOException;
import java.util.*;

// 2. Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
public class Task2 {

    public static void main(String[] args) throws IOException {
        List<String> wordsFromText = TextUtils.getWordsFromText();

        wordsFromText.sort((o1, o2) -> {
            int compareResult = Integer.compare(o1.length(), o2.length());
            if(compareResult != 0)
                return compareResult;
            else {
                return o1.compareTo(o2);
            }
        });
        System.out.println(wordsFromText);
    }
}
