package Skills;

import Persons.AbsPerson;
import Things.Sitable;

public class SitDownSkill implements Skill {
    private Sitable place;
    public SitDownSkill(Sitable place) {
        this.place = place;
    }
    @Override
    public void exec(AbsPerson person) {
        place.SitDown(person);
        System.out.printf("%s сел на %s\n", person.name, place.getName());
    };
}
