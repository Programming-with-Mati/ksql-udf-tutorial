package com.programmingwithmati.ksql.udf.twitter;

import java.util.Objects;

public class Tweet {
  private String id;

  private String text;
  private String user;

  public Tweet() {}
  public Tweet(String id, String text, String user) {
    this.id = id;
    this.text = text;
    this.user = user;
  }


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Tweet tweet = (Tweet) o;
    return Objects.equals(id, tweet.id) && Objects.equals(user, tweet.user) && Objects.equals(text, tweet.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, text);
  }
}
