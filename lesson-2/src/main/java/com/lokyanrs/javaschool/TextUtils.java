package com.lokyanrs.javaschool;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public final class TextUtils {
    private TextUtils() {
        throw new UnsupportedOperationException("Oops!");
    }

    /**
     * Возвращает все слова из текста в виде списка
     * @return Список слов
     */
    public static List<String> getWordsFromText(String filePath) throws IOException {
        String fileContent = new String(Files.readAllBytes((Paths.get(filePath))))
                .replaceAll("\\p{P}", "") //Убираем все символы пунктуации
                .replaceAll("[\\r\\n]", "");
        return Arrays.asList(
                fileContent.split("\\s"));
    }

    /**
     * Возвращает строки из текста в виде списка
     * @return Список строк
     */
    public static List<String> getStringsFromText(String filePath) throws IOException {
        return Arrays.asList(
                new String(Files.readAllBytes((Paths.get(filePath))))
                .split("\\n"));
    }
}
