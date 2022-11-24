package task_2;

import java.util.Scanner;

public class ScanAndWriteToArray {

    public static int n;
    public static int m;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: "); //TODO Нужна проверка, что ввели именно целое число
        n = scanner.nextInt();
        System.out.print("Введите целое число m: "); //TODO Нужна проверка, что ввели именно целое число
        m = scanner.nextInt();

        int myArray[][] = new int[n][m];

        System.out.print("Получился массив: ");
        printArray(myArray);

    }

    // метод, который выводит двумерный массив в виде {{}, {}, ..., {}}
    public static void printArray (int [][] array){
        for (int i = 0; i < n; i++) {
            System.out.print("{");
            if (i == 0) {
                System.out.print("{");
            }
            for (int j = 0; j < m; j++){
                array[i][j] = ((int) (Math.random() * 100)) * 2 + 1; // *2 + 1, чтобы сделать нечётным

                if (j < m - 1) {
                    System.out.print(array[i][j] + ", "); //TODO Сделать вывод масиива красивее (разбить на строки), если останется время
                } else
                    System.out.print(array[i][j] + "}");
            }
            if (i == n - 1) {
                System.out.print("}");
            } else {
                System.out.print(", ");
            }
        }
    }

}

/*
Task 2
Написать программу, которая:
* считывает с консоли 2 числа n и m
* заполняет двумерный массив размером n на m нечетными числами
Массив вывести на консоль
 */