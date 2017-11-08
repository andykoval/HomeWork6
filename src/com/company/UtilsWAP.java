package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

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
        int maxLenght = 0;
        String maxLeng = "";
        java.util.List<String> lines = Files.readAllLines(text.toPath());
        for (String line : lines) {
            String[] wordSplit =
                    line.toLowerCase()
                            .replaceAll("\\p{Punct}", " ")
                            .trim()
                            .split("\\s");

            for (String s : wordSplit) {
                if (s.length() > maxLenght) {
                    maxLenght = s.length();
                    maxLeng = s;
                }
            }
        }
        return maxLeng;
    }

    public static int countOfWords(File text) throws IOException {
        int count = 0;
        java.util.List<String> lines = Files.readAllLines(text.toPath());
        java.util.List<String> words = new ArrayList<>();
        for (String line : lines) {
            String[] wordSplit =
                    line.toLowerCase()
                            .replaceAll("\\p{Punct}", " ")
                            .trim()
                            .split("\\s");

            for (String s : wordSplit) {
                if (s.length() > 0)
                    count++;
                words.add(s.trim());
            }
        }
        return count;
    }
}
