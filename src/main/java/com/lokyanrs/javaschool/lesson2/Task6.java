package com.lokyanrs.javaschool.lesson2;

import java.io.IOException;
import java.util.List;

// 6. Выведите на экран строки, номера которых задаются в проивзольном порядке
public class Task6 {
    public static void main(String[] args) throws IOException {
        List<String> stringsFromText = TextUtils.getStringsFromText();

        System.out.println(stringsFromText.get(5));
        System.out.println(stringsFromText.get(3));

    }
}
