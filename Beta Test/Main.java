import einterface.ExerciseInterface;

public class Main
{
    public static void main(String[] args)
    {
        ExerciseInterface ei = new ExerciseInterface();
        ei.addWorkout(1999,12,31);
        ei.addWorkout(1999,11,30);

        ei.addExercise(0, "Dumbell");

        ei.addSet(0, 0, 120, 5);
        ei.addSet(0, 0, 200, 7);

        System.out.println(ei.toString());

        System.out.println(ei.printExercises(0));

        System.out.println(ei.printSets(0,0));

    }
}