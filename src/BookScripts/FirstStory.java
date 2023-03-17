package BookScripts;

import Things.*;
import Persons.*;

public class FirstStory implements BookScript {
    public void exec() {
        Location Moon = new Location("Обратная сторона Луны");
        Location StarAndPlanet = new Location("огромные планеты и звезды");
        Location Korotishki = new Location("Коротышки");
        Person korotishka1 = new Person("Коротышка1");
        Person korotishka2 = new Person("Коротышка2");
        Person korotishkaN = new Person("КоротышкаN");
        Korotishki.persons.add(korotishka1);
        Korotishki.persons.add(korotishka2);
        Korotishki.persons.add(korotishkaN);
        StarAndPlanet.things.add(Korotishki);
        Moon.things.add(StarAndPlanet);
        System.out.println(Moon.toString());
    }
}
