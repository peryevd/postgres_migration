package ru.sendel.liquibaseguide.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TrainingExercise {
  @Id
  private long training_id;
  @Column
  private long exercise_id;


  public long getTrainingId() {
    return training_id;
  }

  public void setTrainingId(long training_id) {
    this.training_id = training_id;
  }


  public long getExerciseId() {
    return exercise_id;
  }

  public void setExerciseId(long exercise_id) {
    this.exercise_id = exercise_id;
  }

}
