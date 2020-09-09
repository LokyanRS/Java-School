package com.lokyanrs.javaschool.lesson2;

import com.lokyanrs.javaschool.lesson2.task5.MyList;

import java.io.IOException;
import java.util.List;

// 4. Выведите на экран все строки файла в обратном порядке
public class Task4 {
    public static void main(String[] args) throws IOException {
        // Коллекция с собственным итератором, в котором обходим элементы в обратном порядке
        List<String> stringsFromText = new MyList<>(TextUtils.getStringsFromText());

        for (String string : stringsFromText) {
            System.out.println(string);
        }
    }
}