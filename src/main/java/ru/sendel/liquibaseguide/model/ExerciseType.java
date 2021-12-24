package ru.sendel.liquibaseguide.model;

import javax.persistence.*;

@Entity
@Table
public class ExerciseType {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String name;
  @Column
  private long exercise_type_table;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getExerciseTypeTable() {
    return exercise_type_table;
  }

  public void setExerciseTypeTable(long exercise_type_table) {
    this.exercise_type_table = exercise_type_table;
  }

}
