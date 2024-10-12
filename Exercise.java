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
    
    public String getName()
    {
        return exerciseName;
    }

    public ArrayList<ExerciseSet> getSetList()
    {
        return exerciseSetsList;
    }

    public void addSet(ExerciseSet exerciseSet)
    {
        exerciseSetsList.add(exerciseSet);
    }
    
    // public ExerciseSet getSet(int index)
    // {
    //     ExerciseSet result = exerciseSetsList.get(index);
    //     return result;
    // }

    // public String listSets()
    // {
    //     StringBuilder sb = new StringBuilder("");
    //     for(ExerciseSet set : exerciseSetsList)
    //     {
    //         sb.append("weight: " + set.getWeight() + " reps: " + set.getReps() + "\n");
    //     }

    //     return sb.toString();
    // }
}