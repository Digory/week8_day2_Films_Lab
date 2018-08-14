import db.DBHelper;
import models.Director;

public class Runner {

    public static void main(String[] args) {

        Director director = new Director("Peter Jackson");
        DBHelper.save(director);
    }
}
