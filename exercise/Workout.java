package exercise;

import java.util.ArrayList;
import java.lang.StringBuilder;

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

    @Override
    public String toString()
    {
        int i = 0;
        StringBuilder sb = new StringBuilder("");
        for(Exercise exercise : exerciseList)
        {
            sb.append("" + i + ") " + exercise.getName() + "\n");
            i++;
        }
        sb.append("\n\n");

        return sb.toString();
    }
}