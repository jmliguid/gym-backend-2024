package com.gym.model;

import java.util.Date;
import java.util.Objects;

public class Exercise {

	private int exerciseId;
	private String exerciseName;
	private int reps;
	private int weight;
	private Date date;

	public Exercise(int exerciseId, String exerciseName, int reps, int weight, Date date) {
		super();
		this.exerciseId = exerciseId;
		this.exerciseName = exerciseName;
		this.reps = reps;
		this.weight = weight;
		this.date = date;
	}

	public Exercise() {
		super();
	}

	public int getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(int exerciseId) {
		this.exerciseId = exerciseId;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Exercise [exerciseId=" + exerciseId + ", exerciseName=" + exerciseName + ", reps=" + reps + ", weight="
				+ weight + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, exerciseId, exerciseName, reps, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercise other = (Exercise) obj;
		return Objects.equals(date, other.date) && exerciseId == other.exerciseId
				&& Objects.equals(exerciseName, other.exerciseName) && reps == other.reps && weight == other.weight;
	}
	
	

}
