package com.gym.service;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.gym.dao.ExerciseDao;
import com.gym.exceptions.ExerciseNotFoundException;
import com.gym.model.Exercise;

public class ExerciseService {
	
	@Autowired
	ExerciseDao exerciseDao;
	
	// Find exercise by id
	public Exercise findByExerciseId(int id) {
		return exerciseDao.findById(id)
		.orElseThrow(() -> new ExerciseNotFoundException("Exercise not found with id = " + id));
	}
	
	// Find exercise(s) by name (will return a set of exercises)
	public Set<Exercise> findByExerciseName(String exerciseName) {
		return exerciseDao.findByExerciseName(exerciseName)
				.stream().collect(Collectors.toSet());
	}
	
	// Find exercise(s) by date
	public Set<Exercise> findByDate(Date date) {
		return exerciseDao.findByDate(date)
				.stream().collect(Collectors.toSet());
	}
	
	// Find all exercises
	public Set<Exercise> findAll() {
		return exerciseDao.findAll()
				.stream().collect(Collectors.toSet());
	}
	// TODO: Stretch goal - find exercises within date period
	
	// Insert exercise
	public Exercise insert(Exercise e) {
		return exerciseDao.save(e);
	}
	
	// Update exercise
	
	// Delete exercise
}
