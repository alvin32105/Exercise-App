import einterface.ExerciseInterface;
import exercise.Exercise;
import exercise.ExerciseSet;
import exercise.Workout;
import java.util.Calendar;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseInterface ei = new ExerciseInterface();
        ei.addWorkout(12,31,2024);

        System.out.println(ei.toString());
    }
}