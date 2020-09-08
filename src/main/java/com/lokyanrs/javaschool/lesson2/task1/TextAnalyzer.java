package com.lokyanrs.javaschool.lesson2.task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class TextAnalyzer {
    private static final String FILE_PATH = "src/main/resources/text.txt";

    private static String[] getWordsFromText() throws IOException {
        String fileContent = new String(Files.readAllBytes((Paths.get(FILE_PATH))))
                .replaceAll("\\p{P}", "") //Убираем все символы пунктуации
                .replaceAll("[\\r\\n]", "");
        return fileContent.split("\\s");
    }

    public static void main(String[] args) throws IOException {
        String[] splittedWords = getWordsFromText();

        HashMap<String, Integer> numberOfWordsFromText = new HashMap<>();
        for (String splittedWord : splittedWords) {
            numberOfWordsFromText.put(splittedWord.toLowerCase(),
                    numberOfWordsFromText.getOrDefault(splittedWord.toLowerCase(), 0) + 1);
        }

        System.out.println(numberOfWordsFromText);
    }
}
