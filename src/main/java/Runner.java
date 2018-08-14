import db.DBHelper;
import models.Director;
import models.Film;
import models.GenreType;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Calendar timeNow = Calendar.getInstance();
        Date date = timeNow.getTime();

        Director directorPeter = new Director("Peter Jackson");
        DBHelper.save(directorPeter);

        Film film1 = new Film("Hobbit", directorPeter, 12, GenreType.COMEDY,2018, 1, 13);
        Film film2 = new Film("Hobbit 2", directorPeter, 12, GenreType.FANTASY, 2016, 2, 3);
        DBHelper.save(film1);
        DBHelper.save(film2);
        film1.setTitle("Lord of the Rings");
        DBHelper.update(film1);
        directorPeter.setName("Peter Smackson");
        DBHelper.update(directorPeter);
//        DBHelper.delete(film2);
        Director foundDirector = DBHelper.findById(Director.class, directorPeter.getId());

        List<Film> foundFilms = DBHelper.getAll(Film.class);
    }

}
