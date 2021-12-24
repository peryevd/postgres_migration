package ru.sendel.liquibaseguide.model;

import javax.persistence.*;

@Entity
@Table
public class Exercise {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String description;
  @Column
  private String name;
  @Column
  private long exercise_type_id;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getExerciseTypeId() {
    return exercise_type_id;
  }

  public void setExerciseTypeId(long exercise_type_id) {
    this.exercise_type_id = exercise_type_id;
  }

}
