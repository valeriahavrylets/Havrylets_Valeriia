package HW2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);

        do {
            System.out.println("Оберіть блок (1,2,3,4): ");
            int Task = task.nextInt();

            switch (Task) {
                case 1 -> first();
                case 2 -> second();
                case 3 -> third();
                case 4 -> fourth();
                case 0 -> System.exit(0);
                // default -> throw new IllegalStateException("Неочікуване значення: " + Task);
            }

        } while (true);

    }

    private static Integer[] generateRandomArray(int size) {

        Integer[] arr = new Integer[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30));
        }
        return arr;
    }

    private static int[] generateRandomIntArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 15);
        }
        return arr;
    }

    private static void first() {
        Integer[] arr = generateRandomArray(5);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));

    }

    private static void second() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кількість чисел: ");
        int num = scanner.nextInt();
        int[] arr = generateRandomIntArray(num);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }

        System.out.println("Сума всіх додатних чисел: " + sum);
    }

    private static void third() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кількість чисел: ");
        int num = sc.nextInt();
        int[] array = generateRandomIntArray(num);

        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        double avg = sum / array.length;
        System.out.println("Середнє значення: " + avg);
    }

    private static void fourth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Кількість чисел: ");
        int num = sc.nextInt();
        int[] array = generateRandomIntArray(num);

        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
