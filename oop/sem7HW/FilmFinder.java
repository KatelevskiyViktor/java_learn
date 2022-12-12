package oop.sem7HW;

public class FilmFinder {
    public FilmFinder() {
        init();
    }

    DB db;

    public DB getDb() {
        return db;
    }

    public String getAllInfoBy(int id) {
        Cinema c = db.films.get(id - 1);

        return String.format("#%d Film name: %s | Ganre: %s | Director: %s | Producer: %s",
                c.id,
                c.name,
                db.genres.get(c.genreId - 1).name,
                db.directors.get(c.directorId - 1).titleName,
                db.producers.get(c.producerId - 1).titleName);
    }

    DB init() {
        db = new DB();
        Cinema c1 = new Cinema(1, "Fight club", 1, 1, 1);
        Cinema c2 = new Cinema(2, "The girl with the dragon tattoo", 1, 1, 2);
        Cinema c3 = new Cinema(3, "Memento", 3, 3, 2);
        Cinema c4 = new Cinema(4, "Game", 3, 1, 4);

        db.films.add(c1);
        db.films.add(c2);
        db.films.add(c3);
        db.films.add(c4);

        db.genres.add(new Genre(1, "Drama"));
        db.genres.add(new Genre(2, "Thriller"));
        db.genres.add(new Genre(3, "Detective"));

        FilmDirectorFactory df = new FilmDirectorFactory();
        db.addDirector(df.getFilmDirector("David Andrew Leo Fincher"));
        db.addDirector(df.getFilmDirector("James Francis Cameron"));
        db.addDirector(df.getFilmDirector("Christopher Jonathan James Nolan"));
        db.addDirector(df.getFilmDirector("Todd Phillips"));

        FilmProducerFactory pf = new FilmProducerFactory();
        db.addProducer(pf.getFilmProducer("Art Linson"));
        db.addProducer(pf.getFilmProducer("Scott Rudin"));
        db.addProducer(pf.getFilmProducer("Jennifer Todd"));
        db.addProducer(pf.getFilmProducer("Steve Golin"));

        return db;
    }
}
