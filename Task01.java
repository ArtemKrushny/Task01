package by.company.homework.task01;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    /* В массив А [N] занесены натуральные числа.
     Найти сумму тех элементов, которые кратны данному К
     */
    public static void main(String[] args) {
        int n;
        int k;
        n = inputIntegerFromConsole("Введите размер массива ");
        k = inputIntegerFromConsole("Введите число K ");
        int[] arr = new int[n];
        sumArray(arr, k);
    }

    public static int inputIntegerFromConsole(String message) {
        int value;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.println("Неверный ввод");
        }
        value = sc.nextInt();
        return value;
    }

    public static void sumArray(int[] arr, int k) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            System.out.print(arr[i] + " ");
            if (arr[i] % k == 0) {
                sum = sum + arr[i];
            }
        }
       System.out.println("Сумма чисел кратных K: " + sum);
    }
}
