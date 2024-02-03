package com.gym.controller;

import java.util.Date;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.gym.model.Exercise;
import com.gym.service.ExerciseService;

public class DataController {
	
	private Logger logger = LoggerFactory.getLogger(DataController.class);
	
	@Autowired
	private ExerciseService exerciseService;
	
	// Find by ID
	@GetMapping("/{id}")
	public Exercise getExercise(@PathVariable int id) {
		return exerciseService.findByExerciseId(id);
	}
	
	// Find by exercise name
	@GetMapping("/name/{exerciseName}")
	public ResponseEntity<Set<Exercise>> findByExerciseName(@RequestParam() String exerciseName) {
		return ResponseEntity.ok(exerciseService.findByExerciseName(exerciseName));
	}
	
	// Find by Date
	@GetMapping("/date/{date}")
	public ResponseEntity<Set<Exercise>> findByDate(@RequestParam() Date date) {
		return ResponseEntity.ok(exerciseService.findByDate(date));
	}
	
	// Find all
	public ResponseEntity<Set<Exercise>> findAll() {
		return ResponseEntity.ok(exerciseService.findAll());
	}
	
	// TODO: Stretch goal: find exercises within date period
	
	// Insert exercise
	@PostMapping
	public Exercise insert(@RequestBody Exercise exercise) {
		return exerciseService.insert(exercise);
	}
	
	// Update exercise
	
	// Delete exercise

}
