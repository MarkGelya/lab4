package Skills;

import Persons.AbsPerson;
import Things.*;

public class WashUpSkill implements Skill {
    private Thing thing;
    public WashUpSkill(Thing thing) {
        this.thing = thing;
    }
    public void exec(AbsPerson person) throws RuntimeException {
        System.out.println(person.name + " умылся.");
    };
}
