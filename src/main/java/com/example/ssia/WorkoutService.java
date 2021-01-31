package com.example.ssia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository repository;

    //@PreAuthorize("#workout.user == principal?.attributes['user_name']")
    public void saveWorkout(Workout workout){
        repository.save(workout);
    }

    public List<Workout> findWorkouts() {
        return repository.findAllByUser();
    }

    public void deleteWorkout(Integer id) {
        repository.deleteById(id);
    }
}
