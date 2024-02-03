package com.gym.dao;

import java.util.Date;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.model.Exercise;

public interface ExerciseDao extends JpaRepository<Exercise, Integer> {
	
	public Set<Exercise> findByExerciseName(String exerciseName);
	
	public Set<Exercise> findByDate(Date date);

}
