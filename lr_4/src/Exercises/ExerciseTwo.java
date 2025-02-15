package Exercises;

public class ExerciseTwo implements Exercise{

    @Override
    public void start() {
        int num = 11;
        do {
            System.out.printf(num + "\t");
            if(num % 10 == 0) System.out.println();

            ++num;
        } while (num < 51);
    }
}
