package com.lokyanrs.javaschool.lesson2.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class TextAnalyzer {
    private static final String FILE_PATH = "src/main/resources/text.txt";

    private static List<String> getWordsFromText() throws IOException {
        String fileContent = new String(Files.readAllBytes((Paths.get(FILE_PATH))))
                .replaceAll("\\p{P}", "") //Убираем все символы пунктуации
                .replaceAll("[\\r\\n]", "");
        return Arrays.asList(fileContent.split("\\s"));
    }

    public static void main(String[] args) throws IOException {
        List<String> wordsFromText= getWordsFromText();

        wordsFromText.sort(Comparator.comparingInt(String::length));
        System.out.println(wordsFromText);
    }
}
