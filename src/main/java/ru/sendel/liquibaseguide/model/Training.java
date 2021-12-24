package ru.sendel.liquibaseguide.model;

import javax.persistence.*;

@Entity
@Table
public class Training {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private long user_id;
  @Column
  private String name;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return user_id;
  }

  public void setUserId(long user_id) {
    this.user_id = user_id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
