package experiment.ballet.theatre;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    public static void main(String[] args) {

        Actor actor1 = new Actor("Иван", "Петров", "male", 180);
        Actor actor2 = new Actor("Мария", "Смирнова", "female", 165);
        Actor actor3 = new Actor("Сергей", "Кузнецов", "male", 175);

        Director director1 = new Director("Олег", "Табаков", "male", 25);
        Director director2 = new Director("Анна", "Волкова", "female", 12);

        Person musicAuthor = new Person("Пётр", "Чайковский", "male");
        Person choreographer = new Person("Мариус", "Петипа", "male");

        Show drama = new Show("Ревизор", 120, director1, new ArrayList<>());

        Opera opera = new Opera("Пиковая дама", 180, director2, new ArrayList<>(),
                musicAuthor, "Однажды в Летнем саду...", 40);

        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, new ArrayList<>(),
                musicAuthor, "Принц Зигфрид встречает Одетту...", choreographer);

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Попытка добавить уже существующего в спектакле актёра
        drama.addActor(actor1);

        System.out.println("Актёры спектакля \"" + drama.getTitle() + "\":");
        drama.printActorsList();

        System.out.println("\nАктёры спектакля \"" + opera.getTitle() + "\":");
        opera.printActorsList();

        System.out.println("\nАктёры спектакля \"" + ballet.getTitle() + "\":");
        ballet.printActorsList();

        // Заменяем в опере актрису Смирнову на актёра из драмы (actor1)
        System.out.println("\nЗамена актёра в спектакле \"" + opera.getTitle() + "\"...");
        opera.replaceActor(actor1, "Смирнова");

        System.out.println("Актёры спектакля \"" + opera.getTitle() + "\" после замены:");
        opera.printActorsList();

        // Попытка заменить несуществующего актёра в балете
        System.out.println("\nПопытка замены несуществующего актёра в спектакле \"" + ballet.getTitle() + "\"...");
        ballet.replaceActor(actor2, "Иванов");

        System.out.println("\nРежиссёр спектакля \"" + opera.getTitle() + "\":");
        opera.printDirectorInfo();

        System.out.println("\nЛибретто оперы \"" + opera.getTitle() + "\":");
        opera.printLibretto();

        System.out.println("\nЛибретто балета \"" + ballet.getTitle() + "\":");
        ballet.printLibretto();
    }
}
