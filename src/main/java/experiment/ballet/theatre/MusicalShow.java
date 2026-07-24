package experiment.ballet.theatre;

import java.util.List;

public class MusicalShow extends Show {

    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, List<Actor> listOfActors,
                        Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }
}
