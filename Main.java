import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseInterface ei = new ExerciseInterface();
        ei.addWorkout(2000,10,1);
        ei.addWorkout(2000,10,1);

        // ei.addWorkout();
        System.out.println(ei.toString());
    }
}