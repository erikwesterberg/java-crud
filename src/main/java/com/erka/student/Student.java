package com.erka.student;

import javax.persistence.Entity;

@Entity

public class Student {
  
  private Long id;
  private String name;
  private String course;
  private double fee;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public double getFee() {
    return fee;
  }

  public void setFee(double fee) {
    this.fee = fee;
  }

  @Override
  public String toString() {
    return "Studen [course=" + course + ", fee=" + fee + ", id=" + id + ", name=" + name + "]";
  }
  
}
