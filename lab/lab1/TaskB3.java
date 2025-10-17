/*
Дан массив целых чисел. Минимальное количество элементов – 5 Вернуть
число, которое является суммой двух наименьших положительных чисел.
 */

package lab1;

public class TaskB3 {
    public static void main(String[] args) {
        System.out.println(counterArray(MainTask.readArray()));
    }
    private static int counterArray(int[] array) {
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        for (int number : array) {
            if (number > 0) {
                if (number < minFirst) {
                    minSecond = minFirst;
                    minFirst = number;
                } else if (number < minSecond) {
                    minSecond = number;
                }
            }
        }

        return minFirst+minSecond;
    }
}
