package com.lokyanrs.javaschool;

import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WordsTextPrinter {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(WordsTextPrinter.class);

    public static final String FILE_PATH = "lesson-2/src/main/resources/text.txt";

    public static void main(String[] args) throws IOException {
        printUniqueWordsAtFile(FILE_PATH);
        printWordsSortedByLength(FILE_PATH);
        printEveryWordAmount(FILE_PATH);
        printTextReversedByLines(FILE_PATH);
        printTextLineByNumber(FILE_PATH, 5);
    }

    /**
     * 1. Подсчитать количество различных слов в файле
     */
    public static void printUniqueWordsAtFile(String filePath) throws IOException {
        List<String> wordsFromText = TextUtils.getWordsFromText(filePath);

        Set<String> hashSet = new HashSet<>();
        for (String word : wordsFromText)
            hashSet.add(word.toLowerCase());

        LOGGER.info("Количество уникальных слов в файле: {}", hashSet.size());
    }

    /**
     * 2. Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
     */
    public static void printWordsSortedByLength(String filePath) throws IOException {
        List<String> wordsFromText = TextUtils.getWordsFromText(filePath);

        wordsFromText.sort((o1, o2) -> {
            int compareResult = Integer.compare(o1.length(), o2.length());
            if (compareResult != 0)
                return compareResult;
            else
                return o1.compareTo(o2);
        });
        LOGGER.info("Слова в тексте, отсортированные по возрастанию длинны: {}", wordsFromText);
    }

    /**
     * 3. Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле
     */
    public static void printEveryWordAmount(String filePath) throws IOException {
        List<String> wordsFromText = TextUtils.getWordsFromText(filePath);

        HashMap<String, Integer> numberOfWordsFromText = new HashMap<>();
        for (String word : wordsFromText) {
            numberOfWordsFromText.put(
                    word.toLowerCase(),
                    numberOfWordsFromText.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        LOGGER.info("Количество повторений слов в тексе: {}", numberOfWordsFromText);
    }

    /**
     * 4. Выведите на экран все строки файла в обратном порядке
     */
    public static void printTextReversedByLines(String filePath) throws IOException {
        // Коллекция с собственным итератором, в котором обходим элементы в обратном порядке
        List<String> stringsFromText = new MyList<>(TextUtils.getStringsFromText(filePath));

        LOGGER.info("Строки файла в обратном порядке:");
        for (String string : stringsFromText) {
            LOGGER.info(string);
        }
    }

    /**
     * 6. Выведите на экран строки, номера которых задаются в проивзольном порядке
     *
     * @param number номер строки
     */
    public static void printTextLineByNumber(String filePath, int number) throws IOException {
        List<String> stringsFromText = TextUtils.getStringsFromText(filePath);
        LOGGER.info("Строка #{}: {}", number, stringsFromText.get(number));
    }
}
