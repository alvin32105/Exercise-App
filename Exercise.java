

public class Exercise
{
    private String exerciseName;
    private double pounds;
    private int sets;
    private int reps;
    
    public Exercise(String exerciseName, double pounds, int sets, int reps)
    {
        this.exerciseName = exerciseName;
        this.pounds = pounds;
        this.sets = sets;
        this.reps = reps;
    }

    public String getName()
    {
        return exerciseName;
    }

    public double getWeight()
    {
        return pounds;
    }

    public int getSets()
    {
        return sets;
    }

    public int getReps()
    {
        return reps;
    }
}