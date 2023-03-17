package Skills;

import Persons.AbsPerson;
import Persons.Status;
import Things.IFood;

public class AfraidSkill implements Skill {
    public AfraidSkill() {

    }
    @Override
    public void exec(AbsPerson person) {
        person.setStatus(Status.AFRAID);
    }
}
