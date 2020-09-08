package com.lokyanrs.javaschool.lesson2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public final class TextUtils {
    public static final String FILE_PATH = "src/main/resources/text.txt";

    private TextUtils() {
        throw new UnsupportedOperationException("Oops!");
    }

    /**
     * Возвращает все слова из текста в виде списка
     * @return Список слов
     */
    public static List<String> getWordsFromText() throws IOException {
        String fileContent = new String(Files.readAllBytes((Paths.get(FILE_PATH))))
                .replaceAll("\\p{P}", "") //Убираем все символы пунктуации
                .replaceAll("[\\r\\n]", "");
        return Arrays.asList(
                fileContent.split("\\s"));
    }

    /**
     * Возвращает строки из текста в виде списка
     * @return Список строк
     */
    public static List<String> getStringsFromText() throws IOException {
        return Arrays.asList(
                new String(Files.readAllBytes((Paths.get(FILE_PATH))))
                .split("\\r\\n"));
    }
}
