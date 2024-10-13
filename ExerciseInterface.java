import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.Calendar;

public class ExerciseInterface
{
    private ArrayList<Workout> workoutList;

    public ExerciseInterface()
    {
        this.workoutList = new ArrayList<>();
    }

    public ArrayList<Workout> getWorkoutList()
    {
        return workoutList;
    }

    public void addWorkout(int year, int month, int day)
    {
        Calendar cal = Calendar.getInstance();
        if(year < 0) throw new IllegalArgumentException("Invalid year");
        if(month < 1 || month > 12) throw new IllegalArgumentException("Invalid month");
        if(day < 1 || day > cal.getActualMaximum(Calendar.DAY_OF_MONTH)) throw new IllegalArgumentException("Invalid day");

        Workout workout = new Workout(year, month, day);
        for(Workout w : workoutList)
        {
            if (w.equals(workout)) throw new IllegalArgumentException("duplicate workout");
        }
        
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

    public String printExercises(int workoutIndex)
    {
        System.out.println("Workout " + workoutIndex + "\n"); //temp
        Workout workout = workoutList.get(workoutIndex);
        return workout.toString();
    }

    public String printSets(int workoutIndex, int exerciseIndex)
    {
        Workout workout = workoutList.get(workoutIndex);
        ArrayList<Exercise> exerciseList = workout.getExerciseList();
        Exercise exercise = exerciseList.get(exerciseIndex);

        return exercise.toString();
    }

    @Override
    public String toString()
    {
        int i = 0;
        StringBuilder sb = new StringBuilder("");
        for(Workout workout : workoutList)
        {
            sb.append("" + i + ") Workout " + i + "\n");
            i++;
        }
        sb.append("\n\n");

        return sb.toString();
    }

}