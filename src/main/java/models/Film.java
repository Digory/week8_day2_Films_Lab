package models;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {
    private String title;
    private Director director;
    private int ageRating;
    private int id;

    public Film(){

    }

    public Film(String title, Director director, int ageRating) {
        this.title = title;
        this.director = director;
        this.ageRating = ageRating;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Column(name = "age_rating")
    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
}
