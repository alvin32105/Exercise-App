package exercise;

import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Calendar.Builder;
import java.util.Calendar;

public class Workout 
{
    private ArrayList<Exercise> exerciseList;
    private Calendar cal = Calendar.getInstance();
    private String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public Workout(int month, int date, int year)
    {
        this.exerciseList = new ArrayList<>();
        cal.set(year, month-1, date);
        Calendar currentDay = Calendar.getInstance();
    }

    public String displayDate() 
    {
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String dayName = daysOfWeek[dayOfWeek - 1]; 
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return "Workout Date: Month " + month + "/" + day + "/" + year + " " + dayName;
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