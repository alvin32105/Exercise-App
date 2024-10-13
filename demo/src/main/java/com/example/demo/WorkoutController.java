package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutController {

    @Autowired
    private ExerciseInterface exerciseInterface;

    @PostMapping
    public void addWorkout(@RequestParam int year, @RequestParam int month, @RequestParam int day) {
        exerciseInterface.addWorkout(year, month, day);
    }

    @DeleteMapping("/{index}")
    public void removeWorkout(@PathVariable int index) {
        exerciseInterface.removeWorkout(index);
    }

    @PostMapping("/{workoutIndex}/exercises")
    public void addExercise(@PathVariable int workoutIndex, @RequestParam String exerciseName) {
        exerciseInterface.addExercise(workoutIndex, exerciseName);
    }

    @DeleteMapping("/{workoutIndex}/exercises/{exerciseIndex}")
    public void removeExercise(@PathVariable int workoutIndex, @PathVariable int exerciseIndex) {
        exerciseInterface.removeExercise(workoutIndex, exerciseIndex);
    }

    @GetMapping
    public List<Workout> getWorkouts() {
        return exerciseInterface.getWorkoutList();
    }

    
    // Additional methods for adding sets, editing sets, and printing can be added here...
}