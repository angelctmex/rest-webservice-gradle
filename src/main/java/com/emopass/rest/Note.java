package com.emopass.rest;

import javax.validation.constraints.NotNull;

public class Note {
  private int id;
  private String content;

  public Note(@NotNull int id, @NotNull String content) {
    this.id = id;
    this.content = content;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override public String toString() {
    return id + ". " + content;
  }

  @Override public boolean equals(Object obj) {
    if (obj instanceof Note) {
      Note other = (Note) obj;
      return other.id == id && other.content.equals(content);
    } else {
      return false;
    }
  }
}
