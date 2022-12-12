package oop.sem7HW;

import java.util.ArrayList;

class DB {
  ArrayList<Cinema> films = new ArrayList<>();
  ArrayList<Director> directors = new ArrayList<>();
  ArrayList<Genre> genres = new ArrayList<>();
  ArrayList<Producer> producers = new ArrayList<>();

  public void addDirector(Director director) {
    directors.add(director);
  }

  public void addProducer(Producer producer) {
    producers.add(producer);
  }
}
