import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Calendar;

public class Workout 
{
    private ArrayList<Exercise> exerciseList;
    private int year;
    private int month;
    private int day;

    public Workout(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
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

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }

        Workout other = (Workout) o;
        return (this.year == other.year) && (this.month == other.month) && (this.day == other.day);

    }
}