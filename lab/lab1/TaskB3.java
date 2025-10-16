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
        int minFirst = array[0];
        int minSecond = array[1];
        if (minSecond < minFirst) {
        int temp = minFirst;
        minFirst = minSecond;
        minSecond = temp;
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > 0) {
                if (array[i] < minFirst || minFirst <= 0) {
                    minSecond = minFirst;
                    minFirst = array[i];
                } else if (array[i] < minSecond || minSecond <= 0) {
                    minSecond = array[i];
                }
            }
        }

        return minFirst+minSecond;
    }
}
