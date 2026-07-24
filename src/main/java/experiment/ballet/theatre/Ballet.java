package experiment.ballet.theatre;

import java.util.List;

public class Ballet extends MusicalShow {

    private Person choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> listOfActors,
                  Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }
}
