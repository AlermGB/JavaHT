package HT_J_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
/**
 * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
 * проснись
 *
 * и
 * ты
 * Еще
 * день друг Пора
 * ..
 *
 */

public class homeTask5 {

    public static void main(String[] args) {
        String mainText = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(mainText);
    }

    static void collectStats(String text) {
        String[] arrayOfWords = text.split(" ");
        Map<Integer, List<String>> stats = new HashMap<Integer, List<String>>();
        Integer maxLengthOfWords = 0;
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() > maxLengthOfWords) {
                maxLengthOfWords = arrayOfWords[i].length();
            }
            if (stats.containsKey(arrayOfWords[i].length())) {
                List<String> tempList = stats.get(arrayOfWords[i].length());
                tempList.add(arrayOfWords[i]);
                stats.put(arrayOfWords[i].length(), tempList);
            } else {
                List<String> tempList = new ArrayList<>();
                tempList.add(arrayOfWords[i]);
                stats.put(arrayOfWords[i].length(), tempList);
            }
        }
        for (int i = 0; i <= maxLengthOfWords; i++) {
            if (stats.containsKey(i)) {
                System.out.println(String.join(" ", stats.get(i)));
            }
        }
    }

}
