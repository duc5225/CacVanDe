package com.example.cacvande;

import android.media.Image;

public class Lesson {
  private String name;
  private int imageRsc;

  public Lesson(String name, int imageRsc) {
    this.name = name;
    this.imageRsc = imageRsc;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getImage() {
    return imageRsc;
  }

  public void setImage(int image) {
    this.imageRsc = image;
  }
}
