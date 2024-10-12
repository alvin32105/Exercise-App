import java.util.ArrayList;

public class ExerciseInterface
{
    private ArrayList<Workout> workoutList;

    public ExerciseInterface()
    {
        this.workoutList = new ArrayList<>();
    }

    public void addWorkout()
    {
        Workout workout = new Workout();
        workoutList.add(workout);
    }

    public void addExercise(int workoutIndex, String exerciseName)
    {
        Workout workout = workoutList.get(workoutIndex);
        for(Exercise exercise : workout.getExerciseList())
        {
            if(exercise.getName().equals(exerciseName))
            {
                throw new IllegalArgumentException("duplicate exercise");
            }
        }
        Exercise exercise = new Exercise(exerciseName);
        workout.addExercise(exercise);
    }
    
    public void addSet(int workoutIndex, int exerciseIndex, int weight, int reps)
    {
        Workout workout = workoutList.get(workoutIndex);
        ArrayList<Exercise> exerciseList = workout.getExerciseList();

        Exercise exercise = exerciseList.get(exerciseIndex);
        ExerciseSet exerciseSet = new ExerciseSet(weight, reps);
        exercise.addSet(exerciseSet);

    }
}