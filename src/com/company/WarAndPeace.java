package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class WarAndPeace {
    public static void main(String[] args) throws IOException {
        // Создаем файл, указывая путь к текстовому файлу на диске
        File text = new File("C:\\dir1\\wp.txt");
        UtilsWAP.textToWords(text);

//        for (String word : UtilsWAP.textToWords(text)) {
//            System.out.println(word);
//        }
        System.out.println("Количество слов: " + UtilsWAP.countOfWords(text));
        System.out.println("Самое длинное слово в тексте: " +UtilsWAP.getLongestWord(text));
        UtilsWAP.groupeWordsByLength(text);
//        UtilsWAP.groupeWordsByLength(text);
    }

}
