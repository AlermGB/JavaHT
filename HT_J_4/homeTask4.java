package HT_J_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Реализовать консольное приложение, которое:

Принимает от пользователя строку вида text~num

Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.

Если введено print~num, выводит строку из позиции num в связном списке.

Если введено exit, завершаем программу

Пример:
string~4
num~3
print~3

num
print~4
string
my_value~1
print~1
my_value
 */
public class homeTask4 {

    public static void main(String[] args) {
        ArrayList <String> mainArray = new ArrayList<>();
        Integer number = 0;
        Scanner scan  = new Scanner(System.in);        
        System.out.println("Start input:");
        String command = scan.nextLine();

        while (!command.equals("exit")) {
            System.out.println();
            String [] commandArr = command.split("~");
            if((commandArr.length == 2) && (!commandArr[0].equals("")) && (commandArr[0] != null) && (isCorrectInt(commandArr[1]))){
                number = Integer.parseInt(commandArr[1]);
                if(number >= mainArray.size()){
                    for (int i = mainArray.size(); i < number; i++) {
                        mainArray.add(null);                        
                    }
                    mainArray.add(commandArr[0]);
                }
                else{
                    if(mainArray.get(number) == null){
                        mainArray.set(number, commandArr[0]);
                    }
                    else{
                        System.out.println(mainArray.get(number));
                        System.out.println();
                    }
                }
            }
            else{
                System.out.println("Uncorrect input!!! Try again!");
            }
            command = scan.nextLine();
        }
        scan.close();
    }

    private static Boolean isCorrectInt(String inputStr){
                try {
            if(Integer.parseInt(inputStr) >= 0 )
                return true;
            else{
                return false;
            }
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
