import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseInterface ei = new ExerciseInterface();
        ei.addWorkout();
        ei.addWorkout();

        System.out.println(ei.toString());
    }
}