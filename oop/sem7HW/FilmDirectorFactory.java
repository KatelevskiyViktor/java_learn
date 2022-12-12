package oop.sem7HW;

public class FilmDirectorFactory {
    int count = 1;

    public Director getFilmDirector(String name) {
        Director fd = new Director();
        fd.id = count++;
        fd.titleName = name;
        return fd;
    }
}
