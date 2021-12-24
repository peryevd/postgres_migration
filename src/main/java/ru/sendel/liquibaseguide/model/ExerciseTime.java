package ru.sendel.liquibaseguide.model;


import javax.persistence.*;

@Entity
@Table
public class ExerciseTime {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private java.sql.Date time;
  @Column
  private java.sql.Date time_destination;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Date getTime() {
    return time;
  }

  public void setTime(java.sql.Date time) {
    this.time = time;
  }


  public java.sql.Date getTimeDestination() {
    return time_destination;
  }

  public void setTimeDestination(java.sql.Date time_destination) {
    this.time_destination = time_destination;
  }

}
