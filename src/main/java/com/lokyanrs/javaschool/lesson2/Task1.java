package com.lokyanrs.javaschool.lesson2;

import java.io.IOException;
import java.util.*;

// 1. Подсчитать количество различных слов в файле
public class Task1 {
    public static void main(String[] args) throws IOException {
        List<String> wordsFromText = TextUtils.getWordsFromText();

        Set<String> hashSet = new HashSet<>();
        for (String word : wordsFromText) {
            hashSet.add(word.toLowerCase());
        }
        System.out.println("Количество уникальных слов в файле: " + hashSet.size());
    }
}
