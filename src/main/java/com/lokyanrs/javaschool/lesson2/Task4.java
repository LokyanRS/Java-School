package com.lokyanrs.javaschool.lesson2;

import java.io.IOException;

import java.util.List;

// 4. Выведите на экран все строки файла в обратном порядке
public class Task4 {
    public static void main(String[] args) throws IOException {
        List<String> stringsFromText = TextUtils.getStringsFromText();

        System.out.println(stringsFromText);
    }
}