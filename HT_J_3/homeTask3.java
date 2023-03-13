package HT_J_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;;
/**
 * homeTask3
 */
public class homeTask3 {

    public static void main(String[] args) {
        ArrayList<Integer> arrListInt = new ArrayList<Integer>(List. of(2, 3, 17, 89, 9, 10));
        oddEraser(arrListInt);
        System.out.println();   
        System.out.println(oddEraser(arrListInt));   
        System.out.println();   

        ArrayList<String> arrListString = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(ifStringIsInteger(arrListString));
        System.out.println();

    }
// Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    private static ArrayList<Integer> oddEraser(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number % 2 != 0){
                iterator.remove();
            } 
        }
        return list;
    }

// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
//Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
// ["string", "s", "my_value"]

    private static ArrayList<String> ifStringIsInteger(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String maybeInt = iterator.next();
            if(isParsebleInt(maybeInt)){
                iterator.remove();
            }
        }

        return list;
    }
    private static boolean isParsebleInt(String anyString){
        try {
            Integer.parseInt(anyString);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}

