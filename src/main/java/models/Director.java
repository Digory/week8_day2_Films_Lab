package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director {

    private String name;
    private int id;
    private List<Film> directedFilms;

    public Director(){

    }

    public Director(String name) {
        this.name = name;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    public List<Film> getDirectedFilms() {
        return directedFilms;
    }

    public void setDirectedFilms(List<Film> directedFilms) {
        this.directedFilms = directedFilms;
    }
}
