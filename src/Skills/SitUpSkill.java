package Skills;

import Persons.AbsPerson;
import Things.Sitable;

public class SitUpSkill implements Skill {
    private Sitable place;
    public SitUpSkill(Sitable place) {
        this.place = place;
    }
    @Override
    public void exec(AbsPerson person) {
        place.SitUp(person);
        System.out.printf("%s встал %s\n", person.name, place.getName());
    };

}
