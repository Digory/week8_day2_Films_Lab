import db.DBHelper;
import models.Director;
import models.Film;

public class Runner {

    public static void main(String[] args) {

        Director directorPeter = new Director("Peter Jackson");
        DBHelper.save(directorPeter);
        Film film1 = new Film("Hobbit", directorPeter, 12);
        DBHelper.save(film1);
        film1.setTitle("Lord of the Rings");
        DBHelper.update(film1);
        directorPeter.setName("Peter Smackson");
        DBHelper.update(directorPeter);
    }

}
