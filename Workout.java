import java.util.ArrayList;


public class Workout 
{
    public void addExercise(String name, double weight, int reps)
    {
        Exercise exercise = new Exercise(name, weight, reps);
        exerciseList.add(exercise);
    }

    public void removeExercise(int index)
    {
        exerciseList.remove(index);
    }

    private ArrayList<Exercise> exerciseList = new ArrayList<>();

}