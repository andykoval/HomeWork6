package com.company;

import sun.plugin.javascript.navig.Link;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.List;

/**
 * Created by andy on 08.11.2017.
 */
public class UtilsWAP {


    // Метод для преобразования текста в слова
    public static java.util.List<String> textToWords(File text) throws IOException

    {
        java.util.List<String> lines = Files.readAllLines(text.toPath());
        // Создаем пустую коллекцию для слов.
        java.util.List<String> words = new ArrayList<>();
        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }
        return words;
    }

    //Метод для определения самого длинного слова в тексте
    public static String getLongestWord(File text) throws IOException {
        String maxLeng = "";
        java.util.List<String> word = UtilsWAP.textToWords(text);

        for (String s : word) {
            if (s.length() > maxLeng.length()) {
                maxLeng = s;
            }
        }
        return maxLeng;
    }

    //Метод для определения количества слов в тексте
    public static int countOfWords(File text) throws IOException {
        int count = 0;
        java.util.List<String> word = UtilsWAP.textToWords(text);
        for (String s : word) {
            if (s.length() > 0) {
                count++;
            }
        }
        return count;
    }

    //Сгруппировать слова по длинне и напечатать
    public static void groupeWordsByLength(File text) throws IOException {
        java.util.List<String> word = UtilsWAP.textToWords(text);
        java.util.List<String>[] arrStr = new List[UtilsWAP.getLongestWord(text).length()+1];
//        java.util.List<String> wordsGrouped = new LinkedList<>();
        for (int i = 1; i < UtilsWAP.getLongestWord(text).length()+1; i++) {
            arrStr[i] = new ArrayList<>();
        }
            for (String w : word) {
                arrStr[w.length()].add(w);
            }

        for (int i = 1; i < UtilsWAP.getLongestWord(text).length()+1; i++) {
            for (String arr : arrStr[i]) {
                System.out.println(arr);
            }
        }
    }
}
