package oop.sem7HW;

public class FilmProducerFactory {
    int count = 1;

    public Producer getFilmProducer(String name) {
        Producer fp = new Producer();
        fp.id = count++;
        fp.titleName = name;
        return fp;
    }
}
