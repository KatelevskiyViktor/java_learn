package oop.sem7HW;

public class Cinema {
    int id;
    int directorId;
    String name;
    int genreId;
    int producerId;

    public Cinema(int cinemaId, String name, int genreId, int directorId, int producerId) {
        this.id = cinemaId;
        this.directorId = directorId;
        this.producerId = producerId;
        this.name = name;
        this.genreId = genreId;
    }
}
