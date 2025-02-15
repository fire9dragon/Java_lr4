package Exercises;

import java.util.Scanner;

public class ExerciseOne implements Exercise {
    
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите колво чисел в массиве");
        int numberAmount = scanner.nextInt();
        if (numberAmount <= 0) throw new IndexOutOfBoundsException("Invalid input");

        int[] numbers = new int[numberAmount];
        for (int i = 0; i < numberAmount; ++i) {
            System.out.printf("Ввдеите %d элемент массива: ", i+1);
            numbers[i] = scanner.nextInt();
        }
        int indexOfMin = indexOfSmallest(numbers);

        System.out.println("Сумма модулей элементов массива, расположенных после минимального по модулю элемента = " + sumOfAbs(numbers, indexOfMin));
    }
    
    private int indexOfSmallest(int[] array) {
        int indexOfMin = 0;
        int minElement = array[indexOfMin];
        
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < minElement) {
                indexOfMin = i;
                minElement = array[i];
            }
        }

        return indexOfMin;
    }

    private int sumOfAbs(int[] array, int fromIndex) {
        int res = 0;

        for(int i = fromIndex + 1; i < array.length; ++i) {
            res += Math.abs(array[i]);
        }

        return res;
    }

    private int sumOfAbs(int[] array) {
        return sumOfAbs(array, 0);
    }
}
