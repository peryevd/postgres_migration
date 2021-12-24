package ru.sendel.liquibaseguide.model;


public class Databasechangelog {

  private String id;
  private String author;
  private String filename;
  private java.sql.Timestamp dateexecuted;
  private long orderexecuted;
  private String exectype;
  private String md5Sum;
  private String description;
  private String comments;
  private String tag;
  private String liquibase;
  private String contexts;
  private String labels;
  private String deploymentId;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }


  public java.sql.Timestamp getDateexecuted() {
    return dateexecuted;
  }

  public void setDateexecuted(java.sql.Timestamp dateexecuted) {
    this.dateexecuted = dateexecuted;
  }


  public long getOrderexecuted() {
    return orderexecuted;
  }

  public void setOrderexecuted(long orderexecuted) {
    this.orderexecuted = orderexecuted;
  }


  public String getExectype() {
    return exectype;
  }

  public void setExectype(String exectype) {
    this.exectype = exectype;
  }


  public String getMd5Sum() {
    return md5Sum;
  }

  public void setMd5Sum(String md5Sum) {
    this.md5Sum = md5Sum;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  public String getLiquibase() {
    return liquibase;
  }

  public void setLiquibase(String liquibase) {
    this.liquibase = liquibase;
  }


  public String getContexts() {
    return contexts;
  }

  public void setContexts(String contexts) {
    this.contexts = contexts;
  }


  public String getLabels() {
    return labels;
  }

  public void setLabels(String labels) {
    this.labels = labels;
  }


  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

}
