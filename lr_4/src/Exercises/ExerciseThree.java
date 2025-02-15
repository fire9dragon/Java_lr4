package Exercises;

public class ExerciseThree implements Exercise {

    @Override
    public void start() {
        for (int num = 43; num < 181; ++num) {
            System.out.printf(num + "\t");
            if(num % 10 == 0) System.out.println();
        }
    }
}
