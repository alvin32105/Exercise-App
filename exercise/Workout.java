package exercise;

import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Calendar.Builder;
import java.util.Calendar;

public class Workout 
{
    private ArrayList<Exercise> exerciseList;
    private int day;
    private int month;
    private int year;

    public Workout(int year, int month, int day)
    {
        this.exerciseList = new ArrayList<>();
        this.day = day;
        this.month = month;
        this.year = year;
        
    }

    public int getYear()
    {
        return year;
    }

    public int getMonth()
    {
        return month;
    }

    public int getDay()
    {
        return day;
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