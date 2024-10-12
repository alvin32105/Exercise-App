import einterface.ExerciseInterface;
import exercise.Exercise;
import exercise.ExerciseSet;
import exercise.Workout;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseInterface ei = new ExerciseInterface();
        ei.addWorkout();
        ei.addWorkout();

        System.out.println(ei.toString());
        
        ei.addExercise(0,"Barbell Bench");
        ei.addExercise(0,"Upright Row");

        ei.addExercise(1,"Barbell Squat");
        ei.addExercise(1,"Dumbell Row");

        System.out.println(ei.printExercises(0));
        System.out.println(ei.printExercises(1));

        ei.addSet(0,0,135,12);
        ei.addSet(0,0,145,6);

        System.out.println(ei.printSets(0,0));

        ei.removeSets(0,0,0);

        System.out.println(ei.printSets(0,0));

        ei.editSets(0,0,0,120,5);

        System.out.println(ei.printSets(0,0));
    }
}