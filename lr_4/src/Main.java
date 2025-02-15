import Exercises.ExerciseOne;
import Exercises.ExerciseThree;
import Exercises.ExerciseTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExerciseManager exerciseManager = new ExerciseManager();
        exerciseManager.add(
                new ExerciseOne(),
                new ExerciseTwo(),
                new ExerciseThree()
        );

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Введите номер задания (0 - выход): ");
            int exerciseIndex = scanner.nextInt();

            if(exerciseIndex == 0) System.exit(0);

            try {
                exerciseManager.open(exerciseIndex - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Введен неправильный индекс");
            }

        }
    }
}