import java.util.Scanner;
import java.util.Random;
public class program {

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println();

    System.out.println(isSumBetween10And20(7, 15)); // false
    System.out.println();

    System.out.println(isPositive(5)); // true
    System.out.println();

    System.out.println(isPositive(-3)); // false
    System.out.println();
    printString("abcd", 5); // abcdabcdabcdabcdabcd
    System.out.println();

    System.out.println();
    System.out.println(isLeapYear(2000)); // определение високосности)))
    System.out.println();

    arrayPrinter(createArray(7, 100)); // вывод массива заданного методом createArray()
    System.out.println();
    System.out.println();

    int[] oneZeroArray = createOneZeroArray(10); // задачка про реверс единичек и нулей (1**)
    arrayPrinter(oneZeroArray);
    System.out.println();
    arrayPrinter(oneZeroReverser(oneZeroArray));
    System.out.println();

    int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // умножалка на 2 злемента, который меньше 6-ти
    System.out.println();
    arrayPrinter(newArray);
    System.out.println();
    arrayPrinter(sixComparator(newArray));
    System.out.println();


    System.out.println(); // диагонали матрицы
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Введите размерность матрицы: ");
    int number =Integer.parseInt(iScanner.nextLine());
    iScanner.close();
    matrixPrinter(matrixDiagonalCreator(number));


}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    // проверить, что сумма a и b лежит между 10 и 20
    
    return a + b <= 20 && a + b >= 10;
}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    return x > 0;
}

private static void printString(String source, int repeat) {
    // напечатать строку source repeat раз
    for(int i = 0; i < repeat; i++){
        System.out.print(source);
    }
}

private static boolean isLeapYear(int year) {
    // проверить, является ли год високосным. если да - return true
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

private static int[] createArray(int len, int initalValue) {
    // должен вернуть массив длины len, каждое значение которого равно initialValue
    int [] result = new int[len];
    for(int i = 0; i < len; i ++){
        result[i] = initalValue;
    }

    return result;
}

private static void arrayPrinter(int array[]){
    for (int i = 0; i < array.length; i++) {
        System.out.printf("%d ", array[i]);
    }
}
// * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
private static int[] createOneZeroArray(int len){
    int [] result = new int[len];
    Random rnd = new Random();
    for (int i = 0; i < result.length; i++) {
        result[i] = rnd.nextInt(2);
    }
    return result;    
    
}
// * С помощью цикла и условия заменить 0 на 1, 1 на 0;
private static int[] oneZeroReverser(int[] array){
    for (int i = 0; i < array.length; i++) {
        if (array[i] == 1){
            array[i] = 0;
        }
        else {
            if (array[i] == 0){
                array[i] = 1;
            }
        }
    }
    return array;
}


// * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// *  пройти по нему циклом, и числа меньшие 6 умножить на 2;
private static int[] sixComparator(int[] array){
    for (int i = 0; i < array.length; i++) {
        if(array[i] < 6){
            array[i] *= 2;
        }
    }
    return array;
}



//  * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//  * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//  * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//  * * Также заполнить элементы побочной диагонали
private static int[][] matrixDiagonalCreator(int num) {
    int [][] matrix = new int[num][num];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            if((i == j) || (i == matrix.length - j - 1)){
                matrix[i][j] = 1;
            }
            else{
                matrix[i][j] = 0;
            }
        }
        
    }
    return matrix;
}

private static void matrixPrinter(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix.length; j++) {
            System.out.printf("%d ", matrix[i][j]);
        }
        System.out.println();
    }
}

}