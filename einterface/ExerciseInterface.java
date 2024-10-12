package einterface;

import exercise.Exercise;
import exercise.ExerciseSet;
import exercise.Workout;

import java.util.ArrayList;
import java.lang.StringBuilder;

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

    public void addWorkout()
    {
        Workout workout = new Workout();
        workoutList.add(workout);
    }

    public void removeWorkout(int workoutIndex)
    {
        workoutList.remove(workoutIndex);
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

    public void removeExercise(int workoutIndex, int exerciseIndex)
    {
        Workout workout = workoutList.get(workoutIndex);

        ArrayList<Exercise> exerciseList = workout.getExerciseList();
        exerciseList.remove(exerciseIndex);

    }

    public void addSet(int workoutIndex, int exerciseIndex, int weight, int reps)
    {
        Workout workout = workoutList.get(workoutIndex);
        ArrayList<Exercise> exerciseList = workout.getExerciseList();

        Exercise exercise = exerciseList.get(exerciseIndex);
        ExerciseSet exerciseSet = new ExerciseSet(weight, reps);

        exercise.addSet(exerciseSet);
    }

    public void editSets(int workoutIndex, int exerciseIndex ,int setIndex, int newWeight, int newReps)
    {
        Workout workout = workoutList.get(workoutIndex);

        ArrayList<Exercise> exerciseList = workout.getExerciseList();
        Exercise exercise = exerciseList.get(exerciseIndex);

        ArrayList<ExerciseSet> exerciseSetList = exercise.getSetList();
        ExerciseSet exerciseSet = exerciseSetList.get(setIndex);

        exerciseSet.setWeight(newWeight);
        exerciseSet.setReps(newReps);
    }

    public void removeSets(int workoutIndex, int exerciseIndex ,int setIndex)
    {
        Workout workout = workoutList.get(workoutIndex);

        ArrayList<Exercise> exerciseList = workout.getExerciseList();
        Exercise exercise = exerciseList.get(exerciseIndex);

        ArrayList<ExerciseSet> exerciseSetList = exercise.getSetList();

        exerciseSetList.remove(setIndex);
    }

    public void changeExerciseName(int workoutIndex, int exerciseIndex, String name)
    {
        Workout workout = workoutList.get(workoutIndex);
        ArrayList<Exercise> exerciseList = workout.getExerciseList();
        Exercise exercise = exerciseList.get(exerciseIndex);
        if(name.equals(exercise.getName()))
        {
            throw new IllegalArgumentException("duplicate exercise");
        }

        exercise.setName(name);
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