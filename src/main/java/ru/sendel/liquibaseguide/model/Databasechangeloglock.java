package ru.sendel.liquibaseguide.model;


public class Databasechangeloglock {

  private long id;
  private String locked;
  private java.sql.Timestamp lockgranted;
  private String lockedby;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLocked() {
    return locked;
  }

  public void setLocked(String locked) {
    this.locked = locked;
  }


  public java.sql.Timestamp getLockgranted() {
    return lockgranted;
  }

  public void setLockgranted(java.sql.Timestamp lockgranted) {
    this.lockgranted = lockgranted;
  }


  public String getLockedby() {
    return lockedby;
  }

  public void setLockedby(String lockedby) {
    this.lockedby = lockedby;
  }

}
