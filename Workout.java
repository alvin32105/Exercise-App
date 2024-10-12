import java.util.ArrayList;


public class Workout 
{
    private ArrayList<Exercise> exerciseList;

    public Workout()
    {
        this.exerciseList = new ArrayList<>();
    }

    public void addExercise(Exercise exercise)
    {
        exerciseList.add(exercise);
    }
    
    public ArrayList<Exercise> getExerciseList()
    {
        return exerciseList;
    }
}