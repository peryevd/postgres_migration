package ru.sendel.liquibaseguide.model;

import javax.persistence.*;

@Entity
@Table (name = "User")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column
  private String first_name;
  @Column
  private String last_name;
  @Column
  private int age;
  @Column
  private String sex;
  @Column
  private double weight;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getFirstName() {
    return first_name;
  }

  public void setFirstName(String first_name) {
    this.first_name = first_name;
  }


  public String getLastName() {
    return last_name;
  }

  public void setLastName(String last_name) {
    this.last_name = last_name;
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

}
