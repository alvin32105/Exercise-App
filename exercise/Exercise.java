package exercise;

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

    public void setName(String exerciseName)
    {
        this.exerciseName = exerciseName;
    }

    public ArrayList<ExerciseSet> getSetList()
    {
        return exerciseSetsList;
    }

    public void addSet(ExerciseSet exerciseSet)
    {
        exerciseSetsList.add(exerciseSet);
    }

    @Override
    public String toString()
    {
        int i = 0;
        StringBuilder sb = new StringBuilder(exerciseName + "\n");
        for(ExerciseSet exerciseSet : exerciseSetsList)
        {
            sb.append("Set" + i + ") Weight: " + exerciseSet.getWeight() + " Reps: " + exerciseSet.getReps() + "\n");
            i++;
        }
        sb.append("\n\n");
        
        return sb.toString();
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