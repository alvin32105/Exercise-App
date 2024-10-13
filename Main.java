import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseInterface ei = new ExerciseInterface();
        ei.addWorkout();
        ei.addExercise(0,"Barbell Bench");
        ei.addSet(0,0,135,6);
    }
}