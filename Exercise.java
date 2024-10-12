import java.lang.StringBuilder;
import java.util.ArrayList;

public class Exercise
{
    private String exerciseName;
    private ArrayList<ExerciseSet> exerciseSetsList;

    public Exercise(String exerciseName)
    {
        this.exerciseName = exerciseName;
        this.exerciseSetsList = new ArrayList<>();
    }

    public void addSet(int weight, int reps)
    {
        ExerciseSet exerciseSet = new ExerciseSet(weight, reps);
    }
    
    public ExerciseSet getSet(int index)
    {
        ExerciseSet result = exerciseSetsList.get(index);
        return result;
    }

    public String listSets()
    {
        StringBuilder sb = new StringBuilder("");
        for(ExerciseSet set : exerciseSetsList)
        {
            sb.append("weight: " + set.getWeight() + " reps: " + set.getReps() + "\n");
        }

        return sb.toString();
    }
}