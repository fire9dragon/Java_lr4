import Exercises.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseManager {

    private List<Exercise> exercises;

    ExerciseManager(Exercise ... exercises) {
        this.exercises = new ArrayList<Exercise>(Arrays.asList(exercises));
    }

    public void add(Exercise ... exercises) {
        this.exercises.addAll(Arrays.asList(exercises));
    }

    public void open(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= exercises.size()) throw new IndexOutOfBoundsException("Введен неправильный индекс");
        exercises.get(index).start();
    }
}
