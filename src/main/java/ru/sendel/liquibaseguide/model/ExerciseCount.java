package ru.sendel.liquibaseguide.model;

import javax.persistence.*;

@Entity
@Table
public class ExerciseCount {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private int count;
  @Column
  private int count_destination;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }


  public long getCountDestination() {
    return count_destination;
  }

  public void setCountDestination(int count_destination) {
    this.count_destination = count_destination;
  }

}
