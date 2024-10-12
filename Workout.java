import java.util.ArrayList;


public class Workout 
{
    private ArrayList<Exercise> exerciseList;

    public Workout()
    {
        this.exerciseList = new ArrayList<>();
    }

    public void addExercise(String exerciseName)
    {
        Exercise exercise = new Exercise(exerciseName);
        exerciseList.add(exercise);
    }
}