package exercise;

public class ExerciseSet
{
    private int weight;
    private int reps;

    public ExerciseSet(int weight, int reps)
    {
        this.weight = weight;
        this.reps = reps;
    }

    public void setWeight(int newWeight)
    {
        weight = newWeight;
    }

    public void setReps(int newReps)
    {
        reps = newReps;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getReps()
    {
        return reps;
    }
}