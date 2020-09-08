package com.lokyanrs.javaschool.lesson2;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

// 3. Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле
public class Task3 {
    public static void main(String[] args) throws IOException {
        List<String> wordsFromText = TextUtils.getWordsFromText();

        HashMap<String, Integer> numberOfWordsFromText = new HashMap<>();
        for (String word : wordsFromText) {
            numberOfWordsFromText.put(
                    word.toLowerCase(),
                    numberOfWordsFromText.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        System.out.println(numberOfWordsFromText);
    }
}