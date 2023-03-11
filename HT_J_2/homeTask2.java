package HT_J_2;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 * homeTask2
 */
public class homeTask2 {

    public static void main(String[] args) {
        System.out.println(buildString(7, 'a', 'b'));
        createFile("file.txt", "TEXT", 100);
    }

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
       
    private static String buildString(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        if (n%2 != 0){
            sb.append(c1);
        }
        String result = sb.toString();
        return result;
    }
    
    //Создать файл с названием file.txt. Если файл уже есть,
    // то создавать не надо Записать в него Слово "TEXT" 100 раз

    public static void createFile(String fName, String text, int number) {
        Path path = Paths.get(fName);
        try {
            if (!Files.exists(path)) Files.createFile(path);
            for (int i = 0; i < number; i++) {
                Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
            }
        }
        catch (IOException e) {e.printStackTrace();}
    }
}